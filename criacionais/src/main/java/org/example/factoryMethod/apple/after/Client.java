package org.example.factoryMethod.apple.after;

import org.example.factoryMethod.apple.after.factory.IPhone11ProFactory;
import org.example.factoryMethod.apple.after.factory.IPhoneFactory;
import org.example.factoryMethod.apple.after.factory.IPhoneXFactory;
import org.example.factoryMethod.apple.after.model.IPhone;

public class Client {

    public static void main(String[] args) {

        // aplicando o factory, a classe client não tem mais necessidade de saber sobre qual objeto terá de fazer a
        // lógica para criar o device... aqui só precisamos apresentar à Client, qual a factory que deverá ser chamada e
        // essa sim, conhecerá o objeto IPhone que fará a lógica (poderá conhecer somente o modelo necessário para criar
        // o dispositivo ou mais, conforme a sua lógica

        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

        System.out.println("\n### Ordering an iPhone X");
        IPhone iphone = iphoneXFactory.orderIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = iphone11ProFactory.orderIPhone();
        System.out.println(iphone2);

        // outra coisa que toda a parte de criação e chamada dos métodos existentes na interface IPhone, agora ficaram
        // na responsabilidade da interface da respectiva factory... logo a cada novo modelo incluído na produção, a
        // camanda client nem vai saber se foi ou não implementado o código, mas sim a nova factory (ou alterada)
    }
}
