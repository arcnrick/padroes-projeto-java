package org.example.abstractFactory.apple.before.factory;

import org.example.abstractFactory.apple.before.model.iphone.IPhone;
import org.example.abstractFactory.apple.before.model.iphone.IPhoneX;
import org.example.abstractFactory.apple.before.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else return null;
    }
}
