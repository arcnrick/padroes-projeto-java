package org.example.prototype.after.model;

public class Acessorio implements Cloneable {

    private String nome;

    public Acessorio(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public Acessorio clone() throws CloneNotSupportedException {

        // Vamos usar o clone da própria Cloneable do Java
        return (Acessorio) super.clone();
    }
}