package Errores;

public class ErrorMinimoNoEncontrado extends Exception {

	public ErrorMinimoNoEncontrado() {
		super("No se encontro un vehiculo m�s barato, verifique si la lista no esta vacia");
	}
}
