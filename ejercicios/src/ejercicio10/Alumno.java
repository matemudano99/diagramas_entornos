package ejercicio10;

class Alumno {
	private int idalumno;
	private String nombre;
	private String apellidos;

	public Alumno(int idalumno, String nombre, String apellidos) {
		this.idalumno = idalumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public void setDatos(int idalumno, String nombre, String apellidos) {
		this.idalumno = idalumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
}
