package ej1;

//Clase Administrador (Hereda de Registrado)
public class Administrador extends Registrado {
	private String rol;

	public Administrador(String nombre, int edad, String usuario, String contraseña, String rol) {
		super(nombre, edad, usuario, contraseña);
		this.rol = rol;
	}

	public void gestionarSistema() {
		System.out.println(getNombre() + " está gestionando el sistema como " + rol);
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}