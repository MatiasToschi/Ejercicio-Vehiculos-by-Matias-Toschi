package Concesionaria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import Errores.ErrorListaVacia;
import Errores.ErrorMaximoNoEncontrado;
import Errores.ErrorMinimoNoEncontrado;

public class Concesionaria {

	private ArrayList<Vehiculo> vehiculos;

	public Concesionaria() {
		vehiculos = new ArrayList<Vehiculo>();
	}

	public void agregarNuevoVehiculo(Vehiculo nuevoVehiculo) {
		vehiculos.add(nuevoVehiculo);
	}

	public void listarVehiculos() throws ErrorListaVacia {
		if (vehiculos.size() > 0) {
			for (Vehiculo esteVehiculo : vehiculos) {
				System.out.println(esteVehiculo);
			}
		} else {
			throw (new ErrorListaVacia());
		}

	}

	public void mostrarVehiculoMasCaro() throws ErrorListaVacia, ErrorMaximoNoEncontrado {
		Vehiculo masCaro = null;
		float mayorPrecio = 0;
		if (vehiculos.size() > 0) {
			for (Vehiculo esteVehiculo : vehiculos) {
				if (mayorPrecio < esteVehiculo.getPrecio()) {
					mayorPrecio = esteVehiculo.getPrecio();
					masCaro = esteVehiculo;
				}
			}
			if (masCaro != null) {
				System.out.println("Vehiculo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
			} else {
				throw (new ErrorMaximoNoEncontrado());
			}
		} else {
			throw (new ErrorListaVacia());
		}
	}

	public void mostrarVehiculoMasBarato() throws ErrorListaVacia, ErrorMinimoNoEncontrado {
		Vehiculo masBarato = null;
		float menorPrecio = 99999999;
		if (vehiculos.size() > 0) {
			for (Vehiculo esteVehiculo : vehiculos) {
				if (menorPrecio > esteVehiculo.getPrecio()) {
					menorPrecio = esteVehiculo.getPrecio();
					masBarato = esteVehiculo;
				}
			}
			if (masBarato != null) {
				System.out.println("Vehiculo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
			} else {
				throw (new ErrorMinimoNoEncontrado());
			}
		} else {
			throw (new ErrorListaVacia());
		}
	}

	public void mostrarVehiculoConModeloConLetra(char letraBuscada) throws ErrorListaVacia {
		char[] cadenaChar;
		if (vehiculos.size() > 0) {
			for (Vehiculo esteVehiculo : vehiculos) {
				cadenaChar = esteVehiculo.getModelo().toCharArray();
				for (int i = 0; i < cadenaChar.length; i++) {
					if (cadenaChar[i] == Character.toLowerCase(letraBuscada)
							|| cadenaChar[i] == Character.toUpperCase(letraBuscada)) {
						System.out.println("Vehículo que contiene en el modelo la letra '" + letraBuscada + "' : "
								+ esteVehiculo.getMarca() + " " + esteVehiculo.getModelo() + " "
								+ esteVehiculo.imprimirPrecio());
						i = cadenaChar.length;
					}
				}

			}
		} else {
			throw (new ErrorListaVacia());
		}

	}

	public void listarVehiculosOrdenadosPorPrecio() throws ErrorListaVacia {
		Collections.sort(vehiculos, new ComparadorDeVehiculos());
		if (vehiculos.size() > 0) {
			for (Vehiculo esteVehiculo : vehiculos) {
				System.out.println(esteVehiculo.getMarca() + " " + esteVehiculo.getModelo());
			}
		} else {
			throw (new ErrorListaVacia());
		}
	}

}
