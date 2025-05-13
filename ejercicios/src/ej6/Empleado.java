package ej6;

class Empleado {
    private double salario;
    private Portatil portatilAsignado;

    public Empleado(double salario) {
        this.salario = salario;
        this.portatilAsignado = null;
    }

    public void asignarPortatil(Portatil portatil) {
        this.portatilAsignado = portatil;
    }

    public Portatil getPortatilAsignado() {
        return portatilAsignado;
    }

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setPortatilAsignado(Portatil portatilAsignado) {
		this.portatilAsignado = portatilAsignado;
	}

}
