package co.edu.ubosque.main;

import com.edu.ubosque.view.View;
/**
 * Clase que modela un controlador
 * @author Diego Torres
 *
 */
public class Controller {

	private Matriz matriz;
	
	/**
	 * Constructor del controlador
	 */
	public Controller() {
		View v = new View();
		
		matriz = new Matriz();
	
		int[][] matrizInicial = {{0,0,1,1,0},{0,1,0,1,0},{0,0,1,0,0},{0,0,1,1,1},{1,1,0,0,0}};
		
		v.cuadricula1(matrizInicial, 30, 120);
		
		int[][] primeraGeneracion = matriz.calcularGeneracion(matrizInicial);
		
		v.cuadricula2(primeraGeneracion, 200, 120);
		
		int[][] segundaGeneracion = matriz.calcularGeneracion(primeraGeneracion);
		
		v.cuadricula3(segundaGeneracion, 370, 120);
		
		int[][] terceraGeneracion = matriz.calcularGeneracion(segundaGeneracion);
		
		v.cuadricula4(terceraGeneracion, 540, 120);
		
	}
}
