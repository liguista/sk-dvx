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
import org.ski.dvx.hibernate.TransactionLog;
import org.ski.dvx.hibernate.User;
import org.ski.dvx.hibernate.UserDAO;

// ***********************************************************************************

public class DVX_DB_Support {

	/**
	 * @param args
	 */
	DVX_Player dvx_player;

	
// ------------------------------------------------------------------------------------
	
	public DVX_DB_Support(DVX_Player dvx_player, String defaultAuthor)
	{
		this.dvx_player = dvx_player;
		
		dvx_player.setAuthor(getAuthor(defaultAuthor));
	}
	
// ------------------------------------------------------------------------------------

	public void log(Movie movie, User user, String transactionType,
			String transactionLevel, String transactionDetails)
	{
		dvx_log(movie, user, transactionType, transactionLevel, transactionDetails);
	}
	
	// ------------------------------------------------------------------------------------
		
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

	public void updateMovie(Movie movie)
	{
		MovieDAO movieDao = new MovieDAO();
		Transaction tx = movieDao.getSession().beginTransaction();
		movieDao.merge(movie);
		tx.commit();
		
	}
	// ------------------------------------------------------------------------------------
		
	public String getMenuURI(Author author, Language language, Movie movie, int menuID, int menuItem) // add language here...
	{
		 
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
		
	int lastChapter = -1;
	int lastOffset = 0;
//	
	public boolean validateTimedEvent(Description description, Author author, Language language, Movie movie)
	{		
		// validate author if not all		
		if (author.getAuthorId()!=0)	// author all
		{
			if (description.getAuthor().getAuthorId()!=author.getAuthorId())
			{
				return false;
			}
		}
		
		// validate language if not all		
		if (language.getLanguageId()!=0)	// author all
		{
			if (description.getLanguage().getLanguageId()!=language.getLanguageId())
			{
				return false;
			}
		}
		
		// validate the movie matches...
		if (description.getMovie().getMovieId()!=movie.getMovieId())
		{
			return false;
		}

		return true;
	}
	
// look to timed event and fire it if it exists
	public void checkTimeEvent(Author author, Language language, Movie movie, int chapter, int offset, int startFrame)
	{
		try
		{
		if (movie==null)
		{
			System.err.println("checkTimeEvent Movie is null");
			return;
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
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
		System.out.println(" checkTimeEvent list size = " + descriptionList.size());
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
			if (validateTimedEvent(mmDescription, author, language,  movie))
			{
				System.out.println("Movie id = " + mmDescription.getMovie().getMovieId() + " - " + movie.getMovieId());
//				if (mmDescription.getMovie().getMovieId()==movie.getMovieId())	// validate movie
//				{
					System.out.println("Found Clip : " + mmDescription.getDescriptionUri());
					
					DVX_PlaySound.playWav(	DVX_Constants.MOVIE_PATH + 
								movie.getMovieSbnNumber() + 
								DVX_Constants.MOVIE_DESCRIPTIONS_PATH + 
								mmDescription.getDescriptionUri(), false);
	//		 		if (chapter==2)
	//					System.out.println("Chapter 2 Event : " + mmDescription.getLanguage().getLanguageName());
//				}
			}
		}
		}
		catch(Exception ex)
		{
			System.err.println("CheckTimeEvent Exception : " + ex);
		}
	}
	
	// ------------------------------------------------------------------------------------
		
	public User getInsertUser(String userName)
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
			Transaction tx = userDao.getSession().beginTransaction();
			userDao.save(user);
			tx.commit();
		}

		return getInsertUser(userName);
	}
	
	// ------------------------------------------------------------------------------------
	public Author getInsertAuthor(String userName)
	{
		User user = getInsertUser(userName);
		return getInsertAuthor(user);
	}
		
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
		
	public void insertUpdateMovieNameClip(Author author , Language language, Movie movie, int menuNumber, int menuItem, Path path, String fileName)

	{
		// for another day.. clone of below ...
	}
	
	// ------------------------------------------------------------------------------------
		
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
		movieMenuDao.save(movieMenu);
		tx.commit();
	}
	
	// ------------------------------------------------------------------------------------
		
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
		try
		{
		Transaction tx = descriptionDao.getSession().beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Description> descriptionList = descriptionDao.findByExample(description);
// load the existing one... deactivate it...		
		if (descriptionList.size()>0)	// it exists..
		{
			Description descriptionOld = descriptionList.get(0);	// get the old description
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
										author.getUser().getUserName()  + DVX_Constants.SPACE_HYPHEN_SPACE +
										language.getLanguageName()  + DVX_Constants.SPACE_HYPHEN_SPACE +
										movie.getMovieName() + DVX_Constants.SPACE_HYPHEN_SPACE + 
										"Chapter ID " + chapter + DVX_Constants.SPACE_HYPHEN_SPACE + 
										"offset " + timeOffset + " (ms)" + 
										"Frame " + descriptionStartFrame + " " +
										"Path " + path.getPathPrefix() + " " + 
										"File Name" + fileName
										
										);
		description.setPath(path);
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
		
	public String [] getAuthorList()
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
		
	public User getUser(String userName)
	{
		User user = new User();
		user.setUserName(userName);
		
		UserDAO userDao = new UserDAO();
		@SuppressWarnings("unchecked")
		List<User> userList = userDao.findByExample(user);
		if (userList.size()>0)
			return userList.get(0);
		return null;
	}
	
	// ------------------------------------------------------------------------------------
		
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
			if (mmAuthor.getUser().getUserName().equals(authorName))
			{
				return mmAuthor ;
			}
		}
		return null;
		
	}
	
	// ------------------------------------------------------------------------------------
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
	
	public void deleteUser(User user)
	{
		UserDAO userDAO = new UserDAO();
		
		Transaction tx = userDAO.getSession().beginTransaction();
		userDAO.delete(user);
		tx.commit();
	}

	public void deleteAuthor(Author author)
	{
		AuthorDAO authorDAO = new AuthorDAO();
		
		Transaction tx = authorDAO.getSession().beginTransaction();
		authorDAO.delete(author);
		tx.commit();
	}

	public void deleteMovie(Movie movie)
	{
		MovieDAO movieDAO = new MovieDAO();
		
		Transaction tx = movieDAO.getSession().beginTransaction();
		movieDAO.delete(movie);
		tx.commit();
	}

	public void deleteDescription(Description description)
	{
		
		DescriptionDAO descriptionDAO = new DescriptionDAO();
		Transaction tx = descriptionDAO.getSession().beginTransaction();
		descriptionDAO.delete(description);
		tx.commit();
	}
	
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
	
}


