package Errores;

public class ErrorMaximoNoEncontrado extends Exception {

	public ErrorMaximoNoEncontrado() {
		super("No se encontro un vehiculo m�s caro, verifique si la lista no esta vacia");
	}
}
