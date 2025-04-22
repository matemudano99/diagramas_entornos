package ej5_2;

class ServicioAtencion {
	public String darSoporte(String clienteId, String problema) {
		return "Soporte para el cliente " + clienteId + ": " + problema + " - Solución en proceso.";
	}

	public String consultarEstado(String clienteId) {
		return "Estado de la consulta del cliente " + clienteId + ": En revisión.";
	}
}