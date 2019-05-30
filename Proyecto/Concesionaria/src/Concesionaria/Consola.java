package Concesionaria;

import Errores.ErrorListaVacia;
import Errores.ErrorMaximoNoEncontrado;
import Errores.ErrorMinimoNoEncontrado;

public class Consola {

	public static Concesionaria concesionaria = new Concesionaria();

	public static void main(String[] args) {
		concesionaria.agregarNuevoVehiculo(new Auto("Peugeot", "206", 200000, 4));
		concesionaria.agregarNuevoVehiculo(new Moto("Honda", "Titan", 60000, 125));
		concesionaria.agregarNuevoVehiculo(new Auto("Peugeot", "208", 250000, 5));
		concesionaria.agregarNuevoVehiculo(new Moto("Yamaha", "YBR", (float) 80500.50, 160));
		try {
			concesionaria.listarVehiculos();
		} catch (ErrorListaVacia e) {
			System.out.println(e.getMessage());
		}
		imprimirLinea();
		try {
			concesionaria.mostrarVehiculoMasCaro();
		} catch (ErrorListaVacia e) {
			System.out.println(e.getMessage());
		} catch (ErrorMaximoNoEncontrado e) {
			System.out.println(e.getMessage());
		}

		try {
			concesionaria.mostrarVehiculoMasBarato();
		} catch (ErrorListaVacia e) {
			System.out.println(e.getMessage());
		} catch (ErrorMinimoNoEncontrado e) {
			System.out.println(e.getMessage());
		}
		
		try {
			concesionaria.mostrarVehiculoConModeloConLetra('Y');
		}catch (ErrorListaVacia e) {
			System.out.println(e.getMessage());
		}

		imprimirLinea();
		
		try {
			concesionaria.listarVehiculosOrdenadosPorPrecio();
		}catch (ErrorListaVacia e) {
			System.out.println(e.getMessage());
		}
		
		imprimirLinea();
	}

	private static void imprimirLinea() {
		System.out.println("=============================");
	}
}
