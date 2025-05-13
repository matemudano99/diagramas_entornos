package ej6;

import java.util.ArrayList;
import java.util.List;

class Cliente {
	private int clienteId;
	private List<Factura> facturas;

	public Cliente(int clienteId) {
		this.clienteId = clienteId;
		this.facturas = new ArrayList<>();
	}

	public void agregarFactura(Factura factura) {
		this.facturas.add(factura);
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
}