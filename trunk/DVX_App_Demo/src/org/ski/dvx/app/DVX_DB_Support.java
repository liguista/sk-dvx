/*
	Project:		Windows DVX Player/Editor
	
	File Name:		

	Designer:		Josh Miele

	Author:			Greg Ames

	Contributors:	Owen Edwards
					
	Created:		September 10, 2011
	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					© 2011
					All Rights Reserved
					
					http://www.ski.org/
					
					The Smith-Kettlewell Eye Research Institute
					2318 Fillmore Street 
					San Francisco, CA  94115 
					415-345-2000  
				 
	Notice:			Parts of this project are based on Open Source 
					and/or Public Domain Code. Please use good judgment 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

package org.ski.dvx.app;

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

// TODO: Auto-generated Javadoc
// ***********************************************************************************

/**
 * The Class DVX_DB_Support.
 */
public class DVX_DB_Support {

	/** The dvx_player. */
	DVX_Player dvx_player;
	
	Description lastDescription;

	
// ------------------------------------------------------------------------------------
	
	/**
 * Instantiates a new dV x_ d b_ support.
 *
 * @param dvx_player the dvx_player
 * @param defaultAuthor the default author
 */
public DVX_DB_Support(DVX_Player dvx_player)
	{
		this.dvx_player = dvx_player;
	}
	
// ------------------------------------------------------------------------------------

	/**
 * Log.
 *
 * @param movie the movie
 * @param user the user
 * @param transactionType the transaction type
 * @param transactionLevel the transaction level
 * @param transactionDetails the transaction details
 */
public void log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails)
	{
		dvx_log(movie, user, transactionType, transactionLevel, transactionDetails);
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the language.
	 *
	 * @param languageName the language name
	 * @return the language
	 */
	public Language getLanguage(String languageName) {
		// TODO Auto-generated method stub
		
		Language language = new Language();
		language.setLanguageName(languageName);
		
		LanguageDAO languageDao = new LanguageDAO();
		
		@SuppressWarnings("unchecked")
		List<Language> languageList = languageDao.findByExample(language);
		
		if (languageList.size()>0)
			return languageList.get(0);
		
		Transaction tx = languageDao.getSession().beginTransaction();
		languageDao.save(language);
		tx.commit();
		
		return getLanguage(languageName);
	}

	/**
	 * Gets the movie hash.
	 *
	 * @param movieHash the movie hash
	 * @return the movie hash
	 */
	public Movie getMovieHash(String movieHash)
	{
		Movie movie = new Movie();
		movie.setMovieSbnNumber(movieHash);
		
		MovieDAO movieDao = new MovieDAO();
		
		@SuppressWarnings("unchecked")
		List <Movie> movieList = movieDao.findByExample(movie);
		
		// movieDao.findByExample(movie);
//		findByExample(movie);
		if (movieList.size()>0)
			return movieList.get(0);		
		return null;
	}
	
	/**
	 * Gets the insert movie hash.
	 *
	 * @param movieSbnNumber the movie sbn number
	 * @param path the path
	 * @return the insert movie hash
	 */
	public Movie getInsertMovieHash(String movieSbnNumber, String path)
	{
		Movie movie = getMovieHash(movieSbnNumber);
		if (movie!=null)
			return movie;
		movie = new Movie();
		
		DVX_File_Support.DVX_File_Support(movieSbnNumber);	// create the new paths...
		
		movie.setMovieSbnNumber(movieSbnNumber);
		String movieName = DVX_Get_Movie_Name_Google.getMovieName(path, movieSbnNumber);
		movie.setMovieName(movieName);		// default the movie name to movieSbnNumber

//		DVX_PlaySound.playWav(DVX_Constants.ADDING_MOVIE_TO_DVX_DATABASE, false);
		dvx_player.getDvxSpeak().speak("Adding Movie To DVX Database");
				
		MovieDAO movieDao = new MovieDAO();

		Transaction tx = movieDao.getSession().beginTransaction();
		movieDao.save(movie);
		tx.commit();

		return getMovieHash(movieSbnNumber);
	}

	/**
	 * Update movie.
	 *
	 * @param movie the movie
	 */
	public void updateMovie(Movie movie)
	{
		MovieDAO movieDao = new MovieDAO();
		Transaction tx = movieDao.getSession().beginTransaction();
		movieDao.merge(movie);
		tx.commit();
		
	}
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the menu uri.
	 *
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @param menuID the menu id
	 * @param menuItem the menu item
	 * @return the menu uri
	 */
	public MovieMenu getMovieMenu(Author author, Language language, Movie movie, int menuID, int menuItem) // add language here...
	{
		 
		MovieMenu movieMenu = new MovieMenu();
		
		System.out.println(movie.getMovieName() + " = " + menuID + " : " + menuItem);
		
		movieMenu.setMenuItem(menuItem);
		movieMenu.setMenuNumber(menuID);
		movieMenu.setMenuActive(1);
//		if (author!=null)
		movieMenu.setAuthor(author);
//		if (language!=null)
		movieMenu.setLanguage(language);
		
//		mm.setMovie(movie);
//		mm.setMovie(movie);
		MovieMenuDAO mmDao = new MovieMenuDAO();
//		List mmDao.findByExample(mm); = mmDao.findByExample(mm);
		@SuppressWarnings("unchecked")
		List<MovieMenu> mmList = mmDao.findByExample(movieMenu);
//		mmList = mmDao.findAll();
		System.out.println("List size = " + mmList.size());
		
		for (MovieMenu mmItem : mmList)
		{
			if (validateMenuEvent(mmItem,  author,  language,  movie))
			{
				return mmItem;
			}
		}
		
//		result = mmList.get(0).getMenuUri();
		
		return null;
	}
		
	/** The last chapter. */
	int lastChapter = -1;
	
	/** The last offset. */
	int lastOffset = 0;
//	
	/**
 * Validate timed event.
 *
 * @param description the description
 * @param author the author
 * @param language the language
 * @param movie the movie
 * @return true, if successful
 */
public boolean validateTimedEvent(Description description, Author author, Language language, Movie movie)
	{		
	
	if (description==null)
	{
		System.out.println("********* Description is null ***********");
		return false;
		
	}
		// validate author if not all		
		if (author.getAuthorId()!=DVX_Constants.DVX_AUTHOR_ALL_ID)	// author all
		{
			int a = description.getAuthor().getAuthorId();
			int b = author.getAuthorId();
			if (a!=b)
			{
//				int a = description.getAuthor().getAuthorId();
//				int b = author.getAuthorId();
				boolean flag = a==b;
				System.out.println("validateTimedEvent Author != " + description.getAuthor().getAuthorId() + " - " + author.getAuthorId());
				return false;
			}
		}
		
		// validate language if not all		
		if (language.getLanguageId()!=DVX_Constants.DVX_LANGUAGE_ALL_ID)	// author all
		{
			int a = description.getLanguage().getLanguageId();
			int b = language.getLanguageId();
			if (a!=b)
			{
				System.out.println("validateTimedEvent Language != " + description.getLanguage().getLanguageId() + " - " + language.getLanguageId());
				return false;
			}
		}
		
		// validate the movie matches...
		int a = description.getMovie().getMovieId();
		int b = movie.getMovieId();
		
		if (a!=b)
		{
			System.out.println("validateTimedEvent MovieID != " + description.getMovie().getMovieId() + " - " + movie.getMovieId());
			return false;
		}

		return true;
	}

	/**
	 * Validate menu event.
	 *
	 * @param menu the menu
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @return true, if successful
	 */
	public boolean validateMenuEvent(MovieMenu menu, Author author, Language language, Movie movie)
	{		
		// validate author if not all		
		if (author.getAuthorId()!=DVX_Constants.DVX_AUTHOR_ALL_ID)	// author all
		{
			int a = menu.getAuthor().getAuthorId();
			int b = author.getAuthorId();
			if (a!=b)
			{
				return false;
			}
		}
		
		// validate language if not all		
		if (language.getLanguageId()!=DVX_Constants.DVX_LANGUAGE_ALL_ID)	// author all
		{
			int a = menu.getLanguage().getLanguageId();
			int b = language.getLanguageId();
			if (a!=b)
			{
				return false;
			}
		}
		int a = menu.getMovie().getMovieId();
		int b = movie.getMovieId();
		
		// validate the movie matches...
		if (a!=b)
		{
			return false;
		}

		return true;
	}

// look to timed event and fire it if it exists
	/**
 * Check time event.
 *
 * @param author the author
 * @param language the language
 * @param movie the movie
 * @param chapter the chapter
 * @param offset the offset
 * @param startFrame the start frame
 * @return true, if successful
 */
	
	int lastTimeChapter = -1;
	int lastTimeOffset = -1;
	int lastTimeFrame = -1;
public boolean checkTimeEvent(Author author, Language language, Movie movie, int chapter, int offset, int startFrame)
	{
		// TODO FIX THIS. Currently ignoring and filtering frame...
		// HACK !!!!
		startFrame = 0;
		if (!dvx_player.isPlaying())	// are we in playing mode?
			return false;
		if ((lastTimeChapter==chapter)&& (lastTimeOffset==offset) && (lastTimeFrame==startFrame))
		{
			System.out.println("Same as last time check...");
			return false;
		}
		boolean result = false;
		lastTimeChapter=chapter;
		lastTimeOffset=offset;
		lastTimeFrame=startFrame;
		try
		{
		if (movie==null)
		{
			System.err.println("checkTimeEvent Movie is null");
			return false;
		}
		System.out.println("Looking for " + movie.getMovieSbnNumber() + "-" +
				author.getUser().getUserId() + "-" + 
				language.getLanguageId() + "-" + 
				chapter + "-" + 
				offset + "-" + 
				startFrame + ".wav");
/* 
		if (chapter== lastChapter)	// last chapter 
			if (offset ==lastOffset)
				return;	// return if we did this one already...
*/		
		lastOffset 	= offset;
		lastChapter = chapter;
		
		DescriptionDAO descriptionDao = new DescriptionDAO();
		Description description = new Description();
		description.setMovie(movie);
		
		/*
		if (language.getLanguageId()!=0)			// for the ALL case
			description.setLanguage(language);
		if (author.getAuthorId()!=0)				// for the ALL case
			description.setAuthor(author); */
		
		description.setDescriptionStartFrame(startFrame);
		
		description.setDescriptionStartTimeInt(offset);
		description.setDescriptionChapter(chapter);
		description.setDescriptionActive(1);			// very important... make sure we are not triggerin any old ones...
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
		System.out.println(" checkTimeEvent list size = " + descriptionList.size());
		if (descriptionList.size()>0)
		for (Description mmDescription : descriptionList)	// iterate over the results...
		{
/*			if (chapter==2)
				if (offset == 49)
					System.out.print("!!!");
			if (language.getLanguageId()!=0)
			{
				if (language.getLanguageId()!=mmDescription.getLanguage().getLanguageId())
					break;
			}
			if (author.getAuthorId()!=0)
			{
				if (author.getAuthorId()!=mmDescription.getAuthor().getAuthorId())
					break;
			} */
//			if (mmDescription.getMovie().equals(movie) ) //&& mmDescription.getAuthor().equals(author)
			if (mmDescription!=null)	// this should never happen...
			if (validateTimedEvent(mmDescription, author, language,  movie))
			{
				lastDescription = mmDescription;	// save the last description for later use
				System.out.println("Movie id = " + mmDescription.getMovie().getMovieId() + " - " + movie.getMovieId());
//				if (mmDescription.getMovie().getMovieId()==movie.getMovieId())	// validate movie
//				{
					System.out.println("Found Clip : " + mmDescription.getDescriptionUri());
					
					DVX_PlaySound.playWav(	DVX_Constants.MOVIE_PATH + 
								movie.getMovieSbnNumber() + 
								DVX_Constants.MOVIE_DESCRIPTIONS_PATH + 
								mmDescription.getDescriptionUri(), false);
					
					result = true;
				
	//		 		if (chapter==2)
	//					System.out.println("Chapter 2 Event : " + mmDescription.getLanguage().getLanguageName());
//				}
			}
		}
		}
		catch(Exception ex)
		{
			System.err.println("CheckTimeEvent Exception : " + ex);
			result = false;
		}
		
		return result;
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the insert user.
	 *
	 * @param userName the user name
	 * @return the insert user
	 */
	public User getInsertUser(String userName)
	{
		User user = new User();
		
		int userType = DVX_Constants.USER_TYPE_USER;
		
		if (userName=="All")
			userType = DVX_Constants.USER_TYPE_ALL;
		
		user.setUserHandle(userName);
		user.setUserActive(true);
		user.setUserType(userType);	// this messed up the all user... 
		
		UserDAO userDao = new UserDAO();
		
		@SuppressWarnings("unchecked")
		List<User> users = userDao.findByExample(user);
		
		if (users.size()>0)
		{
			return users.get(0);
		}
		else
		{
			Transaction tx = userDao.getSession().beginTransaction();
			userDao.save(user);
			tx.commit();
		}

		return getInsertUser(userName);
	}
	
	// ------------------------------------------------------------------------------------
	/**
	 * Gets the insert author.
	 *
	 * @param userName the user name
	 * @return the insert author
	 */
	public Author getInsertAuthor(String userName)
	{
		User user = getInsertUser(userName);
		return getInsertAuthor(user);
	}
		
	/**
	 * Gets the insert author.
	 *
	 * @param user the user
	 * @return the insert author
	 */
	public Author getInsertAuthor(User user)
	{
		Author author = new Author();
		author.setUser(user);
		AuthorDAO authorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authorList = authorDao.findByExample(author);
		for (Author mmAuthor : authorList)
		{
			if (mmAuthor.getUser().getUserId()==user.getUserId())
			{
				return mmAuthor ;
			}
		}
// failed to find... insert and return
		try
		{
			Transaction tx = authorDao.getSession().beginTransaction();
			authorDao.save(author);
			tx.commit();
		}
		catch (Exception ex)
		{
			System.out.println("Exception " + ex);
		}
		
		return getInsertAuthor(user);
		
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Insert update movie name clip.
	 *
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @param menuNumber the menu number
	 * @param menuItem the menu item
	 * @param path the path
	 * @param fileName the file name
	 */
	public void insertUpdateMovieNameClip(Author author , Language language, Movie movie, int menuNumber, int menuItem, Path path, String fileName)

	{
		// for another day.. clone of below ...
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Insert update movie menu.
	 *
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @param menuNumber the menu number
	 * @param menuItem the menu item
	 * @param path the path
	 * @param fileName the file name
	 */
	public void insertUpdateMovieMenu(Author author , Language language, Movie movie, int menuNumber, int menuItem, Path path, String fileName)
	{
		int versionNumber = 1;
		MovieMenu movieMenu = new MovieMenu();
		
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
		Transaction tx = movieMenuDao.getSession().beginTransaction();

		if (movieMenuList.size()>0)	// it exists..
		{
			MovieMenu movieMenuOld = movieMenuList.get(0);
			
			if (validateMenuEvent(movieMenuOld, author ,  language,  movie));
			{
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
				movieMenuDao.merge(movieMenuOld);
			}
			
		}	// create new one...
		movieMenu.setMenuUri(movie.getMovieSbnNumber() + 
				DVX_Constants.HYPHEN + +
				author.getAuthorId() + 
				DVX_Constants.HYPHEN + + 
				menuNumber + 
				DVX_Constants.HYPHEN + + 
				menuItem + 
				DVX_Constants.GLOBAL_AUDIO_FILE_TYPE_WAV );
		movieMenu.setAuthor(author);
		movieMenu.setLanguage(language);
		if (language==null)
		{
			System.err.println("insertUpdateMovieMenu language in NULL!!!");
		}
		movieMenu.setDescription(	author.getUser().getUserHandle()  + DVX_Constants.SPACE_HYPHEN_SPACE +
									language.getLanguageName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
									movie.getMovieName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
									"Menu ID " + menuNumber + DVX_Constants.SPACE_HYPHEN_SPACE + 
									"Item ID " + menuItem );
		movieMenu.setPath(path);
		
		movieMenu.setMenuActive(1);	// important for versioning...
		movieMenu.setMenuVersion(versionNumber);	// bump the version
		movieMenu.setPath(path);
		movieMenuDao.save(movieMenu);
		tx.commit();
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Insert update time clip.
	 *
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @param chapter the chapter
	 * @param timeOffset the time offset
	 * @param descriptionStartFrame the description start frame
	 * @param path the path
	 * @param fileName the file name
	 * @return the description
	 */
	public Description insertUpdateTimeClip(Author author , Language language, Movie movie, int chapter, int timeOffset, int descriptionStartFrame, Path  path, String fileName)
	{
//		timeOffset=1234;
		System.out.println(
				"\tAuthor Id = " + author.getAuthorId() + "\r" + 
				"\tLanguage Id = " + language.getLanguageId() + "\r" + 
				"\tMovie Id = " + movie.getMovieId() + "\r" + 
				"\tTime Offset = " + timeOffset + "\r" + 
				"\tStartFrame = " + descriptionStartFrame + "\r" + 
				"\tPath = " + path.getPathPrefix() + "\r" + 
				"\tFilename = " + fileName + "\r"  
				);
		
		
		Description description = new Description();
		
		description.setAuthor(author);
		description.setLanguage(language);
		description.setMovie(movie);
		description.setDescriptionActive(1);
		
		description.setDescriptionStartTimeInt(timeOffset);
		description.setDescriptionChapter(chapter);
		description.setDescriptionStartFrame(descriptionStartFrame);
		description.setDescriptionTypeEnum(DVX_Constants.DESCRIPTION_TYPE_AUDIO_DESCRIPTION);
		
//		movieMenu.setPath();	// GCA to be implemented later
		
		DescriptionDAO descriptionDao = new DescriptionDAO();
		try
		{
		Transaction tx = descriptionDao.getSession().beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
// load the existing one... deactivate it...		
		if (descriptionList.size()>0)	// it exists..
		{
			Description descriptionOld = descriptionList.get(0);	// get the old description
			if (validateTimedEvent(descriptionOld, author, language, movie))	// validate the information...
			{
				descriptionOld.setDescriptionActive(0);					// mark it as inactive
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
				descriptionDao.merge(descriptionOld);
			}

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
		description.setDescriptionLong(	
										author.getUser().getUserHandle()  + DVX_Constants.SPACE_HYPHEN_SPACE +
										language.getLanguageName()  + DVX_Constants.SPACE_HYPHEN_SPACE +
										movie.getMovieName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
										"Chapter ID " + chapter + DVX_Constants.SPACE_HYPHEN_SPACE + 
										"offset " + timeOffset + " (ms)" + 
										"Frame " + descriptionStartFrame + " " +
										"Path " + path.getPathPrefix() + " " + 
										"File Name" + fileName
										
										);
		description.setPath(path);
		description.setDescriptionActive(1);	// important for versioning...
		description.setDescriptionVersion(1);
		descriptionDao.save(description);

		tx.commit();

//		checkTimeEvent( author,  language,  movie,  chapter,  timeOffset,  descriptionStartFrame);
		}
		catch (Exception ex)
		{
			System.err.println("Exception " + ex);
			description = null;
		}

		return description;
//		
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the insert path.
	 *
	 * @param author the author
	 * @param path the path
	 * @return the insert path
	 */
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
		
		Transaction tx = pathDao.getSession().beginTransaction();
		pathDao.save(resultPath);
		tx.commit();
		
		return resultPath;
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the language list.
	 *
	 * @return the language list
	 */
	public String [] getLanguageList()
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
		
	/**
	 * Gets the author list.
	 *
	 * @return the author list
	 */
	public String [] getAuthorList()
	{
		
		AuthorDAO arthorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authorList = arthorDao.findAll();
		String[] authors = new String[authorList.size()];
		for (int i=0; i<authorList.size();i++)
		{
			authors[i]= authorList.get(i).getUser().getUserHandle();
		}
		return authors;
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the user.
	 *
	 * @param userName the user name
	 * @return the user
	 */
	public User getUser(String userName)
	{
		User user = new User();
		user.setUserHandle(userName);
		
		UserDAO userDao = new UserDAO();
		@SuppressWarnings("unchecked")
		List<User> userList = userDao.findByExample(user);
		if (userList.size()>0)
			return userList.get(0);
		return null;
	}
	
	// ------------------------------------------------------------------------------------
		
	/**
	 * Gets the author.
	 *
	 * @param authorName the author name
	 * @return the author
	 */
	public Author getAuthor(String authorName)
	{
		Author author = new Author();
		User user = getUser(authorName);
		author.setUser(user);
		AuthorDAO arthorDao = new AuthorDAO();
		@SuppressWarnings("unchecked")
		List<Author> authorList = arthorDao.findByExample(author);
		for (Author mmAuthor : authorList)
		{
			if (mmAuthor.getUser().getUserHandle().equals(authorName))
			{
				return mmAuthor ;
			}
		}
		return null;
		
	}
	
	// ------------------------------------------------------------------------------------
	/**
	 * Dvx_log.
	 *
	 * @param movie the movie
	 * @param user the user
	 * @param transactionType the transaction type
	 * @param transactionLevel the transaction level
	 * @param transactionDetails the transaction details
	 */
	public void dvx_log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails)
	{
		if (true)
		{
			return;
		}
		else
		{
		System.err.println("Kilroy was here!!!");
		TransactionLog transactionLog = new TransactionLog(
				 movie,  user,  transactionType,
				 transactionLevel,  transactionDetails, 
				 new Timestamp(System.currentTimeMillis()), 
				 new Timestamp(System.currentTimeMillis())
				);	
		}
	}
	
	// ------------------------------------------------------------------------------------
	/**
	 * Delete user.
	 *
	 * @param user the user
	 */
	public void deleteUser(User user)
	{
		UserDAO userDAO = new UserDAO();
		
		Transaction tx = userDAO.getSession().beginTransaction();
		userDAO.delete(user);
		tx.commit();
	}

	// ------------------------------------------------------------------------------------
	/**
	 * Delete author.
	 *
	 * @param author the author
	 */
	public void deleteAuthor(Author author)
	{
		try{
			AuthorDAO authorDAO = new AuthorDAO();
			
			Transaction tx = authorDAO.getSession().beginTransaction();
			authorDAO.delete(author);
			tx.commit();
		}
		catch (Exception ex)
		{
			System.out.println("Exception " + ex);
		}
	}

	// ------------------------------------------------------------------------------------
	/**
	 * Delete movie.
	 *
	 * @param movie the movie
	 */
	public void deleteMovie(Movie movie)
	{
		MovieDAO movieDAO = new MovieDAO();
		
		Transaction tx = movieDAO.getSession().beginTransaction();
		movieDAO.delete(movie);
		tx.commit();
	}

	// ------------------------------------------------------------------------------------
	/**
	 * Delete description.
	 *
	 * @param description the description
	 */
	public void deleteDescription(Description description)
	{
		
		DescriptionDAO descriptionDAO = new DescriptionDAO();
		Transaction tx = descriptionDAO.getSession().beginTransaction();
		descriptionDAO.delete(description);
		tx.commit();
	}
	
	// ------------------------------------------------------------------------------------
	/**
	 * Delete path.
	 *
	 * @param path the path
	 */
	public void deletePath(Path path)
	{
		
		PathDAO pathDAO = new PathDAO();
		Transaction tx = pathDAO.getSession().beginTransaction();
		pathDAO.delete(path);
		tx.commit();
	}
	
	// ------------------------------------------------------------------------------------
	/**
	 * Delete description.
	 *
	 * @param author the author
	 * @param language the language
	 * @param movie the movie
	 * @param chapter the chapter
	 * @param timeOffset the time offset
	 * @param frame the frame
	 */
	public void deleteDescription(Author author, Language language, Movie movie, int chapter, int timeOffset, int frame)
	{
		DescriptionDAO descriptionDAO = new DescriptionDAO();
		Description descriptionTemplate = new Description();
		{
			descriptionTemplate.setAuthor(author);
			descriptionTemplate.setLanguage(language);
			descriptionTemplate.setMovie(movie);
			// chapter is currently ignored...
			descriptionTemplate.setDescriptionStartTimeInt(timeOffset);
			// frame is currently ignored...
			List<Description> descriptionList = descriptionDAO.findByExample(descriptionTemplate);
			
			for (Description description : descriptionList)
			{
				if (validateTimedEvent(description, author ,language, movie))
				{
					deleteDescription(description);
				}
				
			}

		}
	}
	// ------------------------------------------------------------------------------------
	
	public void deleteMovieMenu(MovieMenu movieMenu)
	{
		MovieMenuDAO movieMenuDAO = new MovieMenuDAO();
		
		Transaction tx = movieMenuDAO.getSession().beginTransaction();
		movieMenuDAO.delete(movieMenu);
		tx.commit();		
	}
	
	// this one deletes inactive ones too
	
	public void deleteMovieMenus(MovieMenu movieMenu)
	{
		MovieMenuDAO movieMenuDAO = new MovieMenuDAO();
		
		MovieMenu target = new MovieMenu();
		
		target.setAuthor(movieMenu.getAuthor());
		target.setLanguage(movieMenu.getLanguage());
		target.setMovie(movieMenu.getMovie());
		target.setMenuNumber(movieMenu.getMenuNumber());
		target.setMenuItem(movieMenu.getMenuItem());
		
		List<MovieMenu> movieMenuList = movieMenuDAO.findByExample(target);
		
		Transaction tx = movieMenuDAO.getSession().beginTransaction();
		
		for (MovieMenu theMenu : movieMenuList)
		{
			if (validateMenuEvent(theMenu, movieMenu.getAuthor() ,movieMenu.getLanguage(), movieMenu.getMovie()))
				movieMenuDAO.delete(theMenu);
			
		}
		tx.commit();

	}

	/**
	 * @param string
	 */
	public void rateDescription(User user, Language language, Movie movie, String ratingValue) {
		// TODO Auto-generated method stub
		int ratingLevel = 0;
		System.out.println();
		
		if (ratingValue.equals("Great"))
			ratingLevel = 5;
		if (ratingValue.equals("Good"))
			ratingLevel = 4;
		if (ratingValue.equals("Ok"))
			ratingLevel = 3;
		if (ratingValue.equals("So So"))
			ratingLevel = 2;
		if (ratingValue.equals("Bad"))
			ratingLevel = 1;
		
		if (lastDescription!=null)
		{
			RatingDAO ratingDAO = new RatingDAO();
			Rating rating = new Rating();
			rating.setDescription(lastDescription);
			rating.setRatingNameShort(ratingValue);
			rating.setRating(ratingLevel);
			rating.setUser(user);
			rating.setLanguage(language);
			rating.setMovie(movie);
			Transaction tx = ratingDAO.getSession().beginTransaction();
			ratingDAO.save(rating);
			tx.commit();
		}
	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUserLogin(String userName, String password) {
		// TODO Auto-generated method stub
		User user = new User();

		user.setUserHandle(userName);
		user.setUserPassword(password);
		user.setUserActive(true);
		UserDAO userDao = new UserDAO();
		
		@SuppressWarnings("unchecked")
		List<User> users = userDao.findByExample(user);
		if (users.size()>0)
			return users.get(0);

		return null;
	}

	/**
	 * @param user
	 */
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		UserDAO userDao = new UserDAO();
		Transaction tx = userDao.getSession().beginTransaction();
		userDao.merge(user);
		tx.commit();

	}

}


