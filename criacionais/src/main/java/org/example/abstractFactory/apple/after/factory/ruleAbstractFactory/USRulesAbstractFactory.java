package org.example.abstractFactory.apple.after.factory.ruleAbstractFactory;

import org.example.abstractFactory.apple.after.model.certificate.Certificate;
import org.example.abstractFactory.apple.after.model.certificate.USCertificate;
import org.example.abstractFactory.apple.after.model.packing.Packing;
import org.example.abstractFactory.apple.after.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new USCertificate();
    }

    public Packing getPacking() {
        return new USPacking();
    }
}
