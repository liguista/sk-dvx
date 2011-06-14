<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body> 
    <br>This is my JSP page. Greg...<br><br/>
<br><hr><br>
    
<%
	hibernate_dvx.User user;
	hibernate_dvx.UserDAO userDAO = new hibernate_dvx.UserDAO(); 
	
	List<hibernate_dvx.User> userList = userDAO.findAll();	
%>
	
	<b>User List Size = <%=userList.size() %></b><br><br>
	<table>
<%
		int count = userList.size();
		for (int i =0; i<userList.size();i++)
		{
			user = userList.get(i);
			%><tr>
			<td><%=user.getUserId() %></td>
			<td><%=user.getUserName() %> </td>
			<td> <%=user.getUserPassword() %> </td>
			<td> <%=user.getModified() %></td>
			</tr><% 
		}
		
%>
</table>
<br><hr><br>

<%
	hibernate_dvx.State state;
	hibernate_dvx.StateDAO stateDAO = new hibernate_dvx.StateDAO(); 
	
	List<hibernate_dvx.State> stateList = stateDAO.findAll();	
%>
	
	<b>State List Size = <%=stateList.size() %></b><br/><br/>
	
<%
		count = userList.size();
		for (int i =0; i<stateList.size();i++)
		{
			state = stateList.get(i);
			%>
			<%=state.getStateName() %> <br>
			<% 
		}
%>
<br><hr><br>
<%
	hibernate_dvx.Country country;
	hibernate_dvx.CountryDAO countryDAO = new hibernate_dvx.CountryDAO(); 
	
	List<hibernate_dvx.Country> countryList = countryDAO.findAll();	
%>
	
	<b>Country List Size = <%=countryList.size() %></b><br/><br/>
	
<%
		count = countryList.size();
		for (int i =0; i<countryList.size();i++)
		{
			country = countryList.get(i);
			%>
			<%=country.getCountryName() %> <br>
			<% 
		}
%>
<br><hr><br>
<%
	hibernate_dvx.Movie movie;
	hibernate_dvx.MovieDAO movieDAO = new hibernate_dvx.MovieDAO(); 
	
	List<hibernate_dvx.Movie> movieList = movieDAO.findAll();	
%>
	
	<b>Movie List Size = <%=movieList.size() %></b><br><br>
<table>
<%
		count = movieList.size();
		for (int i =0; i<movieList.size();i++)
		{
			movie = movieList.get(i);
			%>
			<tr>
				<td><%=movie.getMovieId() %> </td>
				<td> <%=movie.getMovieName() %> </td>
				<td> <%=movie.getMovieRuntime() %> Minutes</td>
				<td>Released <%=movie.getMovieReleased() %></td>
				<td><%=movie.getMovieDescription() %></td>
			</tr><% 
		}
%>
</table>
<br><hr><br>
  </body>
</html>
