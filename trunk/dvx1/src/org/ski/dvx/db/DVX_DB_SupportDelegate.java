package org.ski.dvx.db;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;
import org.hibernate.Transaction;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.AuthorDAO;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.LanguageDAO;
import org.ski.dvx.hibernate.Movie;
import org.ski.dvx.hibernate.MovieDAO;
import org.ski.dvx.hibernate.MovieMenu;
import org.ski.dvx.hibernate.MovieMenuDAO;
import org.ski.dvx.hibernate.Description;
import org.ski.dvx.hibernate.DescriptionDAO;
import org.ski.dvx.hibernate.Path;
import org.ski.dvx.hibernate.PathDAO;
import org.ski.dvx.hibernate.Rating;
import org.ski.dvx.hibernate.RatingDAO;
import org.ski.dvx.hibernate.TransactionLog;
import org.ski.dvx.hibernate.User;
import org.ski.dvx.hibernate.UserDAO;
import org.ski.dvx.file.*;
import org.ski.dvx.*;

@javax.jws.WebService(targetNamespace = "http://db.dvx.ski.org/", serviceName = "DVX_DB_SupportService", portName = "DVX_DB_SupportPort")
public class DVX_DB_SupportDelegate {

	org.ski.dvx.db.DVX_DB_Support dVX_DB_Support = new org.ski.dvx.db.DVX_DB_Support();

	public void log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails) {
		dVX_DB_Support.log(movie, user, transactionType, transactionLevel,
				transactionDetails);
	}

	public Language getLanguage(String languageName) {
		return dVX_DB_Support.getLanguage(languageName);
	}

	public Movie getMovieHash(String movieHash) {
		return dVX_DB_Support.getMovieHash(movieHash);
	}

	public Movie getInsertMovieHash(String movieSbnNumber, String path) {
		return dVX_DB_Support.getInsertMovieHash(movieSbnNumber, path);
	}

	public void updateMovie(Movie movie) {
		dVX_DB_Support.updateMovie(movie);
	}

	public MovieMenu getMovieMenu(Author author, Language language,
			Movie movie, int menuID, int menuItem) {
		return dVX_DB_Support.getMovieMenu(author, language, movie, menuID,
				menuItem);
	}

	public boolean validateTimedEvent(Description description, Author author,
			Language language, Movie movie) {
		return dVX_DB_Support.validateTimedEvent(description, author, language,
				movie);
	}

	public boolean validateMenuItem(MovieMenu menu, Author author,
			Language language, Movie movie) {
		return dVX_DB_Support.validateMenuItem(menu, author, language, movie);
	}

	public User getInsertUser(String userHandle) {
		return dVX_DB_Support.getInsertUser(userHandle);
	}

	public Author getInsertAuthor(String userName) {
		return dVX_DB_Support.getInsertAuthor(userName);
	}

	public Author getInsertAuthor(User user) {
		return dVX_DB_Support.getInsertAuthor(user);
	}

	public void insertUpdateMovieNameClip(Author author, Language language,
			Movie movie, int menuNumber, int menuItem, Path path,
			String fileName) {
		dVX_DB_Support.insertUpdateMovieNameClip(author, language, movie,
				menuNumber, menuItem, path, fileName);
	}

	public void insertUpdateMovieMenu(Author author, Language language,
			Movie movie, int menuNumber, int menuItem, Path path,
			String fileName) {
		dVX_DB_Support.insertUpdateMovieMenu(author, language, movie,
				menuNumber, menuItem, path, fileName);
	}

	public Description insertUpdateTimeClip(Author author, Language language,
			Movie movie, int chapter, int timeOffset,
			int descriptionStartFrame, Path path, String fileName) {
		return dVX_DB_Support.insertUpdateTimeClip(author, language, movie,
				chapter, timeOffset, descriptionStartFrame, path, fileName);
	}

	public Path getInsertPath(Author author, String path) {
		return dVX_DB_Support.getInsertPath(author, path);
	}

	public String[] getLanguageList() {
		return dVX_DB_Support.getLanguageList();
	}

	public String[] getAuthorList() {
		return dVX_DB_Support.getAuthorList();
	}

	public User getUser(String userName) {
		return dVX_DB_Support.getUser(userName);
	}

	public Author getAuthor(String authorName) {
		return dVX_DB_Support.getAuthor(authorName);
	}

	public void dvx_log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails) {
		dVX_DB_Support.dvx_log(movie, user, transactionType, transactionLevel,
				transactionDetails);
	}

	public void deleteUser(User user) {
		dVX_DB_Support.deleteUser(user);
	}

	public void deleteAuthor(Author author) {
		dVX_DB_Support.deleteAuthor(author);
	}

	public void deleteMovie(Movie movie) {
		dVX_DB_Support.deleteMovie(movie);
	}

	public void deleteDescription(Description description) {
		dVX_DB_Support.deleteDescription(description);
	}

	public void deletePath(Path path) {
		dVX_DB_Support.deletePath(path);
	}

	public void deleteDescription(Author author, Language language,
			Movie movie, int chapter, int timeOffset, int frame) {
		dVX_DB_Support.deleteDescription(author, language, movie, chapter,
				timeOffset, frame);
	}

	public void deleteMovieMenu(MovieMenu movieMenu) {
		dVX_DB_Support.deleteMovieMenu(movieMenu);
	}

	public void deleteMovieMenus(MovieMenu movieMenu) {
		dVX_DB_Support.deleteMovieMenus(movieMenu);
	}

	public void rateDescription(User user, Language language, Movie movie,
			String ratingValue) {
		dVX_DB_Support.rateDescription(user, language, movie, ratingValue);
	}

	public User getUserLogin(String userHandle, String password) {
		return dVX_DB_Support.getUserLogin(userHandle, password);
	}

	public void updateUser(User user) {
		dVX_DB_Support.updateUser(user);
	}

	public User addUser(User user) {
		return dVX_DB_Support.addUser(user);
	}

}