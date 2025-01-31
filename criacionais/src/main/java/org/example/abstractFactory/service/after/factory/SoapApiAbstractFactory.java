package org.example.abstractFactory.service.after.factory;

import org.example.abstractFactory.service.after.service.CarService;
import org.example.abstractFactory.service.after.service.CarSoapApiService;
import org.example.abstractFactory.service.after.service.UserService;
import org.example.abstractFactory.service.after.service.UserSoapApiService;

public class SoapApiAbstractFactory implements ApiAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserSoapApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarSoapApiService();
    }
}



