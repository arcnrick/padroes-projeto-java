package org.example.abstractFactory.apple.after.factory.factory;

import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.CountryRulesAbstractFactory;
import org.example.abstractFactory.apple.after.model.iphone.IPhone;
import org.example.abstractFactory.apple.after.model.iphone.IPhone11;
import org.example.abstractFactory.apple.after.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11(rules);
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else return null;
    }
}
