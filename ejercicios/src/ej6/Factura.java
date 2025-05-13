package ej6;

import java.util.Random;

class Factura {
    private String numero;

    public Factura(String numero) {
        this.numero = numero;
    }

    public double calcularImpuesto() {
        Random random = new Random();
        double impuesto = random.nextDouble() * 0.21;
        System.out.println("El impuesto para la factura " + numero + " es: " + impuesto);
        return impuesto;
    }

    public String getNumero() {
        return numero;
    }
}
