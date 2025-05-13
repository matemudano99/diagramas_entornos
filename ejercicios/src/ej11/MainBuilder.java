package ej11;

public class MainBuilder {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        // Pizza Barbacoa
        PizzaBuilder barbacoa = new PizzaBarbacoaBuilder();
        cocina.setBuilder(barbacoa);
        cocina.construirPizza();
        Pizza pizzaBarbacoa = cocina.getPizza();
        System.out.println("Pizza Barbacoa: " + pizzaBarbacoa);

        // Pizza Hawaiana
        PizzaBuilder hawaiana = new PizzaHawaianaBuilder();
        cocina.setBuilder(hawaiana);
        cocina.construirPizza();
        Pizza pizzaHawaiana = cocina.getPizza();
        System.out.println("Pizza Hawaiana: " + pizzaHawaiana);
    }
}
