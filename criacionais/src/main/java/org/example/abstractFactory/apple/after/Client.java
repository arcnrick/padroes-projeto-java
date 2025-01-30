package org.example.abstractFactory.apple.after;

import org.example.abstractFactory.apple.after.factory.factory.IPhone11Factory;
import org.example.abstractFactory.apple.after.factory.factory.IPhoneFactory;
import org.example.abstractFactory.apple.after.factory.factory.IPhoneXFactory;
import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.BrazilianRulesAbstractFactory;
import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.CountryRulesAbstractFactory;
import org.example.abstractFactory.apple.after.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhoneFactory gen11Factory = new IPhone11Factory(rules);

        // aplicando o abstract factory, é como se incluíssemos diveras factories de uma vez só a serem aplicadas todas
        // de uma vez (caso necessário) e tanto a camada client quanto as internas (como factories, facades, services,
        // etc) sofressem menos alterações possíveis... veja que agora já criamos a factory, passando um parâmetro
        // adicional no seu construtor, que indicará de qual país deverão ser seguidas as regras para conclusão do
        // pedido... veja mais na classe abstract IPhone que receberá parte do código a ser implementado conforme o país
        // e também as novas classes que foram criadas para as regras.
        // da forma que está agora, toda responsabilidade de criação de regras será individual e tanto as factories
        // quanto models genéricas existentes, sofrerão menos código alterado possível... a ideia aqui é que caso seja
        // incluído um novo país, o mesmo tenha suas regras separadas em suas respectivas classes e sejam apresentados
        // somente a camada client... o resto faria somente um by-pass da informação

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
