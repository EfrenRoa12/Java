package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _1if_condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int num, numer, numero, dato = 5;

		numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

		if (numero == dato) {// FORMAS DE COMPARAR NUMERO TAMBIEN PODEMOS UTILIZARLOS NUMERO >= DATO
			JOptionPane.showMessageDialog(null, "el numero es 5: ");// se pone null con message
		} else {
			JOptionPane.showMessageDialog(null, "el numero es diferente de 5: ");
		}
		// ------------------------------------------------------------------------------------------numero
		// igual
		numer = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

		if (numer != dato) {// FORMAS DE COMPARAR NUMERO TAMBIEN PODEMOS UTILIZARLOS NUMERO >= DATO
			JOptionPane.showMessageDialog(null, "el numero es 5: ");// se pone null con message
		} else {
			JOptionPane.showMessageDialog(null, "el numero es diferente de 5: ");
		}
		// ----------------------------------------------------------------------------------------numero
		// mayor
		num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

		if (num != dato) {// FORMAS DE COMPARAR NUMERO TAMBIEN PODEMOS UTILIZARLOS NUMERO >= DATO
			JOptionPane.showMessageDialog(null, "el numero es mayor a 5: ");// se pone null con message
		} else {
			JOptionPane.showMessageDialog(null, "el numero es menor o igual: ");
		}
		// -------------------------------------------------------------------------------------
		int nu;
		nu = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

		if (nu <= dato) {// FORMAS DE COMPARAR NUMERO TAMBIEN PODEMOS UTILIZARLOS NUMERO >= DATO
			JOptionPane.showMessageDialog(null, "el numero es menor a 5: ");// se pone null con message
		} else {
			JOptionPane.showMessageDialog(null, "el numero es mayor a 5:: ");

		}
	}

}
