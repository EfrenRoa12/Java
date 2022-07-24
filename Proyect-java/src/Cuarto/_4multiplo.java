package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _4multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("digite un nuero: "));

		if (numero % 10 == 0) {
			JOptionPane.showMessageDialog(null, "el numero es multiplo de 10: ");
		} else {
			JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10: ");
		}
	}

}
