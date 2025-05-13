package ejercicio9;

import java.sql.Date;

public class Cliente extends Persona {
	private int idcliente;
	private String telefono;

	public Cliente(String nombre, Date fecha_nacimiento, int idcliente, String telefono) {
		super(nombre, fecha_nacimiento);
		this.idcliente = idcliente;
		this.telefono = telefono;
	}

}
