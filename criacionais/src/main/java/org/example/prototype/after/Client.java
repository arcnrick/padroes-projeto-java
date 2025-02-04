package org.example.prototype.after;

import org.example.prototype.after.model.Acessorio;
import org.example.prototype.after.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Criando a lista de acessórios
        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(new Acessorio("Som Bose"));
        acessorios.add(new Acessorio("Teto Solar"));

        // Criando um objeto original
        Carro carroOriginal = new Carro("Sedan", "Vermelho", acessorios);

        // Criando uma cópia (clone)
        Carro carroClone = carroOriginal.clone();

        // Exibindo tanto o original quanto o clone
        System.out.println("\nExibindo original (1º) e clone (2º)");
        carroOriginal.exibir();
        carroClone.exibir();

        // Alterando propriedade 'simples' do clone
        carroClone.setCor("Branco");

        // Exibindo tanto o original quanto o clone depois de alterar cor do clone
        System.out.println("\nExibindo original (1º) e clone (2º) depois de alterar cor do clone");
        carroOriginal.exibir();
        carroClone.exibir();

        // Modificando a lista de acessórios do clone
        carroClone.adicionarAcessorio(new Acessorio("Rodas Esportivas"));

        System.out.println("\nExibindo original (1º) e clone (2º) depois de adicionar acessórios (list) no clone");
        carroOriginal.exibir();
        carroClone.exibir();

        // caso a função clone da classe Carro estiver só fazendo o clone simples de objeto Carro, todas as properties
        // que forem originadas por outros objetos, como no caso a lista de acessórios, vão compartilhar o mesmo local
        // na memória, o que vai levar ao mesmo cenário do package 'before', ou seja, não serão aproveitadas mas sim
        // reutilizadas. Logo, qualquer alteração feita na cópia, vai sorgir efeito também na original.

        // Para resolver isso, é necessário que se adicione o 'clone' da Acessorio dentro do 'clone' da Carro...

        // para testar os resultados, principalmente de alteração na lista, manipule as opções 1 e 2 da função clone que
        // está dentro da classe Carro

        System.out.println("\nVeja instruções no fonte para entender o clone e comparar os resultados da lista de acessórios");
    }
}
