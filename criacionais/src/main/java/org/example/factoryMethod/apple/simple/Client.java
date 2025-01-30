package org.example.factoryMethod.apple.simple;

import org.example.factoryMethod.apple.simple.factory.IPhoneSimpleFactory;
import org.example.factoryMethod.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {

        // igual ao modelo 'factory' e 'halfSimple', aqui nós ocultamos da camada Client, todos os modelos existentes
        // a serem criados e também toda lógica que é usada para criá-los... a única responsabilidade que a camada
        // client vai ter é: passar os parâmetros corretos para a função orderIPhone()

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
        System.out.println(iphone2);

        // veja que aqui, nem apresentamos à Client, quais os modelos e factories existentes, mas somente a
        // IPhoneSimpleFactory já com os métodos estáticos
    }
}
