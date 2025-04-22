package ej1;

public class Main {
	public static void main(String[] args) {
		Invitado invitado = new Invitado("Carlos", 25, "Conferencia");
		invitado.presentarse();
		invitado.asistirEvento();

		Asociado asociado = new Asociado("Ana", 30, 12345);
		asociado.presentarse();
		asociado.mostrarNumeroAsociado();

		Registrado registrado = new Registrado("Pedro", 28, "pedro123", "secreto");
		registrado.presentarse();
		registrado.accederSistema();

		Administrador admin = new Administrador("Laura", 35, "lauraAdmin", "admin123", "SuperAdmin");
		admin.presentarse();
		admin.accederSistema();
		admin.gestionarSistema();
	}
}