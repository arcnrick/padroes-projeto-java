package org.example.abstractFactory.apple.before.factory;

import org.example.abstractFactory.apple.before.model.certificate.BrazilianCertificate;
import org.example.abstractFactory.apple.before.model.certificate.USCertificate;
import org.example.abstractFactory.apple.before.model.iphone.IPhone;
import org.example.abstractFactory.apple.before.model.packing.BrazilianPacking;
import org.example.abstractFactory.apple.before.model.packing.USPacking;

public abstract class IPhoneFactory {

    public IPhoneFactory() {
    }

    public IPhone orderIPhone(String level, String country) {
        IPhone device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();

        if ("br".equals(country)) {
            BrazilianCertificate certificate = new BrazilianCertificate();
            System.out.println(certificate.applyCertification());
        } else if ("us".equals(country)) {
            USCertificate certificate = new USCertificate();
            System.out.println(certificate.applyCertification());
        }

        device.pack();

        if ("br".equals(country)) {
            BrazilianPacking packing = new BrazilianPacking();
            System.out.println(packing.pack());
        } else if ("us".equals(country)) {
            USPacking packing = new USPacking();
            System.out.println(packing.pack());
        }

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
