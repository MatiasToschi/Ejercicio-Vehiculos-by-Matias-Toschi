package Concesionaria;

import java.text.DecimalFormat;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private float precio;
	protected DecimalFormat formatoPrecio = new DecimalFormat("###,###.00");

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
	
	
	protected String imprimirPrecio() {
		return formatoPrecio.format(getPrecio());
	}

}
