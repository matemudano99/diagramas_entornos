package ej6;

public class Motor {
	private int cilindrada;
	private String modelo;

	public Motor(int cilindrada, String modelo) {
		this.cilindrada = cilindrada;
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Cilindrada: " + cilindrada + "  Modelo: " + modelo;
	}

	public String arrancar() {
		return "BRRRRRRUMMMMMMMM";

	}
}
