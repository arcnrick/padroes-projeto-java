package org.example.factory.after.factory;

import org.example.factory.dbadapter.after.db.DB;
import org.example.factory.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}
}
