package org.example.factoryMethod.apple.after.factory;

import org.example.factoryMethod.apple.after.model.IPhone;
import org.example.factoryMethod.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
