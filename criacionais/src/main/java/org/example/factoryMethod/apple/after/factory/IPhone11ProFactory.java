package org.example.factoryMethod.apple.after.factory;

import org.example.factoryMethod.apple.after.model.IPhone;
import org.example.factoryMethod.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
