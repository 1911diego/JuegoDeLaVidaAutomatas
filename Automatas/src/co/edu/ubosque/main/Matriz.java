package co.edu.ubosque.main;

import java.util.Arrays;
import java.util.List;
/**
 * Método que recibe la matríz a calcular la siguiente generación
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
	 * Método que calcula la siguiente generación, utiliza condicionales para validar en donde se encuentra la célula y así asignar cuales son
	 * las células adyacentes
	 * @param m, la matriz a calcular la próxima generación
	 * @return matriz resultante con la nueva generación
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
	 * Método que calcula el estado de cada célula bajo las reglas propuestas
	 * @param a, lista con los valores adyacentes de la célula a buscar
	 * @return int, si es 1 la célula está viva, si es 0 está muerta
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
