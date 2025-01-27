package org.example.factory.dbadapter.after.factory;

import org.example.factory.dbadapter.after.db.DB;
import org.example.factory.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}
}
