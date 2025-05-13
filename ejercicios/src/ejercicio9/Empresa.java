package ejercicio9;

import java.util.ArrayList;

public class Empresa {
	public String nombreEmpresa;
	public String cif;
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	public Empresa(String nombreEmpresa, String cif, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
		this.nombreEmpresa = nombreEmpresa;
		this.cif = cif;
		if (empleados == null || empleados.isEmpty()) {
            throw new IllegalArgumentException("Debe haber al menos un producto");
        }
		this.clientes = clientes;
	}

}
