package org.example.factoryMethod.dbadapter.before.db;

public class PostgresDB {

	public void query(String sql) {
		System.out.println("Querying: " + sql + " -> in Postgres database");
	}
	
	public void update(String sql) {
		System.out.println("Updating query: " + sql + " -> in Postgres database");
	}
}
