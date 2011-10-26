package org.ski.dvx.ws;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ski.dvx.hibernate.User;
import org.ski.dvx.hibernate.UserDAO;

public class UserList implements java.io.Serializable{
	
	void UserList()
	{
		
	}
	
	public List<SimpleUser> getUserList()
	{
		List<User> userList = null;;
		List<SimpleUser> simpleUserList = new ArrayList<SimpleUser>();

		
		UserDAO userDao = new UserDAO();
		
		userList = userDao.findAll();
		
		Iterator itr = userList.iterator();
		while (itr.hasNext())
		{
			User user = (User)itr.next();
			SimpleUser simpleUser = new SimpleUser();
			simpleUser.setUserEmail(user.getUserEmail());
			simpleUser.setUserHandle(user.getUserHandle());
			
			simpleUserList.add(simpleUser);
			
		}
		return simpleUserList;
	}
	
	public SimpleUser getSimpleUser(String email, String userPassword)
	{
		User user = new User();
		
		user.setUserEmail(email);
//		if (userPassword.length()>0)
			user.setUserPassword(userPassword);
		user.setUserActive(true);
		
		UserDAO userDao = new UserDAO();
			
		List<User> userList = userDao.findByExample(user);
		
		if (userList.size()>0)
		{
			user = userList.get(0);
			SimpleUser simpleUser = new SimpleUser();
			simpleUser.setUserEmail(user.getUserEmail());
			simpleUser.setUserHandle(user.getUserHandle());
			simpleUser.setUserPassword(user.getUserPassword());
			return simpleUser;
		}

		return null;
	}
	
	void doIt()
	{
		List<SimpleUser> list = getUserList();
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			SimpleUser user = (SimpleUser)itr.next();
			System.out.println(user.getUserEmail() + " - " + user.getUserHandle());
		}
		System.out.println();
		SimpleUser user = getSimpleUser("greg@ac44.com", "abc");
		System.out.println(user.getUserEmail() + " - " + user.getUserHandle());

		user = getSimpleUser("dotty@ac44.com", "dotty");
		System.out.println(user.getUserEmail() + " - " + user.getUserHandle());

		user = getSimpleUser("dotty@ac44.com", "dotty!");
		if(user!=null)
		System.out.println(user.getUserEmail() + " - " + user.getUserHandle());
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserList userList = new UserList();
		userList.doIt();
	}

}
