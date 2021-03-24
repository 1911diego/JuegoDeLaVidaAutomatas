package co.edu.ubosque.main;

/**
 * Clase que inicia la aplicación
 * reglas de los estados:
 * 	Si una célula tiene menos de dos vecinos vivos, muere.
 *Si una célula tiene más de tres vecinos vivos, muere.
 *	Si una célula tiene exactamente 2 vecinos vivos, permanece igual
 *	Si una célula tiene exactamente 3 vecinos vivos:
 *	Si estaba muerta, revive
 *	Si estaba viva, permanece igual

 * @author Diego Torres
 *
 */

public class AplMain {

	public static void main(String[] args) {
		Controller c = new Controller();
	}
}
