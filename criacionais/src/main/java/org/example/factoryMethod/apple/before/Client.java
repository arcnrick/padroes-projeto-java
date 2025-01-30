package org.example.factoryMethod.apple.before;

import org.example.factoryMethod.apple.before.model.*;

public class Client {

    public static void main(String[] args) {

        System.out.println("\n### Ordering an iPhone X");
        IPhone iphone = orderIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = orderIPhone("11", "highEnd");
        System.out.println(iphone2);
    }

    public static IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        // Para saber qual geração e modelo vai ser criado, é necessário fazer diversas validações na camada client
		// para saber qual objeto deverá ser criado... isso é normal, porém a cada novo modelo que for inventado,
		// deverá ser criado um código para o mesmo aqui e também deverá acoplar mais um objeto na classe client, o que
		// acaba deixando um código verboso, com muitas responsabilidades e o píor, corre-se o risco de 'quebrar' algo
		// que já estava funcionando para outros cenários.

		if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX();
            } else if (level.equals("highEnd")) {
                device = new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highEnd")) {
                device = new IPhone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
