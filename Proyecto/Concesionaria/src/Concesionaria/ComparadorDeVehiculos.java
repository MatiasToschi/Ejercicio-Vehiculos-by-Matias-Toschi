package Concesionaria;

import java.util.Comparator;

public class ComparadorDeVehiculos implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo vehiculoA, Vehiculo vehiculoB) {
		int resultado = 0;
		if(vehiculoA.getPrecio() > vehiculoB.getPrecio()){
			resultado = -1;
		}else if (vehiculoA.getPrecio() < vehiculoB.getPrecio()) {
			resultado = 1;
		}
		return resultado;
	}

}
