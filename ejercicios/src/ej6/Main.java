package ej6;

public class Main {
	public static void main(String[] args) {
		Motor motor = new Motor(1200, "TM-0110-T");
		Coche coche = new Coche("Toyota", "Yaris", motor);
		coche.mostrarDetalles();
	}
}
