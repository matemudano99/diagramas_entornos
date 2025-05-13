package ejercicio10;

import java.sql.Date;

public class Main {
	public static void main(String[] args) {
		Alumno alumno = new Alumno(1, "Jn", "D");
		Examen examen = new Examen(new Date(0), "Fisica");
		Preguntas pregunta = new Preguntas("Fisica", "Que es la gravedad?");

		examen.agregarPregunta(pregunta);

		alumno.setDatos(2, "xxdd", "sxd");
		examen.realizarExamen();
		pregunta.muestraPregunta();
	}
}
