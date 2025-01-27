package org.example.factory.dbadapter.before;

import org.example.factory.dbadapter.before.db.OracleDB;
import org.example.factory.dbadapter.before.db.PostgresDB;

public class Client {

    public static void main(String[] args) {
        OracleDB dbOracle = new OracleDB();
        dbOracle.query("SELECT * FROM users");
        dbOracle.update("INSERT INTO users VALUES ('User', 25)");

        // Para usar o Postgres, vamos precisar criar um novo objeto que também vai
        // chamar no final, um objeto de banco com os métodos semelhantes
        PostgresDB dbPostgres = new PostgresDB();
        dbPostgres.query("SELECT * FROM users");
        dbPostgres.update("INSERT INTO users VALUES ('User', 25)");
    }
}
