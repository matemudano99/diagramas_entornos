package ej5;

public class Main {
	public static void main(String[] args) {
		Coche coche1 = new Coche("Seat", "León");

		String detalle1 = coche1.mostrarDetalleDisponibilidad();
		System.out.println(detalle1);

	}
}