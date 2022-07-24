package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _11cifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
		Scanner entrada = new Scanner(System.in);
		int numero1;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

		if (numero1 < 10) {

			JOptionPane.showMessageDialog(null, "el numero: " + numero1 + "tiene 1 cifra");

		} else if (numero1 < 100) {

			JOptionPane.showMessageDialog(null, "el numero: " + numero1 + "tiene 2 cifra");
		} else if (numero1 < 1000) {// numero 2 es diferente de 0

			JOptionPane.showMessageDialog(null, "el numero: " + numero1 + "tiene 3 cifra");
		} else if (numero1 < 10000) {// numero 2 es diferente de 0

			JOptionPane.showMessageDialog(null, "el numero: " + numero1 + "tiene 4 cifra");
		} else if (numero1 < 100000) {// numero 2 es diferente de 0

			JOptionPane.showMessageDialog(null, "el numero: " + numero1 + "tiene 4 cifra");
		} else {

			JOptionPane.showMessageDialog(null, " : ");
		}
	}

}
