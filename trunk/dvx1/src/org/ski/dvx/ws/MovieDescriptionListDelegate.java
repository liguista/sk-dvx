package org.ski.dvx.ws;

import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Description;
import org.ski.dvx.hibernate.DescriptionDAO;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.Path;
import org.ski.dvx.hibernate.User;
import java.util.*;

@javax.jws.WebService(targetNamespace = "http://ws.dvx.ski.org/", serviceName = "MovieDescriptionListService", portName = "MovieDescriptionListPort")
public class MovieDescriptionListDelegate {

	org.ski.dvx.ws.MovieDescriptionList movieDescriptionList = new org.ski.dvx.ws.MovieDescriptionList();

	public String getSbnNumber() {
		return movieDescriptionList.getSbnNumber();
	}

	public void setSbnNumber(String sbnNumber) {
		movieDescriptionList.setSbnNumber(sbnNumber);
	}

	public List<MovieDescription> getDescriptionList() {
		return movieDescriptionList.getDescriptionList();
	}

}