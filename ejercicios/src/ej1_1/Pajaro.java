package ej1_1;

public class Pajaro extends Ave {
	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public String hacerSonido() {
		return "Pío pío!";
	}

	@Override
	public String volar() {
		return "El pájaro está volando.";
	}

	public String cantar() {
		return "¡Pío, pío, trino!";
	}
}