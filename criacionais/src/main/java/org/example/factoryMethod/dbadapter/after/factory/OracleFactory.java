package org.example.factoryMethod.dbadapter.after.factory;

import org.example.factoryMethod.dbadapter.after.db.DB;
import org.example.factoryMethod.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}
}
