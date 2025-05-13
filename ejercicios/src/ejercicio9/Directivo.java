package ejercicio9;

import java.sql.Date;

public class Directivo extends Empleado {
	public String nombre;
	public int categoria;

	public Directivo(String nombre, Date fecha_nacimiento, int idempleado, double sueldo_bruto, String nombre2,
			int categoria) {
		super(nombre, fecha_nacimiento, idempleado, sueldo_bruto);
		nombre = nombre2;
		this.categoria = categoria;
	}

}
