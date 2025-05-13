package ej1_1;

public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau!";
    }

    @Override
    public String amamantar() {
        return "La gata está amamantando a sus gatitos.";
    }

    public String maullar() {
        return "¡Miauuuu!";
    }
}