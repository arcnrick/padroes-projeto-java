package org.example.factory.after.factory;

import org.example.factory.dbadapter.after.db.DB;
import org.example.factory.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}
}
