import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.tools.ant.util.FileUtils;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescription;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListDelegate;
import org.ski.dvx.ws.moviedescriptionlist.MovieDescriptionListService;

import com.googlecode.sardine.Sardine;
import com.googlecode.sardine.SardineFactory;


public class MediaCache {

	/**
	 * @param args
	 */
	
	
	List descriptionList = new ArrayList();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MediaCache mc = new MediaCache();
		
		mc.doIt();
		
	}

	private void doIt() {
		// TODO Auto-generated method stub
		
		MovieDescriptionListService mdls = new MovieDescriptionListService();
		
		MovieDescriptionListDelegate mdld = mdls.getMovieDescriptionListPort();
		
		mdld.setSbnNumber("e7cf6917");
		
		List<MovieDescription> movieDescriptionList = mdld.getDescriptionList();
		
		Iterator itr = movieDescriptionList.iterator();
		int count = movieDescriptionList.size();
		int index =0;
		MovieDescription movieDescription;
		while (itr.hasNext())
		{
			movieDescription = (MovieDescription)itr.next();


			DescriptionCache mc = new DescriptionCache(index, count, movieDescription.getUri());
			mc.setAttributes(movieDescription.getSbn(), movieDescription.getAuthor(), movieDescription.getLanguage(), 
					movieDescription.getStartTime(), movieDescription.getStartFrame());
			
//			mc.run();
			Thread thread = new Thread(mc);

			// Start the thread
//			System.out.println();
			thread.start();

			descriptionList.add(mc);
		}	
		int lastIndex = 0;
		while ( DescriptionCache.getLoadcount()>0)
		{
			if (lastIndex!= DescriptionCache.getLoadcount())
			{
				System.out.println(">>>Thread Count = " + DescriptionCache.getLoadcount());
				lastIndex = DescriptionCache.getLoadcount();
			}
		}
		
		int dCount = descriptionList.size();
/*		Iterator it = descriptionList.iterator();
		
		while (it.hasNext())
		{
			DescriptionCache dc = (DescriptionCache)it.next();
			
			dc.loadDescription();
			System.out.print("\r" + dCount-- + "   ");
			
		} */
		
	}

}
