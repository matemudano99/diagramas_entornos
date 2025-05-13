package ej6;

class Portatil {
    private String serial;

    public Portatil(String serial) {
        this.serial = serial;
    }

    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando el programa: " + programa + " en el portátil con serial " + serial);
    }

    public String getSerial() {
        return serial;
    }
}
