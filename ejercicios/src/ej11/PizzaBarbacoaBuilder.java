package ej11;

public class PizzaBarbacoaBuilder implements PizzaBuilder {
	private Pizza pizza;

	public PizzaBarbacoaBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void buildMasa() {
		pizza.setMasa("gruesa");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("barbacoa");
	}

	@Override
	public void buildIngredientes() {
		pizza.addIngrediente("pollo");
		pizza.addIngrediente("bacon");
		pizza.addIngrediente("queso cheddar");
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}
}
