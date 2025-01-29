package org.example.factory.apple.after.factory;

import org.example.factory.apple.after.model.IPhone;
import org.example.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
