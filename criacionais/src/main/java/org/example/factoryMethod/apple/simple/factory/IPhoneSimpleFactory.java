package org.example.factoryMethod.apple.simple.factory;

import org.example.factoryMethod.apple.simple.model.IPhone;
import org.example.factoryMethod.apple.simple.model.IPhone11;
import org.example.factoryMethod.apple.simple.model.IPhone11Pro;
import org.example.factoryMethod.apple.simple.model.IPhoneX;
import org.example.factoryMethod.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {

        // aqui fizemos uma abordagem um pouco mais simplista do que os modelos anteriores (factory e halfSimple) pois
        // passamos a lógica de escolha de modelos toda para essa classe Factory, mas novamente, omitimos da camada
        // client, toda a lógica contida aqui e também não arriscamos alterações desnecessárias na client, o que continua
        // mantendo o nosso código externo seguro... mas novamente, isso se deu por acharmos que nesse cenário, seria o
        // melhor para nossa regra de negócio

        IPhone device = null;

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
