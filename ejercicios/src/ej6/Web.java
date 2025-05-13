package ej6;

import java.util.Random;

class Web {
	private String dominio;

	public Web(String dominio) {
		this.dominio = dominio;
	}

	public int mostrarVisitas() {
		Random random = new Random();
		int visitas = random.nextInt(1000);
		System.out.println("La web " + dominio + " tiene " + visitas + " visitas.");
		return visitas;
	}

	public String getDominio() {
		return dominio;
	}
}
