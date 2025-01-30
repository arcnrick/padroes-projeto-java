package org.example.abstractFactory.apple.before;

import org.example.abstractFactory.apple.before.factory.IPhone11Factory;
import org.example.abstractFactory.apple.before.factory.IPhoneFactory;
import org.example.abstractFactory.apple.before.factory.IPhoneXFactory;
import org.example.abstractFactory.apple.before.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        // utilizamos o factoyMethod para já criar um dispositivo correto de acordo com seu factory, o que já ajuda
        // quanto na forma que esse device vai ser criado sem que a camada Client saiba, porém vamos acrescentar mais
        // um conjunto de tasks que deverão ser incluídas ao fazer o pedido de um dispositivo e nesse caso, essas tasks
        // seguem padrões de acordo com os países que serão comercializados... isso quer dizer que já no início, teremos
        // de informar qual é o país, além de ter de alterar a nossa factory existente, incluindo regras específicas
        // para cada país... e isso deverá ser feito a cada novo país que for incluído no projeto, o que pode quebrar
        // tanto a camada Client quanto a Factory... veja como ficou verboso e tende a crescer ainda mais o código da
        // classe IPhoneFactory

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard", "br");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd", "br");
        System.out.println(iphone2);
    }
}
