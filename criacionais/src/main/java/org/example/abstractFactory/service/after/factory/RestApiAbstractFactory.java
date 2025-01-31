package org.example.abstractFactory.service.after.factory;

import org.example.abstractFactory.service.after.service.CarRestApiService;
import org.example.abstractFactory.service.after.service.CarService;
import org.example.abstractFactory.service.after.service.UserRestApiService;
import org.example.abstractFactory.service.after.service.UserService;

public class RestApiAbstractFactory implements ApiAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}
}
