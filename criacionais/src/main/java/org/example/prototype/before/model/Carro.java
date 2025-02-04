package org.example.prototype.before.model;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    private String modelo;
    private String cor;
    private List<Acessorio> acessorios;

    public Carro(String modelo, String cor, List<Acessorio> acessorios) {
        this.modelo = modelo;
        this.cor = cor;
        this.acessorios = acessorios;
    }

    // função para clonar um carro manual
    public Carro clonar() {

        // Criando uma nova lista para evitar compartilhamento de referência
        List<Acessorio> acessoriosCopiados = new ArrayList<>();

        for (Acessorio acessorio : this.acessorios) {
            acessoriosCopiados.add(new Acessorio(acessorio.getNome()));
        }

        return new Carro(this.modelo, this.cor, acessoriosCopiados);
    }

    public void adicionarAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

    public void exibir() {
        System.out.println("Carro: " + modelo + " | Cor: " + cor + " | Acessórios: " + acessorios);
    }
}
