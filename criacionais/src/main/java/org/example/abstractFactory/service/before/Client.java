package org.example.abstractFactory.service.before;

import org.example.abstractFactory.service.before.service.CarRestApiService;
import org.example.abstractFactory.service.before.service.CarSoapApiService;
import org.example.abstractFactory.service.before.service.UserRestApiService;
import org.example.abstractFactory.service.before.service.UserSoapApiService;

public class Client {

	public static void main(String[] args) {

		// aqui vamos ver um exemplo onde vamos fazer um crud em cadastros de usuário e carro... no caso temos acesso a
		// dois tipos diferentes de APIs, a REST e a SOAP, então vamos enviar as requisições para ambas e para isso eu
		// preciso criar as instâncias de cada serviço e assim enviar

		UserRestApiService userRestApiService = new UserRestApiService();
		userRestApiService.save(5,"Jhon");
		userRestApiService.delete(5);

		UserSoapApiService userSoapApiService = new UserSoapApiService();
		userSoapApiService.save(5,"Pedro");
		userSoapApiService.delete(5);

		CarRestApiService carRestApiService = new CarRestApiService();
		carRestApiService.save(2,"Prius");
		carRestApiService.update(2,"Tesla X");

		CarSoapApiService carSoapApiService = new CarSoapApiService();
		carSoapApiService.save(2,"Prius");
		carSoapApiService.update(2,"Tesla X");

		// o problema aqui, começar quando surge uma nova tecnologia, como por exemplo o gRPC... vou ter de fazer as
		// mesmas implementações para essa nova opção, além de ter de criar os objetos específicos para esses novos
		// endpoints e trabalhar toda a regra para os mesmos, o que pode quebrar o código anterior que estava funcionando
		// bem, pois são informações que acabamos usando em todas as opções
		// agora vamos imaginar que além da nova tecnologia, ainda vão surgir novos cadastros como cidade, produto,
		// etc... a lista de alterações a ser incluída só vai facilitar para termos um código totalmente acoplado e
		// perigoso
	}
}
