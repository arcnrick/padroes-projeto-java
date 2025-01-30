package org.example.abstractFactory.apple.after.factory.ruleAbstractFactory;

import org.example.abstractFactory.apple.after.model.certificate.BrazilianCertificate;
import org.example.abstractFactory.apple.after.model.certificate.Certificate;
import org.example.abstractFactory.apple.after.model.packing.BrazilianPacking;
import org.example.abstractFactory.apple.after.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
