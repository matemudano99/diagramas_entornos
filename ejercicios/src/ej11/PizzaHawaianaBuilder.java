package ej11;

public class PizzaHawaianaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PizzaHawaianaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildMasa() {
        pizza.setMasa("fina");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("tomate");
    }

    @Override
    public void buildIngredientes() {
        pizza.addIngrediente("jamón");
        pizza.addIngrediente("piña");
        pizza.addIngrediente("queso mozzarella");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
