package org.example.factory.after;


import org.example.factory.dbadapter.after.db.DB;
import org.example.factory.after.factory.OracleFactory;
import org.example.factory.after.factory.PostgresFactory;

public class Client {

    public static void main(String[] args) {

        // agora tanto a DB quanto a DBFactory terão suas interfaces e quaisquer novos bancos que
        // venham a ser inseridos no projeto, terão de implementar os métodos das mesmas

        // quando instanciamos o objeto com o modelo do banco especificado, a própria factory já
        // vai saber a qual implementação de banco terá de se conectar

        DB db = new PostgresFactory().getDatabase();

        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
