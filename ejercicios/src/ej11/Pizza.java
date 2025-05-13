package ej11;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	String masa;
	String salsa;
	List<String> ingredientes = new ArrayList<>();

	public void setMasa(String masa) {
		this.masa = masa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public void addIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	@Override
	public String toString() {
		return "Pizza [masa=" + masa + ", salsa=" + salsa + ", ingredientes=" + ingredientes + "]";
	}
}
