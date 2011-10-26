package org.ski.dvx.ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.ski.dvx.hibernate.User;
import org.ski.dvx.hibernate.UserDAO;

@javax.jws.WebService(targetNamespace = "http://ws.dvx.ski.org/", serviceName = "UserListService", portName = "UserListPort")
public class UserListDelegate {

	org.ski.dvx.ws.UserList userList = new org.ski.dvx.ws.UserList();

	public List<SimpleUser> getUserList() {
		return userList.getUserList();
	}

	public SimpleUser getSimpleUser(String email, String userPassword) {
		return userList.getSimpleUser(email, userPassword);
	}

	public void main(String[] args) {
		userList.main(args);
	}

}