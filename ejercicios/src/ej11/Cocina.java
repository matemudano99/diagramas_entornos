package ej11;

public class Cocina {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void construirPizza() {
        builder.buildMasa();
        builder.buildSalsa();
        builder.buildIngredientes();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
