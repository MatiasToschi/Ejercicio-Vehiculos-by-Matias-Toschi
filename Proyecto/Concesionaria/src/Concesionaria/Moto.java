package Concesionaria;

public class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto(String marca, String modelo, float precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String toString() {
		return super.toString() + "Cilindrada: " + cilindrada + "cc // Precio: " + imprimirPrecio();
	}
}

