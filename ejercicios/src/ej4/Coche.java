package ej4;

public class Coche {
	private String marca;
	private String modelo;
	private Motor motor;

	public Coche(String marca, String modelo, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void mostrarDetalles() {
		System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nMotor: " + motor);
	}
}
