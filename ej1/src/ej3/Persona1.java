package ej3;

public class Persona1 {
	private DetallePersona detalle;

	public Persona1(DetallePersona detalle) {
		this.detalle = detalle;
	}

	public String mostrarDatos() {
		return "Detalles de la persona: " + detalle.toString();
	}
}