package Errores;

public class ErrorListaVacia extends Exception{

	public ErrorListaVacia() {
		super("La lista se encuentra sin vehiculos");
	}
}
