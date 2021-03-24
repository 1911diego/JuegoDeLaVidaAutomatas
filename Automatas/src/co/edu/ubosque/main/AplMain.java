package co.edu.ubosque.main;

/**
 * Clase que inicia la aplicaci�n
 * reglas de los estados:
 * 	Si una c�lula tiene menos de dos vecinos vivos, muere.
 *Si una c�lula tiene m�s de tres vecinos vivos, muere.
 *	Si una c�lula tiene exactamente 2 vecinos vivos, permanece igual
 *	Si una c�lula tiene exactamente 3 vecinos vivos:
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
