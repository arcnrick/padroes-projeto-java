package org.example.prototype.before.model;

public class Acessorio {

    private String nome;

    public Acessorio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
