/**
 * 
 */
package org.ski.dvx.ws;

/**
 * @author Greg
 *
 */
public class MovieDescription  implements java.io.Serializable {
	
	int index; 	
	String sbn; 	
	String movieName;	
	String language;	
	String author;	
	int version;	
	int startTime;
	int startFrame;
	String uri;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getSbn() {
		return sbn;
	}
	public void setSbn(String sbn) {
		this.sbn = sbn;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getStartFrame() {
		return startFrame;
	}
	public void setStartFrame(int startFrame) {
		this.startFrame = startFrame;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

	MovieDescription()
	{
	
	}
	
	MovieDescription (	int index, 	
						String sbn, 	
						String movieName,	
						String language,	
						String author,	
						int version,	
						int startTime,
						int startFrame,
						String uri
		)
		{
			this.index = index; 	
			this.sbn = sbn;	
			this.movieName = movieName;	
			this.language = language;	
			this.author = author;	
			this.version = version;	
			this.startTime = startTime;
			this.startFrame = startFrame;
			this.uri = uri;
			
		}
		
	
}
