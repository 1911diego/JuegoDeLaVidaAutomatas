package co.edu.ubosque.main;

import java.util.Arrays;
import java.util.List;
/**
 * M�todo que recibe la matr�z a calcular la siguiente generaci�n
 * @author Diego Torres
 *
 */
public class Matriz {

	private int filas;
	private int columnas;
	
	/**
	 * Constructor
	 */
	public Matriz() {
		filas = 4;
		columnas = 4;
	}
	
	/**
	 * M�todo que calcula la siguiente generaci�n, utiliza condicionales para validar en donde se encuentra la c�lula y as� asignar cuales son
	 * las c�lulas adyacentes
	 * @param m, la matriz a calcular la pr�xima generaci�n
	 * @return matriz resultante con la nueva generaci�n
	 */
	public int[][] calcularGeneracion(int[][]m) {
		int[][] matrizResultante = new int[5][5];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if((i==0 && j==0)) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas][columnas],m[filas][j],m[filas][j+1],m[i][columnas],
							m[i][j],m[i][j+1],m[i+1][columnas],m[i+1][j],m[i+1][j+1]));
				}else if(i==0 && j== columnas) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas][columnas-1],m[filas][columnas],m[filas][0],m[i][columnas-1],
							m[i][columnas],m[i][0],m[i+1][columnas-1],m[i+1][columnas],m[i+1][0]));	
				}else if(i==filas && j==0) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas-1][columnas],m[filas-1][j],m[filas-1][j+1],m[filas][columnas],
							m[filas][j],m[filas][j+1],m[0][columnas],m[0][j],m[0][j+1]));	
				}else if(i==filas && j==columnas) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas-1][columnas-1],m[filas-1][columnas],m[filas-1][0],m[filas][columnas-1],
							m[filas][columnas],m[filas][0],m[0][columnas-1],m[0][columnas],m[0][0]));	
				}else if(i>0 && i<filas && j==0) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[i-1][columnas],m[i-1][j],m[i-1][j+1],m[i][columnas],m[i][j],m[i][j+1],
							m[i+1][columnas],m[i+1][j],m[i+1][j+1]));
				}else if(j>0 && j<columnas && i==0) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas][j-1],m[filas][j],m[filas][j+1],m[i][j-1],m[i][j],m[i][j+1],
							m[i+1][j-1],m[i+1][j],m[i+1][j+1]));
				}else if(i>0 && i<filas && j==columnas) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[i-1][j-1],m[i-1][j],m[i-1][0],m[i][j-1],m[i][j],m[i][0],
							m[i+1][j-1],m[i+1][j],m[i+1][0]));
				} else if(j>0 && j<columnas && i==filas) {
					matrizResultante[i][j] = resultado(Arrays.asList(m[filas-1][j-1],m[filas-1][j],m[filas-1][j+1],m[i][j-1],m[i][j],m[i][j+1],
							m[0][j-1],m[0][j],m[0][j+1]));
				}
				else {
					matrizResultante[i][j] = resultado(Arrays.asList(m[i-1][j-1],m[i-1][j],m[i-1][j+1],m[i][j-1],m[i][j],m[i][j+1],
							m[i+1][j-1],m[i+1][j],m[i+1][j+1]));
				}	
			}
		}
		return matrizResultante;
	}
	
	/**
	 * M�todo que calcula el estado de cada c�lula bajo las reglas propuestas
	 * @param a, lista con los valores adyacentes de la c�lula a buscar
	 * @return int, si es 1 la c�lula est� viva, si es 0 est� muerta
	 */
	private int resultado(List<Integer> a) {
		
		int contadorCelulas = 0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==1 && i!= 4) {
				contadorCelulas++;
			}
		}
		if(contadorCelulas<2) return 0;
	    if(contadorCelulas>3) return 0;
		if(contadorCelulas==2) return a.get(4);
		if(contadorCelulas ==3) return 1;

		return 0;
	}
	
	
}
