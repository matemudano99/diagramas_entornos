package ejercicio10;

import java.sql.Date;
import java.util.ArrayList;

class Examen {
	private Date fecha;
	private String asignatura; 
	private double calificacion;
	private ArrayList<Preguntas> preguntas;

	public Examen(Date fecha, String asignatura) {
		this.fecha = fecha;
		this.asignatura = asignatura;
		this.preguntas = new ArrayList<>();
	}

	public void realizarExamen() {
		System.out.println("Realizando examen de " + asignatura);
	}

	public Preguntas getPregunta(String asignatura) {
		System.out.println("Obteniendo pregunta de " + asignatura);
		return null;
	}

	public void guardarResultado() {
		System.out.println("Guardando resultado del examen");
	}

	public void agregarPregunta(Preguntas pregunta) {
		this.preguntas.add(pregunta);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public ArrayList<Preguntas> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Preguntas> preguntas) {
		this.preguntas = preguntas;
	}
}
