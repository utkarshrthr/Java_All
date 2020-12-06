package com.design.pattern.builder;

public class QueryBuilder {
	
	private Query query;

	public QueryBuilder(String query) {
		this.query = new Query(query);
	}
	
	public QueryBuilder whereClause(String key, String value) {
		this.query.setWhereClause("WHERE key = "+value);
		return this;
	}
	
	public QueryBuilder orderBy(String key, String value) {
		this.query.setWhereClause("WHERE key = "+value);
		return this;
	}
	
	public QueryBuilder groupBy(String key, String value) {
		this.query.setWhereClause("WHERE key = "+value);
		return this;
	}
	
	public Query build() {	// terminal
		return this.query ;
	}
	 

	// Query(String query)
	// Query(String query, String whereClause)
	// Query(String query, String whereClause, String orderBY)
}
