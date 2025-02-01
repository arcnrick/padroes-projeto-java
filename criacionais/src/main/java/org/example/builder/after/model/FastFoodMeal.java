package org.example.builder.after.model;

public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    // construtor privado para garantir que apenas o Builder possa instanciar
    private FastFoodMeal(Builder builder) {
        this.drink = builder.drink;
        this.main = builder.main;
        this.side = builder.side;
        this.dessert = builder.dessert;
        this.gift = builder.gift;
    }

    // função para iniciar o builder
    public static Builder builder() {
        return new Builder();
    }

    // classe Builder interna
    public static class Builder {
        private String drink;
        private String main;
        private String side;
        private String dessert;
        private String gift;

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder main(String main) {
            this.main = main;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder gift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal build() {
            return new FastFoodMeal(this);
        }
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }
}
