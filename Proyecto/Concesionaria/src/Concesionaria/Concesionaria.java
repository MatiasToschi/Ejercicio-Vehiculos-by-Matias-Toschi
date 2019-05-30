package Concesionaria;

import java.util.ArrayList;

import Errores.ErrorListaVacia;
import Errores.ErrorMaximoNoEncontrado;

public class Concesionaria {

	private ArrayList<Vehiculo> vehiculos;
	
	public Concesionaria() {
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void agregarNuevoVehiculo(Vehiculo nuevoVehiculo) {
			vehiculos.add(nuevoVehiculo);
	}
	
	public void listarVehiculos() throws ErrorListaVacia {
		if(vehiculos.size() > 0) {
			for(Vehiculo esteVehiculo : vehiculos) {
				System.out.println(esteVehiculo);
			}
		}else{
			throw(new ErrorListaVacia());
		}
		
	}
	
	public void mostrarVehiculoMasCaro () throws ErrorListaVacia, ErrorMaximoNoEncontrado {
		Vehiculo masCaro = null;
		float mayorPrecio = 0;
		if(vehiculos.size() > 0) {
			for(Vehiculo esteVehiculo : vehiculos) {
				if(mayorPrecio < esteVehiculo.getPrecio()) {
					mayorPrecio = esteVehiculo.getPrecio();
					masCaro = esteVehiculo;
				}
			}
			if(masCaro != null) {
				System.out.println("Vehiculo más caro:" + masCaro.getMarca() + " " + masCaro.getModelo());
			}else {
				throw(new ErrorMaximoNoEncontrado());
			}
		}else{
			throw(new ErrorListaVacia());
		}
	}
	
	public void mostrarVehiculoMasBarato () throws ErrorListaVacia {
		if(vehiculos.size() > 0) {
			for(Vehiculo esteVehiculo : vehiculos) {
			}
		}else{
			throw(new ErrorListaVacia());
		}
	}
	
	public void listarVehiculosOrdenadosPorPrecio () throws ErrorListaVacia {
		if(vehiculos.size() > 0) {
			for(Vehiculo esteVehiculo : vehiculos) {
			}
		}else{
			throw(new ErrorListaVacia());
		}
	}

}
