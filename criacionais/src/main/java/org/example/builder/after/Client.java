package org.example.builder.after;

import org.example.builder.after.model.FastFoodMeal;

public class Client {

    // uma das opções em se usar um Builder, é o fato de conseguirmos criar objetos imutáveis (sem os setters no objeto
    // principal... e também poder escolher quais campos vamos passar no construtor, caso não queiramos trabalhar com
    // todos os que existem na classe

    // aqui vamos usar a mesma classe FastFoodMeal, mas agora ela já possui um Builder interno que vai se
    // responsabilizar de criar os builder, alimentar somente os campos que queremos e devolver um objeto FastFoodMeal
    // bem mais enxuto... aqui, se criarmos uma nova propriedade nessa FastFoodMeal, bastar criar o builder da referida
    // propriedade e usá-la 'se necessário' nos locais desejados, além de 'NÂO' precisar mexer nos outros builders que
    // já foram usados para essa classe no restante do sistema e que não irão utilizar a nova propriedade

    public static void main(String[] args) {

        FastFoodMeal burguerCombo = FastFoodMeal.builder()
                .drink("Coke")
                .main("CheeseBurguer")
                .side("Fries")
                .build();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = FastFoodMeal.builder()
                .side("Fries").build();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = FastFoodMeal.builder()
                .drink("Customize Toolbar…")
                .main("Monster Burguer")
                .side("Large Fries")
                .dessert("Fudge Cake")
                .gift("2 Kilograms")
                .build();
        System.out.println(heartAtackCombo);
    }
}