package org.example.factoryMethod.dbadapter.after.db;

public class PostgresDB implements org.example.factoryMethod.dbadapter.after.db.DB {

	public void query(String sql) {
		System.out.println("Querying: " + sql + " -> in Postgres database");
	}

	public void update(String sql) {
		System.out.println("Updating query: " + sql + " -> in Postgres database");
	}
}
