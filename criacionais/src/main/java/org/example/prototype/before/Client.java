package org.example.prototype.before;

import org.example.prototype.before.model.Acessorio;
import org.example.prototype.before.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // No exemplo abaixo, fizemos a cópia de um objeto de duas formas diferentes: uma cópia por referência e outra
        // copiando os valores das propriedade de um objeto para o outro para evitar o uso de propriedades que ocuparam
        // o mesmo local na memória, através da função 'clonar()' que deixamos na model, mas poderia ser em outra classe
        // para dividir a responsabilidade.

        // No primeiro caso, onde copiamos por referência, está completamente errado, pois a cada alteração que fizermos
        // no objeto copiado, o objeto original também será alterado, logo a lógica está mais atrapalhando do que
        // ajudando na criação de outro objeto.

        // No segundo caso já deu certo a cópia, ou seja, caso o objeto 'clonado' for alterado em qualquer de suas
        // propriedades, o objeto original não vai sofrer alteração, o que é bom e não atrapalha outras partes onde
        // estão utilizando o objeto original... Por outro lado, da forma que fizemos ficou muito verbosa e de difícil
        // manutenção. Além de termos de fazer esse 'clone' na mão, ainda tem o fato de que a cada nova propriedade que
        // for incluída em uma das classes (Carro ou Acessorio), teremos de fazer o tratamento para replicar as
        // informações

        // Criando a lista de acessórios
        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(new Acessorio("Som Bass HT"));
        acessorios.add(new Acessorio("Teto Solar"));

        // Criando um carro original
        Carro carroOriginal = new Carro("SUV", "Preto", acessorios);
        System.out.println("\nExibindo carro original");
        carroOriginal.exibir();

        // Copia do carro original via referência de objeto (FORMA ERRADA)
        Carro carroCopiaOriginal = carroOriginal;
        System.out.println("\nExibindo carro cópia do original");
        carroCopiaOriginal.exibir();

        // Modificando a lista de acessórios da copia
        carroCopiaOriginal.adicionarAcessorio(new Acessorio("Rodas Esportivas"));

        System.out.println("\nApós modificar somente a cópia (1º=original e 2º=cópia):");
        carroOriginal.exibir();
        carroCopiaOriginal.exibir();

        // Criando um clone manualmente e já exibindo o clone antes de alterar algo (FORMA CORRETA, MAS VERBOSA)
        Carro carroClone = carroOriginal.clonar();
        System.out.println("\nExibindo carro clonado (sem alterações)");
        carroClone.exibir();

        // Modificando a lista de acessórios do clone
        carroClone.adicionarAcessorio(new Acessorio("Spoiler GTX"));

        System.out.println("\nApós modificar somente o clone (1º=original e 2º=clone):");
        carroOriginal.exibir();
        carroClone.exibir();
    }
}
