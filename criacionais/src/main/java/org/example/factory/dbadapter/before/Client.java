package org.example.factory.dbadapter.before;

import org.example.factory.dbadapter.before.db.OracleDB;
import org.example.factory.dbadapter.before.db.PostgresDB;

public class Client {

    public static void main(String[] args) {
        OracleDB dbOracle = new OracleDB();
        dbOracle.query("SELECT * FROM users");
        dbOracle.update("INSERT INTO users VALUES ('User', 25)");

        // para usar o Postgres, vamos precisar criar um novo objeto que também vai chamar no final, um objeto de
        // banco que possa ter códigos semelhantes

        PostgresDB dbPostgres = new PostgresDB();
        dbPostgres.query("SELECT * FROM users");
        dbPostgres.update("INSERT INTO users VALUES ('User', 25)");

        // agora para cada novo banco que a aplicação precisar se conectar, vai precisar criar a classe para se
        // conectar ao banco (que muitas vezes vai ser semelhante às demais) e também fazer toda a criação de objetos
        // e alimentação dos métodos. Caso precise alterar as regras na classe do banco, talvez precise alterar também
        // as classe que fazem uso de seus métodos, o que aumenta o risco de quebrar códigos existentes para outras
        // funcionalidades
    }
}
