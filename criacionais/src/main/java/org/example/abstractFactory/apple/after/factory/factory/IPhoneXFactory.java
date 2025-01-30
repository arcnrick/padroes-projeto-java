package org.example.abstractFactory.apple.after.factory.factory;

import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.CountryRulesAbstractFactory;
import org.example.abstractFactory.apple.after.model.iphone.IPhone;
import org.example.abstractFactory.apple.after.model.iphone.IPhoneX;
import org.example.abstractFactory.apple.after.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(rules);
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }
}
