package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _6mayuscula_minuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer nuero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite segundo nuero: "));

		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "el numero mayor es: " + numero1);
		} else if (numero2 > numero1) {
			JOptionPane.showMessageDialog(null, "el numero mayor es: " + numero2);
		} else {
			JOptionPane.showMessageDialog(null, "ambos numeros son iguales ");
		}
	}

}
