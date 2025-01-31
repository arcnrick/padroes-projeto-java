package org.example.singleton.poolConnection.after;

import org.example.singleton.poolConnection.after.conn.Connection;
import org.example.singleton.poolConnection.after.conn.ConnectionPool;

public class Client {

    // no exemplo aplicando um pool de conexões que utiliza o Singleton, criamos uma única instância para fazer o
    // controle das conexões e sempre vamos utilizar essa mesma até o final da aplicação... nesse caso não existe um
    // construtor público para a ConnectionPool... o que existe é a getInstance() que vai se encarregar de checar se
    // existe ou não a conexão para saber se precisa ou não criar uma instância ou só tratá-la para ser reaproveitada

    static ConnectionPool pool = ConnectionPool.getInstance();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);

        doQuery1();
        doQuery2();
        doQuery3();
    }

    public static void doQuery1() {
        Connection conn = pool.getConnection();

        if (conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        Connection conn = pool.getConnection();

        if (conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        Connection conn = pool.getConnection();

        if (conn != null)
            conn.query("SELECT * FROM A3");
    }
}
