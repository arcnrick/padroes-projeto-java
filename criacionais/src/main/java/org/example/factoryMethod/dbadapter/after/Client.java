package org.example.factoryMethod.dbadapter.after;

import org.example.factoryMethod.dbadapter.after.db.DB;
import org.example.factoryMethod.dbadapter.after.factory.OracleFactory;
import org.example.factoryMethod.dbadapter.after.factory.PostgresFactory;

public class Client {

    public static void main(String[] args) {

        // agora cada DB terá sua interface e quaisquer novos bancos que venham a ser inseridos no projeto, terão de
        // implementar os métodos nas mesmas a serem criadas

        // quando instanciamos o objeto com o modelo do banco especificado, a própria factory já vai conter parte das
        // regras para o respectivo banco e também vai saber a qual implementação de banco terá de se conectar

        DB db = new PostgresFactory().getDatabase();

        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        // se aparecer um banco novo, basta criar a implementação do mesmo, alterando pouco código nas classes já
        // existentes e criar o novo objeto da implementação da interface, na layer mais próxima do client possível
        // (no nosso caso a Client). Isso fará com que as implementações existentes para outros bancos, não sofram
        // ajustes desnecessários ou arriscados, além de a camada client nem precisar saber do novo banco
    }
}
