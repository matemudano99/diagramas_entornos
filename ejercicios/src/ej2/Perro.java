package ej2;

public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Guau!";
    }

    @Override
    public String amamantar() {
        return "El perro está amamantando a sus cachorros.";
    }

    public String ladrar() {
        return "¡Guau, guau!";
    }
}
