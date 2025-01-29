package org.example.factory.apple.halfSimple.factory;

import org.example.factory.apple.halfSimple.model.IPhone;
import org.example.factory.apple.halfSimple.model.IPhone11;
import org.example.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {

		// nesse caso da 'halfSimple', passamos parte da obrigação da lógica para uma das classes que foram extendidas
		// da abstract IPhoneFactory... aqui nós fazemos uma checagem para saber qual modelo vai ser criado (isso foi
		// analisado de acordo com a lógica de negócio) e externalizamos para a factory, somente os modelos necessários

		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;

		// nesse exemplo, a lógica fica um pouco mais clara e ainda mantém a segurança da camada Client em não saber e
		// nem precisar ser alterada a cada novo modelo que é criado, mas novamente, isso vai de acordo com sua regra
		// de negócio e forma que melhor achar para 'separarar' as responsabilidades
	}
}
