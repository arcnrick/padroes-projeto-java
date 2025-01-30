package org.example.abstractFactory.apple.after.model.iphone;

import org.example.abstractFactory.apple.after.factory.ruleAbstractFactory.CountryRulesAbstractFactory;

public class IPhoneXSMax extends IPhone {

    public IPhoneXSMax(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A12 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
