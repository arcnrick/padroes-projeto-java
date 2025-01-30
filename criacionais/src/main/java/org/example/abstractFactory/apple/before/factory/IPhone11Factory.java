package org.example.abstractFactory.apple.before.factory;

import org.example.abstractFactory.apple.before.model.iphone.IPhone;
import org.example.abstractFactory.apple.before.model.iphone.IPhone11;
import org.example.abstractFactory.apple.before.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11();
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro();
        } else return null;
    }
}
