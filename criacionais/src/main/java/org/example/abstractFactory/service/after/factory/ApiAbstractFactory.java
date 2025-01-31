package org.example.abstractFactory.service.after.factory;

import org.example.abstractFactory.service.after.service.CarService;
import org.example.abstractFactory.service.after.service.UserService;

public interface ApiAbstractFactory {

    UserService getUserService();
	
	CarService getCarService();
}
