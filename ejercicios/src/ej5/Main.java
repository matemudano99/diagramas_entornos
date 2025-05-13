package ej5;

public class Main {
	public static void main(String[] args) {
		Libro libro1 = new Libro("El Principito", "Amarilla");
		System.out.println("Título del libro: " + libro1.obtenerTitulo());
		libro1.obtenerPortada().mostrar();
	}
}
