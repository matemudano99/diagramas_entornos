package ej1;

//Clase Registrado (Hereda de Persona)
public class Registrado extends Persona {
	private String usuario;
	private String contraseña;

	public Registrado(String nombre, int edad, String usuario, String contraseña) {
		super(nombre, edad);
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public void accederSistema() {
		System.out.println(getNombre() + " está accediendo al sistema.");
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}