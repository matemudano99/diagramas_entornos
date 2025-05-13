package ej3_1;

class Cliente {
	private String clienteId;
	private String nombre;

	public Cliente(String clienteId, String nombre) {
		this.clienteId = clienteId;
		this.nombre = nombre;
	}

	public String getClienteId() {
		return clienteId;
	}

	public String consultarSoporte(String problema) {
		ServicioAtencion servicioAtencion = new ServicioAtencion();
		return servicioAtencion.darSoporte(this.clienteId, problema);
	}
}
