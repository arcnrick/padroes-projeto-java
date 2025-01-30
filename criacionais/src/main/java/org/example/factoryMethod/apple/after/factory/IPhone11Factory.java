package org.example.factoryMethod.apple.after.factory;

import org.example.factoryMethod.apple.after.model.IPhone;
import org.example.factoryMethod.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}
}
