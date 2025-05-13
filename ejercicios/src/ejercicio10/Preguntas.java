package ejercicio10;

class Preguntas {
	private String asignatura;
	private String pregunta;
	private boolean respuesta;

	public Preguntas(String asignatura, String pregunta) {
		this.asignatura = asignatura;
		this.pregunta = pregunta;
	}

	public void muestraPregunta() {
		System.out.println(pregunta);
	}

	public boolean getRespuesta() {
		return respuesta;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public String getPregunta() {
		return pregunta;
	}
}
