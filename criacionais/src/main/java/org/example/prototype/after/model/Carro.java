package org.example.prototype.after.model;

import java.util.ArrayList;
import java.util.List;

public class Carro implements Cloneable {

    private String modelo;
    private String cor;
    private List<Acessorio> acessorios;

    public Carro(String modelo, String cor, List<Acessorio> acessorios) {
        super();
        this.modelo = modelo;
        this.cor = cor;
        this.acessorios = acessorios;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {

        // Opção nº 1: criando uma nova lista para evitar compartilhamento de referência
        List<Acessorio> acessoriosClone = new ArrayList<>();
        for (Acessorio acessorio : this.acessorios) {
            acessoriosClone.add(acessorio.clone());
        }

        return new Carro(this.modelo, this.cor, acessoriosClone);

        // Opção nº 2: fazer o clone simples de todas as properties da classe
        //return new Carro(this.modelo, this.cor, this.acessorios);
    }

    public void adicionarAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

    public void exibir() {
        System.out.println("Carro: " + modelo + " | Cor: " + cor + " | Acessórios: " + acessorios);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
