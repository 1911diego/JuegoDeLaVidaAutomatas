package com.edu.ubosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Clase que modela la vista
 * @author Diego Torres
 *
 */
public class View extends JFrame {

	public View() {
		setSize(760, 400);
		setTitle("Juego de la Vida");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel label = new JLabel("Juego de la Vida");
		label.setBounds(240, 20, 300, 50);
		label.setFont(new Font("helvetica", 0, 30));
		getContentPane().add(label);

		JLabel primero = new JLabel("1ra Generación");
		primero.setBounds(30, 70, 200, 30);
		primero.setFont(new Font("helvetica", 0, 20));
		getContentPane().add(primero);
		
		JLabel segundo = new JLabel("2da Generación");
		segundo.setBounds(200, 70, 200, 30);
		segundo.setFont(new Font("helvetica", 0, 20));
		getContentPane().add(segundo);
		
		JLabel tercero = new JLabel("3ra Generación");
		tercero.setBounds(370, 70, 200, 30);
		tercero.setFont(new Font("helvetica", 0, 20));
		getContentPane().add(tercero);
		
		JLabel cuarto = new JLabel("4ta Generación");
		cuarto.setBounds(540, 70, 200, 30);
		cuarto.setFont(new Font("helvetica", 0, 20));
		getContentPane().add(cuarto);

		setVisible(true);

	}

	/**
	 * Método que muestra la primera generación
	 * @param matriz, la matríz a mostrar
	 * @param x, posición en x
	 * @param y, posición en y
	 */
	public void cuadricula1(int[][] matriz, int x, int y) {

		JButton[][] cuadricula1 = new JButton[5][5];

		int posX = x;
		int posY = y;
		for (int i = 0; i < cuadricula1.length; i++) {
			for (int j = 0; j < cuadricula1[0].length; j++) {
				cuadricula1[i][j] = new JButton();
				cuadricula1[i][j].setBounds(posX, posY, 30, 30);
				if (matriz[i][j] == 1) {
					cuadricula1[i][j].setBackground(Color.green);
				} else {
					cuadricula1[i][j].setBackground(Color.blue);
				}
				cuadricula1[i][j].setEnabled(false);
				getContentPane().add(cuadricula1[i][j]);
				if (posX < (x + 120)) {
					posX += 30;
				} else {
					posX = x;
					posY += 30;
				}

			}
		}
	}

	/**
	 * Método que muestra la segunda generación
	 * @param matriz, la matríz a mostrar
	 * @param x, posición en x
	 * @param y, posición en y
	 */
	public void cuadricula2(int[][] matriz, int x, int y) {

		JButton[][] cuadricula2 = new JButton[5][5];

		int posX = x;
		int posY = y;
		for (int i = 0; i < cuadricula2.length; i++) {
			for (int j = 0; j < cuadricula2[0].length; j++) {
				cuadricula2[i][j] = new JButton();
				cuadricula2[i][j].setBounds(posX, posY, 30, 30);
				if (matriz[i][j] == 1) {
					cuadricula2[i][j].setBackground(Color.green);
				} else {
					cuadricula2[i][j].setBackground(Color.blue);
				}
				cuadricula2[i][j].setEnabled(false);
				getContentPane().add(cuadricula2[i][j]);
				if (posX < (x + 120)) {
					posX += 30;
				} else {
					posX = x;
					posY += 30;
				}

			}
		}
	}

	/**
	 * Método que muestra la tercera generación
	 * @param matriz, la matríz a mostrar
	 * @param x, posición en x
	 * @param y, posición en y
	 */
	public void cuadricula3(int[][] matriz, int x, int y) {

		JButton[][] cuadricula3 = new JButton[5][5];

		int posX = x;
		int posY = y;
		for (int i = 0; i < cuadricula3.length; i++) {
			for (int j = 0; j < cuadricula3[0].length; j++) {
				cuadricula3[i][j] = new JButton();
				cuadricula3[i][j].setBounds(posX, posY, 30, 30);
				if (matriz[i][j] == 1) {
					cuadricula3[i][j].setBackground(Color.green);
				} else {
					cuadricula3[i][j].setBackground(Color.blue);
				}
				cuadricula3[i][j].setEnabled(false);
				getContentPane().add(cuadricula3[i][j]);
				if (posX < (x + 120)) {
					posX += 30;
				} else {
					posX = x;
					posY += 30;
				}

			}
		}
	}
	
	/**
	 * Método que muestra la cuarta generación
	 * @param matriz, la matríz a mostrar
	 * @param x, posición en x
	 * @param y, posición en y
	 */
	public void cuadricula4(int[][] matriz, int x, int y) {

		JButton[][] cuadricula4 = new JButton[5][5];

		int posX = x;
		int posY = y;
		for (int i = 0; i < cuadricula4.length; i++) {
			for (int j = 0; j < cuadricula4[0].length; j++) {
				cuadricula4[i][j] = new JButton();
				cuadricula4[i][j].setBounds(posX, posY, 30, 30);
				if (matriz[i][j] == 1) {
					cuadricula4[i][j].setBackground(Color.green);
				} else {
					cuadricula4[i][j].setBackground(Color.blue);
				}
				cuadricula4[i][j].setEnabled(false);
				getContentPane().add(cuadricula4[i][j]);
				if (posX < (x + 120)) {
					posX += 30;
				} else {
					posX = x;
					posY += 30;
				}

			}
		}
	}
}
