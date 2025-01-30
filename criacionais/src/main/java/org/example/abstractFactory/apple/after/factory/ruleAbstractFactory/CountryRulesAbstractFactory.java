package org.example.abstractFactory.apple.after.factory.ruleAbstractFactory;

import org.example.abstractFactory.apple.after.model.certificate.Certificate;
import org.example.abstractFactory.apple.after.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
