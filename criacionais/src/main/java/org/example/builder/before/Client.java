package org.example.builder.before;

import org.example.builder.before.model.FastFoodMeal;

public class Client {

	// imagina uma classe que possui umas 20 propriedades diferentes no construtor, mas na verdade queremos trabalhar só
	// com algumas delas (veja o exemplo do objeto justFries abaixo)... teremos que obrigatoriamente atribuir valores ao
	// menos null na criação do objeto FastFoodMeal, onde NÃO criamos 'todas' as possibilidades de construtores

	// aqui nós criamos construtores personalizados para a classe FastFoodMeal, mas pense que já estamos utilizando essa
	// classe em diversos lugares no nosso código e agora foi acrescentada uma nova propriedade no objeto e essa
	// propriedade deve ser incluída no construtor também... vamos ter de personalizar um novo construtor só por causa
	// da nova propriedade, talvez refatorar algumas partes do código e de repente até quebrar algo que já estava certo

	public static void main(String[] args) {

		FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake", "2 Kilograms");
		System.out.println(heartAtackCombo);
	}
}
