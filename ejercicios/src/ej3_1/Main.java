package ej3_1;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("123", "Juan Perez");

		String soporte = cliente1.consultarSoporte("Problema de conexión");
		System.out.println(soporte);
	}
}
