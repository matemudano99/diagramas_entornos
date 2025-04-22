package ej2;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public abstract String amamantar();
}