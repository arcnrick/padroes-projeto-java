package org.example.abstractFactory.service.after;

import org.example.abstractFactory.service.after.factory.ApiAbstractFactory;
import org.example.abstractFactory.service.after.factory.RestApiAbstractFactory;
import org.example.abstractFactory.service.after.factory.SoapApiAbstractFactory;
import org.example.abstractFactory.service.after.service.CarService;
import org.example.abstractFactory.service.after.service.UserService;

public class Client {

    public static void main(String[] args) {

        // aplicando a fábrica de abstrações, podemos criar uma factory com o tipo de API desejado e já passar os
        // valores para os respectivos métodos, sem ter a necessidade de apresentar à camada client, todas os possíveis
        // tipos de APIs existentes... nesse novo exemplo, caso existissem mais 10 outros tipos de APIs, bastaria passar
        // para a camada client, a respectiva factory e essa por sua vez se encarregaria de acessar uma ou outra API
        // conforme regras incluídas na mesma

        ApiAbstractFactory factory = new RestApiAbstractFactory();
        conectaAPI(factory);

        factory = new SoapApiAbstractFactory();
        conectaAPI(factory);

        // no exemplo, fizemos uso de duas tecnologias diferentes, mas poderiam ser várias e a responsabilidade desses
        // envios de dados, não seriam responsabilidades da camada client

        // aqui, optamos por separar as factories em tecnologias, mas poderiam também ser separadas por funcionalidades
        // como usuário, carro, cidade, etc... essa parte fica a cargo de análises para checar qual cenário seria mais
        // produtivo e de melhor manutenção
    }

    private static void conectaAPI(ApiAbstractFactory factory) {

        // no get abaixo, já vai ser carregada a service da respectiva tecnologia, com base no parâmetro factory

        UserService userService = factory.getUserService();
        userService.save(5, "Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save(2, "Prius");
        carService.update(2, "Tesla X");
    }
}
