package org.example.abstractFactory.apple.after.factory.factory;

import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.CountryRulesAbstractFactory;
import org.example.abstractFactory.apple.after.model.iphone.IPhone;

public abstract class IPhoneFactory {

    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
        IPhone device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
