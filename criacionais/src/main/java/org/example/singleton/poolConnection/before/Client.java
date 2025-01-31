package org.example.singleton.poolConnection.before;

import org.example.singleton.poolConnection.before.conn.Connection;
import org.example.singleton.poolConnection.before.conn.ConnectionPool;

public class Client {
    // o principal motivo para termos um Singleton, é para que possamos garantir que uma classe tenha uma única
    // instância em no código e o seu valor possa ser alterado (diferente de constante pública)

    // no exemplo que segue precisamos de uma conexão com o banco de dados e nesse caso, configuramos um pool de
    // conexões que vai receber apenas 2 conexões abertas por vez (para facilitar o entendimento, simulamos esse
    // controle através da property 'inUse' na Connection... temos uma situação onde diversas solicitações podem ser
    // feitas em um mesmo pool de conexões para se conectarem ao banco, mas não sabemos o estado/valor de cada instância
    // dessas conexões, mesmo tendo feito o controle pela variável (de repente precisei alterar alguma configuração
    // durante uma ou outra execução)... então o que vai acontecer é que em determinado momento, além de não termos
    // conexões livres para continuar o processo, não saberemos qual instância iremos utilizar

    // também existe o cenário onde podemos criar um novo pool com as configurações e valores que precisamos para o
    // momento, sempre que formos usar o banco, como nos métodos doQuery5 e doQuery6... desse modo nós garantimos que
    // sempre teremos uma conexão nova, mas vamos encher de conexões (alguns bancos nem permitem muitas conexões abertas
    // ao mesmo tempo) e ainda vamos ter um código muito verboso, de difícil manutenção e com diversas instâncias de uma
    // mesma classe de forma totalmente desnecessária

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();

        // os três blocos de código abaixo utilizam o msm pool de conexões, logo um deles ou não vai achar conexão livre
        // ou vai encontrar a conexão mas correndo o risco de ter valores que não sirvam para o momento
        Connection conn = pool.getConnection();
        doQuery1(conn);
        doQuery2(conn);

        Connection conn2 = pool.getConnection();
        doQuery3(conn2);

        Connection conn3 = pool.getConnection();
        doQuery4(conn3);

        pool.leaveConnection(conn);

        // os dois métodos abaixo criam novas instâncias de conexão e já liberam as conexões quando terminam
        doQuery5();
        doQuery6();
    }

    public static void doQuery1(Connection conn) {
        if (conn != null) {
            conn.query("SELECT * FROM A1");
        }
    }

    public static void doQuery2(Connection conn) {
        if (conn != null) {
            conn.query("SELECT * FROM A2");
        }
    }

    public static void doQuery3(Connection conn) {
        if (conn != null) {
            conn.query("SELECT * FROM A3");
        }
    }

    public static void doQuery4(Connection conn) {
        if (conn != null) {
            conn.query("SELECT * FROM A4");
        }
    }

    public static void doQuery5() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();

        if (conn != null) {
            conn.query("SELECT * FROM A5");

            pool.leaveConnection(conn);
        }
    }

    public static void doQuery6() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();

        if (conn != null) {
            conn.query("SELECT * FROM A6");

            pool.leaveConnection(conn);
        }
    }
}
