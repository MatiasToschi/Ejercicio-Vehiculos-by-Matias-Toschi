package Concesionaria;

public class Auto extends Vehiculo {

	private int puertas;
	
	public Auto(String marca, String modelo, float precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	public String toString() {
		return super.toString() + "Puertas: " + puertas + " // " + getPrecio();
	}

}
