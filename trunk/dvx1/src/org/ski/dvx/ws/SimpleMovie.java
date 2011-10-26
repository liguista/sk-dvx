package org.ski.dvx.ws;

public class SimpleMovie implements java.io.Serializable {

	int index;
	String sbnNumber;
	String movieName;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getSbnNumber() {
		return sbnNumber;
	}

	public void setSbnNumber(String sbnNumber) {
		this.sbnNumber = sbnNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	
	public SimpleMovie()
	{
		
	}

}
