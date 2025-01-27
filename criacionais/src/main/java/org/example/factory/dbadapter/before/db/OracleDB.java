package org.example.factory.dbadapter.before.db;

public class OracleDB {

    public void query(String sql) {
        System.out.println("Querying: " + sql + " -> in Oracle database");
    }

    public void update(String sql) {
        System.out.println("Updating query: " + sql + " -> in Oracle database");
    }
}
