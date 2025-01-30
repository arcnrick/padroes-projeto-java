package org.example.factoryMethod.dbadapter.after.db;

public class OracleDB implements org.example.factoryMethod.dbadapter.after.db.DB {

	public void query(String sql) {
		System.out.println("Querying: " + sql + " -> in Oracle database");
	}

	public void update(String sql) {
		System.out.println("Updating query: " + sql + " -> in Oracle database");
	}
}
