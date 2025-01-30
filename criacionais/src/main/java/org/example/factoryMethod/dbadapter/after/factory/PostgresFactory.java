package org.example.factoryMethod.dbadapter.after.factory;

import org.example.factoryMethod.dbadapter.after.db.DB;
import org.example.factoryMethod.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}
}
