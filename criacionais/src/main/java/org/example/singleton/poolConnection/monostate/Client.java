package org.example.singleton.poolConnection.monostate;

import org.example.singleton.poolConnection.monostate.conn.Connection;
import org.example.singleton.poolConnection.monostate.conn.ConnectionPool;

public class Client {

    // muitos consideram que o Monostate nem é um pattern e não pode ser utilizado ao invés do Singleton... o caso é que
    // aqui, mesmo que criemos uma ConnectionPool nova a cada execução, sempre vamos conseguir manter um limitado número
    // de conexões ativas através do array de conexões static que existe no ConnectionPool... que em teoria vai
    // funcionar igual ao exemplo do 'after' onde conseguimos usar e já liberar a conexão para reaproveitamento, sem a
    // necessidade de se criar diversas instâncias pela aplicação

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);

        doQuery1();
        doQuery2();
        doQuery3();
    }

    public static void doQuery1() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();

        if (conn != null) {
            conn.query("SELECT * FROM A1");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery2() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();

        if (conn != null) {
            conn.query("SELECT * FROM A2");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery3() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();

        if (conn != null) {
            conn.query("SELECT * FROM A3");
            pool.leaveConnection(conn);
        }
    }
}
