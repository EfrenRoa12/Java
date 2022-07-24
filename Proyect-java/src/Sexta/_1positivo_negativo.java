package Sexta;

import javax.swing.JOptionPane;

public class _1positivo_negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR UN NUMERO HASTA Q SE INTRODUZCA UNO NEGATIVO Y MOSTRAR CUANTOD NUMEROS
		// SE HAN INTRODUCIDO
		int numero, contador = 0;

		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero"));

		while (numero >= 0) {// mientras numero no sea negativo
			contador++;// aumentamos en 1 el contador

			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite otro numero"));
		}

		System.out.println("ha introducido " + contador + " no negativos");
	}

}
