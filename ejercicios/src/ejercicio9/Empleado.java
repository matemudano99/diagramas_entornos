package ejercicio9;

import java.sql.Date;

public class Empleado extends Persona {
	private int idempleado;
	public double sueldo_bruto;

	public Empleado(String nombre, Date fecha_nacimiento, int idempleado, double sueldo_bruto) {
		super(nombre, fecha_nacimiento);
		this.idempleado = idempleado;
		this.sueldo_bruto = sueldo_bruto;
	}

}
