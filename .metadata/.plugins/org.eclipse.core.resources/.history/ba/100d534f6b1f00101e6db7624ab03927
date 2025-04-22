package ej4;

public class Alumno extends Persona {
    private String curso;
    private double notaMedia;

    public Alumno(String nombre, String dni, String curso, double notaMedia) {
        super(nombre, dni);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String presentarse() {
        return "Hola, soy un alumno llamado " + nombre + " con DNI " + dni + ", estoy en el curso de " + curso + " y mi nota media es " + notaMedia + ".";
    }
}