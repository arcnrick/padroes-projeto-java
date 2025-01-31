package org.example.singleton.traditional.instance;

public class Singleton {

    private static Singleton instancia;

    // construtor vai ser sempre privado, impedindo que sejam criadas novas instâncias de forma externa
    private Singleton() {}

    public static Singleton getInstance() {

        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }
}