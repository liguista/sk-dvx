package com.kwilliams.utilities;

import java.awt.List;


/**
 * Easy way to create strings with quoted sequences inside. I got tired of fighting with
 * the editor to make complex strings.
 * 
 * @author keith
 *
 */
public class QueryBuilder {
	StringBuilder query;
	
	public QueryBuilder(){
		query = new StringBuilder();
	}
	/**
	 * adds string to the query string
	 * @param s
	 */
	public void add(String s){
		query.append(s);
		query.append(" ");
	}
	/**
	 * adds string surrounded by double quotes to the query string
	 * @param s
	 */
	public void addQuoted(String s){
		query.append("\""+s+"\"");
		query.append(" ");
	}
	/**
	 * adds string surrounded by single quotes to the query string
	 * @param s
	 */
	public void addSingleQuoted(String s){
		query.append("\'"+s+"\'");
		query.append(" ");
	}
	/**
	 * Returns the query string
	 * @return
	 */
	public String get(){
		return query.toString().trim();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueryBuilder q = new QueryBuilder();
		//Build this string: "select from " + Pipe.class.getName()
		//+ " where userId == " + "\"" + userId + "\"";
		q.add("select from");
		q.add(List.class.getName());
		q.add("where userId ==");
		q.addQuoted("userId");

	}

}
