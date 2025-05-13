package ej5;

public class Libro {
	private String titulo;
	private Portada portada;

	public Libro(String titulo, String colorPortada) {
		this.titulo = titulo;
		this.portada = new Portada(colorPortada);
	}

	public String obtenerTitulo() {
		return titulo;
	}

	public Portada obtenerPortada() {
		return portada;
	}

}
