package org.ski.dvx.app;

//import java.io.File;
//import java.util.Iterator;
import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
import org.ski.dvx.hibernate.User;
import org.ski.dvx.hibernate.UserDAO;

//import org.ski.dvx.hibernate.*;

// ***********************************************************************************

public class DVX_DB_Support {

	/**
	 * @param args
	 */
	private DVX_PlaySound playSound = null;
	private DVX_Network_Support dvx_network = null;
	private DVX_Logger dvx_logger;
	
	private DVX_Speak dvx_speak = null;
	
	private SessionFactory sessionFactory = null;

	private User user = null;
	private Author author = null;
	private Language language = null;

	
	public DVX_Speak getDvx_speak() {
		return dvx_speak;
	}

	public void setDvx_speak(DVX_Speak dvx_speak) {
		this.dvx_speak = dvx_speak;
	}

	public DVX_Logger getLogger() {
		return dvx_logger;
	}

	public void setLogger(DVX_Logger logger) {
		this.dvx_logger = logger;
	}

	// *****************************************	
	public Language getLanguage() {
		return language;
	}
	
	// *****************************************	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	// *****************************************	

	public User getUser() {
		return user;
	}
	
	// *****************************************	

	public void setUser(User user) {
		this.user = user;
	}
	
	// *****************************************	

	public Author getAuthor() {
		return author;
	}
	
	// *****************************************	

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	// *****************************************	

	
// ------------------------------------------------------------------------------------
	
	DVX_DB_Support()
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		dvx_logger = new DVX_Logger();
		dvx_network = new DVX_Network_Support();
		playSound = new DVX_PlaySound();
		setUser(getInsertUser(dvx_network.getIpAddress()));
		dvx_logger.dvx_log(	null, 
							getUser(), 
							DVX_Constants.TRANSACTION_TYPE_LOGIN, 
							DVX_Constants.TRANSACTION_LEVEL_INFO, 
							"Login user : " + 
							getUser().getUserName());
		setAuthor(getInsertAuthor(user));
		setLanguage(getLanguage ("English"));
//		logger.log(null, getUser(), "Language", "?what?", "Language : " + getLanguage());
		dvx_logger = new DVX_Logger();

	}
	
	public void log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails)
	{
		dvx_logger.dvx_log(movie, user, transactionType, transactionLevel, transactionDetails);
	}
	
	// ------------------------------------------------------------------------------------
		
	public Language getLanguage(String languageName) {
		// TODO Auto-generated method stub
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Language language = new Language();
		language.setLanguageName(languageName);
		
		LanguageDAO languageDao = new LanguageDAO();
		
		@SuppressWarnings("unchecked")
		List<Language> languageList = languageDao.findByExample(language);
		
		if (languageList.size()>0)
			return languageList.get(0);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(language);			
		tx.commit();
		
		return language;
	}

	Movie getMovieHash(String movieHash)
	{
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();
		Movie movie = new Movie();
//		movie.setMovieName(movieName);
		movie.setMovieSbnNumber(movieHash);
		
		MovieDAO movieDao = new MovieDAO();
		
		@SuppressWarnings("unchecked")
		List <Movie> movieList = movieDao.findByExample(movie);
		
		// movieDao.findByExample(movie);
//		findByExample(movie);
		if (movieList.size()>0)
		{
			return movieList.get(0);
		
		}
		return null;
	}
	
	Movie getInsertMovieHash(String path, String movieSbnNumber)
	{
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();
		Movie movie = getMovieHash(movieSbnNumber);
		if (movie!=null)
			return movie;
		movie = new Movie();
		
		DVX_File_Support.DVX_File_Support(movieSbnNumber);	// create the new paths...
		
		movie.setMovieSbnNumber(movieSbnNumber);
		String movieName = DVX_Get_Movie_Name_Google.getMovieName(path, movieSbnNumber);
		movie.setMovieName(movieName);		// default the movie name to movieSbnNumber

		DVX_PlaySound.playWav(DVX_Constants.ADDING_MOVIE_TO_DVX_DATABASE, false);

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(movie);
		tx.commit();

		session.close();

		return getMovieHash(movieSbnNumber);
	}

	void updateMovie(Movie movie)
	{
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(movie);
		tx.commit();

		session.close();

		
	}
	// ------------------------------------------------------------------------------------
		
	String getMenuURI(Author author, Language language, Movie movie, int menuID, int menuItem) // add language here...
	{
		 
//		String result = "";
		MovieMenu mm = new MovieMenu();
		
		System.out.println(movie.getMovieName() + " = " + menuID + " : " + menuItem);
		
		mm.setMenuItem(menuItem);
		mm.setMenuNumber(menuID);
		mm.setMenuActive(1);
		if (author!=null)
			mm.setAuthor(author);
		if (language!=null)
			mm.setLanguage(language);
		
//		mm.setMovie(movie);
//		mm.setMovie(movie);
		MovieMenuDAO mmDao = new MovieMenuDAO();
//		List mmDao.findByExample(mm); = mmDao.findByExample(mm);
		@SuppressWarnings("unchecked")
		List<MovieMenu> mmList = mmDao.findByExample(mm);
//		mmList = mmDao.findAll();
		System.out.println("List size = " + mmList.size());
		
		for (MovieMenu mmItem : mmList)
		{
			if (mmItem.getMovie().equals(movie))
			{
				return mmItem.getMenuUri();
			}
		}
		
//		result = mmList.get(0).getMenuUri();
		
		return null;
	}
	
	// ------------------------------------------------------------------------------------
		
//	void playSound(String filePath, boolean wait)
//	{
//		playSound.playClipWav(filePath, wait);
//	}
	
	// ------------------------------------------------------------------------------------
/*		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DVX_DB_Support ps = new DVX_DB_Support();
//		ps.doIt();

	}
*/	
	int lastChapter = -1;
	int lastOffset = 0;
	
// look to timed event and fire it if it exists
	void checkTimeEvent(Movie movie, Author author, Language language, int chapter, int offset, int startFrame)
	{
		
		System.out.println("Looking for " + movie.getMovieSbnNumber() + "-" +
				author.getUser().getUserId() + "-" + 
				language.getLanguageId() + "-" + 
				chapter + "-" + 
				offset + "-" + 
				startFrame + ".wav");
		if (chapter== lastChapter)	// last chapter 
			if (offset ==lastOffset)
				return;	// return if we did this one already...
		
		lastOffset 	= offset;
		lastChapter = chapter;
		
		DescriptionDAO descriptionDao = new DescriptionDAO();
		Description description = new Description();
		description.setMovie(movie);
		if (language.getLanguageId()!=0)			// for the ALL case
			description.setLanguage(language);
		if (author.getAuthorId()!=0)				// for the ALL case
			description.setAuthor(author);
		description.setDescriptionStartFrame(startFrame);
		
		description.setDescriptionStartTimeInt( offset);
		description.setDescriptionChapter(chapter);
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
		System.out.println(" checkTimeEvent list size = " + descriptionList.size());
		for (Description mmDescription : descriptionList)
		{
//			if (mmDescription.getMovie().equals(movie) && mmDescription.getAuthor().equals(author))
			{
				System.out.println("Found Clip : " + description.getDescriptionUri());
				
				DVX_PlaySound.playWav(	DVX_Constants.MOVIE_PATH + 
							movie.getMovieSbnNumber() + 
							DVX_Constants.MOVIE_DESCRIPTIONS_PATH + 
							mmDescription.getDescriptionUri(), false);
			}
		}
	}
	
	// ------------------------------------------------------------------------------------
		
	User getInsertUser(String userName)
	{
		User user = new User();
		
		user.setUserName(userName);
		user.setUserActive(true);
		user.setUserType(DVX_Constants.USER_TYPE_USER);
		
		UserDAO userDao = new UserDAO();
		
		@SuppressWarnings("unchecked")
		List<User> users = userDao.findByExample(user);
		
		if (users.size()>0)
		{
			return users.get(0);
		}
		else
		{
//			userDao.attachClean(user);
//			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();
			
			session.saveOrUpdate(user);
			tx.commit();

			session.close();
			
		}

		return user;
	}
	
	// ------------------------------------------------------------------------------------
		
	Author getInsertAuthor(User user)
	{
		Author author = new Author();
		author.setUser(user);
		AuthorDAO authorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authors = authorDao.findByExample(author);
		if (authors.size()>0)
		{
			author = authors.get(0);
			return author;
		}
		else
		{
//			authorDao.attachClean(author);
//			if(sessionFactory== null)
//				sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(author);
			tx.commit();

			session.close();
		}
		
		return author;
		
	}
	
	// ------------------------------------------------------------------------------------
		
	void insertUpdateMovieNameClip(Author author , Language language, Movie movie, int menuNumber, int menuItem, Path path, String fileName)

	{
		// for another day.. clone of below ...
	}
	
	// ------------------------------------------------------------------------------------
		
	void insertUpdateMovieMenu(Author author , Language language, Movie movie, int menuNumber, int menuItem, Path path, String fileName)
	{
		int versionNumber = 1;
		MovieMenu movieMenu = new MovieMenu();
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		movieMenu.setMovie(movie);
		movieMenu.setMenuActive(1);
		movieMenu.setMenuNumber(menuNumber);
		movieMenu.setMenuItem(menuItem);
		movieMenu.setAuthor(author);
		movieMenu.setLanguage(language);
//		movieMenu.setPath();	// GCA to be implemented later
		
		MovieMenuDAO movieMenuDao = new MovieMenuDAO();
		
		@SuppressWarnings("unchecked")
		List<MovieMenu> movieMenuList = movieMenuDao.findByExample(movieMenu);
// load the existing one... deactivate it...		
		if (movieMenuList.size()>0)	// it exists..
		{
			MovieMenu movieMenuOld = movieMenuList.get(0);
			movieMenuOld.setMenuActive(0);
			movieMenuOld.setMenuUri(movieMenuOld.getMenuUri() + movieMenuOld.getMenuVersion());	// rename old file name with suffix...
			
			movieMenu.setMenuVersion(movieMenuOld.getMenuVersion() + 1);	// bump the version
			versionNumber = movieMenuOld.getMenuVersion() +1;
			File oldFile = new File(DVX_Constants.MOVIE_PATH + 
					movie.getMovieSbnNumber() + 
					DVX_Constants.MOVIE_MENUS_PATH + 
					movieMenuOld.getMenuUri());

			oldFile.renameTo(new File(DVX_Constants.MOVIE_PATH + 
					movie.getMovieSbnNumber() + 
					DVX_Constants.MOVIE_MENUS_PATH + 
					movieMenuOld.getMenuUri()+"."+movieMenuOld.getMenuVersion()));

			session.saveOrUpdate(movieMenuOld);			
		}	// create new one...
		movieMenu.setMenuUri(movie.getMovieSbnNumber() + 
				DVX_Constants.HYPHEN + +
				author.getAuthorId() + 
				DVX_Constants.HYPHEN + + 
				menuNumber + 
				DVX_Constants.HYPHEN + + 
				menuItem + 
				DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV );
//		movieMenu.setAuthor(author);
//		movieMenu.setLanguage(language);
		movieMenu.setDescription(	movie.getMovieName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
									author.getUser().getUserName()  + DVX_Constants.SPACE_HYPHEN_SPACE +
									"Menu ID " + menuNumber + DVX_Constants.SPACE_HYPHEN_SPACE + 
									"Item ID " + menuItem );
		movieMenu.setMenuVersion(versionNumber);	// bump the version
		movieMenu.setPath(path);
		
		session.saveOrUpdate(movieMenu);
		tx.commit();
//		
	}
	
	// ------------------------------------------------------------------------------------
		
	void insertUpdateTimeClip(Author author , Language language, Movie movie, int chapter, int timeOffset, int descriptionStartFrame, Path path, String fileName)
	{
		Description description = new Description();
		
		description.setMovie(movie);
		description.setDescriptionActive(1);
		
		description.setDescriptionStartTimeInt(timeOffset);
		description.setDescriptionChapter(chapter);
		description.setDescriptionStartFrame(descriptionStartFrame);
		description.setDescriptionTypeEnum(DVX_Constants.DESCRIPTION_TYPE_AUDIO_DESCRIPTION);
		
		description.setAuthor(author);
		description.setLanguage(language);
//		movieMenu.setPath();	// GCA to be implemented later
		
		DescriptionDAO descriptionDao = new DescriptionDAO();
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
// load the existing one... deactivate it...		
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if (descriptionList.size()>0)	// it exists..
		{
			Description descriptionOld = descriptionList.get(0);
			descriptionOld.setDescriptionActive(0);
			descriptionOld.setDescriptionUri(descriptionOld.getDescriptionUri() + descriptionOld.getDescriptionVersion());	// rename old file name with suffix...
			descriptionOld.setDescriptionVersion(descriptionOld.getDescriptionVersion() + 1);	// bump the version
			
			File oldFile = new File(DVX_Constants.MOVIE_PATH + 
					movie.getMovieSbnNumber() + 
					DVX_Constants.MOVIE_MENUS_PATH + 
					descriptionOld.getDescriptionUri());

			oldFile.renameTo(new File(DVX_Constants.MOVIE_PATH + 
					movie.getMovieSbnNumber() + 
					DVX_Constants.MOVIE_MENUS_PATH + 
					descriptionOld.getDescriptionUri()+"."+descriptionOld.getDescriptionVersion()));

			session.saveOrUpdate(descriptionOld);			
		}	// create new one...
		description.setDescriptionUri(movie.getMovieSbnNumber() + 
				DVX_Constants.HYPHEN + +
				author.getAuthorId() + 
				DVX_Constants.HYPHEN + +
				language.getLanguageId() + 
				DVX_Constants.HYPHEN + + 
				chapter + 
				DVX_Constants.HYPHEN + + 
				timeOffset + 
				DVX_Constants.HYPHEN + + 
				descriptionStartFrame + 				
				DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV );
//		movieMenu.setAuthor(author);
//		movieMenu.setLanguage(language);
		description.setDescriptionLong(	movie.getMovieName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
									author.getUser().getUserName()  + DVX_Constants.SPACE_HYPHEN_SPACE +
									"Chapter ID " + chapter + DVX_Constants.SPACE_HYPHEN_SPACE + 
									"Item ID " + timeOffset + " (ms)"  );
		description.setPath(path);
		
		session.saveOrUpdate(description);
		tx.commit();
		
//		
	}
	
	// ------------------------------------------------------------------------------------
		
	public Path getInsertPath(Author author , String path)	// may want to add author... GCA
	{
		Path resultPath = new Path();
		resultPath.setPathPrefix(path);
		
		PathDAO pathDao = new PathDAO();
		@SuppressWarnings("unchecked")
		List<Path> pathList = pathDao.findByExample(resultPath);
		if (pathList.size()>0)
			return pathList.get(0);
		resultPath.setAuthor(author);
//		if(sessionFactory== null)
//			sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(resultPath);			
		tx.commit();
		
		return resultPath;
	}
	
	// ------------------------------------------------------------------------------------
		
	String [] getLanguageList()
	{
		
		LanguageDAO languageDao = new LanguageDAO();
		@SuppressWarnings("unchecked")
		List<Language> languageList = languageDao.findAll();
		String[] languages = new String[languageList.size()];
		for (int i=0; i<languageList.size();i++)
		{
			languages[i]= languageList.get(i).getLanguageName();
		}
		return languages;
	}
	
	// ------------------------------------------------------------------------------------
		
	String [] getAuthorList()
	{
		
		AuthorDAO arthorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authorList = arthorDao.findAll();
		String[] authors = new String[authorList.size()];
		for (int i=0; i<authorList.size();i++)
		{
			authors[i]= authorList.get(i).getUser().getUserName();
		}
		return authors;
	}
	
	// ------------------------------------------------------------------------------------
		
	User getUser(String userName)
	{
		User user = new User();
		user.setUserName(userName);
		
		UserDAO userDao = new UserDAO();
		List<User> userList = userDao.findByExample(user);
		if (userList.size()>0)
			return userList.get(0);
		return null;
	}
	
	// ------------------------------------------------------------------------------------
		
	Author getAuthor(String authorName)
	{
		Author author = new Author();
		User user = getUser(authorName);
		author.setUser(user);
		AuthorDAO arthorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authorList = arthorDao.findByExample(author);
		for (Author mmAuthor : authorList)
		{
			if (mmAuthor.getUser().getUserName().equals(authorName))
			{
				return mmAuthor ;
			}
		}
		return null;
		
	}
	
	// ------------------------------------------------------------------------------------
		
}


