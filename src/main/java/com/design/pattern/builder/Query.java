package com.design.pattern.builder;

public class Query {
	
	private String query;
	String whereClause;
	String orderBy;

	public Query(String query) {
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	 

	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
}
