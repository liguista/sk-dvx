import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.googlecode.sardine.DavResource;
import com.googlecode.sardine.Sardine;
import com.googlecode.sardine.SardineFactory;

public class DescriptionCache implements Runnable {
	
	final static int WEB_DAV_BUFFER_SIZE = 64 * 1024;	
	final static int DESCRIPTION_CHANNELS = 2;
	final static int DESCRIPTION_SAMPLE_SIZE = 2;	// 16 bits per sample
	final static int DESCRIPTION_SAMPLERATE = 48000;
	
	static List<DavResource> davCacheList = null;

	
	public static int getLoadcount() {
		return loadCount;
	}
	static int loadCount = 0 ;
	
	final static int MAX_LOAD_COUNT = 10;
	
	byte[] descriptionBuffer;

	String remoteURL;
	
	String localURL;
	
	boolean isValid;
	
	boolean isCached;
	
	boolean isLoaded;
	
	boolean isLoadingRemote;
	
	boolean isLoadingLocal;
	
	long length = 0;
	
	int index = 0;
	
	int max = 0;
	
	long fileSize = 0;
	float sampleDuration = 0;
	
	String movieSBN = "";
	String author = "";
	String language = "";
	int startTime = 0;
	int statrtFrame = 0;
	
	Date created  = null;
	Date modified = null;

	public byte[] getDescriptionBuffer() {
		return descriptionBuffer;
	}

	public void setDescriptionBuffer(byte[] descriptionBuffer) {
		this.descriptionBuffer = descriptionBuffer;
	}

	void loadDescription()
	{
//		descriptionBuffer = new  byte[(int)fileSize];
		try
		{
	      FileInputStream file = new FileInputStream (localURL);
	       DataInputStream in = new DataInputStream (file);
	       descriptionBuffer = new byte[in.available ()];
	       in.readFully (descriptionBuffer);
	       in.close ();
	       
	       isLoaded = true;
	       
		}
		catch (Exception ex)
		{
			System.err.println("Exception in loadDescription() - " + ex);
			System.err.println("Remote - " + remoteURL);
			isLoaded = false;
		}
	}
	
	DescriptionCache(int index, int max, String remoteURL)
	{
		this.index = index;
		this.max = max;
		this.remoteURL = remoteURL;
		setLocalUrl(remoteURL);
		createLocalPath(localURL);
		davCache(remoteURL, false);
	}
	
	void setAttributes(String movieSBN, String author, String language, int startTime, int startFrame)
	{
		this.movieSBN = movieSBN;
		this.author = author;
		this.language = language;
		this.startTime = startTime;
		this.statrtFrame = startFrame;
	}
	
	private void createLocalPath(String remoteURL) {
		int index = remoteURL.lastIndexOf("/");
		remoteURL = remoteURL.substring(0,index);
		// TODO Auto-generated method stub
		StringTokenizer st = 
		       new StringTokenizer
		           (remoteURL, "/");	
		String basePath = "";
		while(st.hasMoreTokens())
		{
		  String s=st.nextToken();
//		  System.out.println(s);
		  basePath+= s + "/";
		  File file = new File(basePath);
		  if (!file.exists())
		  {
			  file.mkdir();
		  }
		 }
	}

	private void setLocalUrl(String remoteURL2) {
		// TODO Auto-generated method stub
		localURL = remoteURL;
		int mediaIndex = localURL.indexOf("media");
		if (mediaIndex!=-1)
			localURL = localURL.substring(mediaIndex);
	}

	public boolean isLoadingRemote() {
		return isLoadingRemote;
	}

	public void setLoadingRemote(boolean isLoadingRemote) {
		this.isLoadingRemote = isLoadingRemote;
	}

	public boolean isLoadingLocal() {
		return isLoadingLocal;
	}

	public void setLoadingLocal(boolean isLoadingLocal) {
		this.isLoadingLocal = isLoadingLocal;
	}

	public String getRemoteURL() {
		return remoteURL;
	}

	public void setRemoteURL(String remoteURL) {
		this.remoteURL = remoteURL;
	}

	public String getLocalURL() {
		return localURL;
	}

	public void setLocalURL(String localURL) {
		this.localURL = localURL;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isCached() {
		return isCached;
	}

	public void setCached(boolean isCached) {
		this.isCached = isCached;
	}

	public boolean isLoaded() {
		return isLoaded;
	}

	public void setLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}
	
	
	void dumpCache()
	{
		Iterator<DavResource> it = davCacheList.iterator();
		while (it.hasNext())
		{
			DavResource davr = (DavResource)it.next();
			System.out.println("DAV Resource : " + davr.getName() + " - " + davr.getModified() + " - "  + davr.getContentLength());
		}
	}
	boolean cacheCompare (String path, Date date, long size)
	{
		int lastSlash = path.lastIndexOf("/");
		String pathPrefix = path.substring(0, lastSlash);
		String fileName = path.substring(lastSlash+1);
		return cacheCompare(pathPrefix, fileName, date, size);
	}

	Date cacheGetModifiedDate (String path)
	{
		int lastSlash = path.lastIndexOf("/");
		String pathPrefix = path.substring(0, lastSlash);
		String fileName = path.substring(lastSlash+1);
		return cacheGetModifiedDate(pathPrefix, fileName);
	}

	Date cacheGetModifiedDate(String path, String file)
	{
		Date date = null;
		Iterator<DavResource> it = davCacheList.iterator();
		while (it.hasNext())
		{
			DavResource davr = (DavResource)it.next();
			if (davr.getName().equalsIgnoreCase(file))
			{
				return davr.getModified();
			}
		}		
		return date;
	}
	
	boolean cacheCompare (String path, String file, Date date, long size)
	{
		Iterator<DavResource> it = davCacheList.iterator();
		while (it.hasNext())
		{
			DavResource davr = (DavResource)it.next();
			if (davr.getName().equalsIgnoreCase(file))
			{
				if (size==davr.getContentLength())
					if (date.compareTo(davr.getModified())==0)
						return true;
			}
		}
		return false;
	}
	void davCache(String davCacheUrl, boolean flush)
	{
		if (flush)
			davCacheList = null;
		if (davCacheList==null)
		{
			Sardine sardine = SardineFactory.begin("username", "password");
			int index = davCacheUrl.lastIndexOf("/");
			davCacheUrl = davCacheUrl.substring(0,index);
			try
			{
				davCacheList = sardine.getResources(davCacheUrl);
				dumpCache();
			}
			catch (Exception ex)
			{
				System.err.println("Exception = davCache " + ex);
			}
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		loadCount++;	

		{
//			byte[] data = FileUtils.readFileToByteArray(new File("/file/on/disk"));
			
			try
			{
				boolean fileNeedsUpdate = true;

				
				File file = new File(localURL);
				if (file.exists())
				{

					if ( cacheCompare(localURL, new Date (file.lastModified()), file.length()))
					{
						fileNeedsUpdate = false;	
//						System.out.println("Cached = true");
					}
				}
				
				if (fileNeedsUpdate)
				{
					Sardine sardine = SardineFactory.begin("username", "password");
					InputStream is = sardine.get(remoteURL);
					System.out.println("Cached = false - " + remoteURL);
					FileOutputStream fos = new FileOutputStream(localURL);
					byte[] buffer = new byte[WEB_DAV_BUFFER_SIZE];
					int len = is.read(buffer);
					while (len != -1) {
						fos.write(buffer, 0, len);
					    len = is.read(buffer);
					    try
					    {
					    	this.wait(10);
					    }
					    catch (Exception ex)
					    {
	//				    	System.err.print("Exception loading " + remoteURL);
	//				    	isCached = false;
					    }
					}
					fos.flush();
					fos.close();
					is.close();
					file = new File(localURL);
					file.setLastModified(cacheGetModifiedDate(localURL).getTime());
				}
				file = new File(localURL);
				
				fileSize = file.length();
				// this is a hack number... number of samples @ sample rate (48khz...)
//				float temp =(DESCRIPTION_CHANNELS * DESCRIPTION_SAMPLE_SIZE * DESCRIPTION_SAMPLERATE);
				sampleDuration = fileSize / (float)(DESCRIPTION_CHANNELS * DESCRIPTION_SAMPLE_SIZE * DESCRIPTION_SAMPLERATE);
				if (fileNeedsUpdate)
					System.out.println("Loaded - " + remoteURL + " - Duration = " + sampleDuration);
				isCached = true;
			}
			catch (Exception ex)
			{
				System.err.println("Exception - " + ex);
				isCached = false;
				isLoaded = false;
			}
		}
		loadCount--;

	}
}
