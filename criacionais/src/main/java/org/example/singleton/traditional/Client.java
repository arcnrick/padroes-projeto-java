package org.example.singleton.traditional;

import org.example.singleton.traditional.instance.Singleton;

public class Client {

    // a premissa do Singleton é de criar uma única instância de determinada classe e trabalhar com a mesma por toda a
    // aplicação, permitindo que seus valores sejam alterados... no exemplo tradicional, podemos ver que não conseguimos
    // criar uma nova instância pois não existe construtor público da classe para isso, o que conseguimos e ter acesso
    // a função static 'getInstance()' que ficará reponsável por criar ou devolver a instância que já está em uso... veja que
    // mesmo chamando mais de uma vez, a instância vai ser sempre a mesma

    public static void main(String[] args) {

        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();
        Singleton instancia3 = Singleton.getInstance();

        System.out.println(instancia1 == instancia2);
        System.out.println(instancia2 == instancia3);
    }
}
