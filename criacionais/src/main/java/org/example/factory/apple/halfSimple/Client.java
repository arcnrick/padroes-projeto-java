package org.example.factory.apple.halfSimple;

import org.example.factory.apple.halfSimple.factory.IPhone11Factory;
import org.example.factory.apple.halfSimple.factory.IPhoneFactory;
import org.example.factory.apple.halfSimple.factory.IPhoneXFactory;
import org.example.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		// igual ao que foi implementado no exemplo do 'factory' aqui no 'halfSimple' nós só apresentamos para a Client,
		// a factory necessária para criar um ou mais modelos conforme a necessidade do negócio

		System.out.println("\n### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);

		// novamente, a classe Client não tem ideia de quais modelos existem, como e quando são criados... veja as
		// explicaçãoes na classe IPhone11Factory
	}
}
