package ej1_1;

public class Main {
	public static void main(String[] args) {
		Perro firulais = new Perro("Firulais");
		Gato misifu = new Gato("Misifu");
		Pajaro piolin = new Pajaro("Piolín");

		System.out.println("Nombre del perro: " + firulais.getNombre());
		System.out.println("Sonido del perro: " + firulais.hacerSonido());
		System.out.println(firulais.amamantar());
		System.out.println(firulais.ladrar());
		System.out.println();

		System.out.println("Nombre del gato: " + misifu.getNombre());
		System.out.println("Sonido del gato: " + misifu.hacerSonido());
		System.out.println(misifu.amamantar());
		System.out.println(misifu.maullar());
		System.out.println();

		System.out.println("Nombre del pájaro: " + piolin.getNombre());
		System.out.println("Sonido del pájaro: " + piolin.hacerSonido());
		System.out.println(piolin.volar());
		System.out.println(piolin.cantar());
	}
}