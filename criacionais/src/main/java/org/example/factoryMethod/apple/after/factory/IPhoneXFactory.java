package org.example.factoryMethod.apple.after.factory;

import org.example.factoryMethod.apple.after.model.IPhone;
import org.example.factoryMethod.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
