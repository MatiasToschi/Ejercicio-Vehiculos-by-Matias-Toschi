package Concesionaria;

import java.util.Comparator;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private float precio;

	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Marca: " + getMarca() + " //  Modelo: " + getModelo() + " // ";
	}
	
	public int compareTo(Vehiculo otroVehiculo){
		int resultado = 0;
		if(this.precio > otroVehiculo.precio){
			resultado = 1;
		}else if (this.precio < otroVehiculo.precio) {
			resultado = -1;
		}
		return resultado;
	}

}
