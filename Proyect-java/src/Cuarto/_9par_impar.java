package Cuarto;

import javax.swing.JOptionPane;

public class _9par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hacer un programa que tome dos numeros y diga si ambos son pares e impares
		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero: "));

		if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {

			JOptionPane.showMessageDialog(null, "ambos numeros son pares: ");

		} else if ((numero1 % 2 != 0) && (numero2 % 2 != 0)) {// numero 2 es diferente de 0

			JOptionPane.showMessageDialog(null, "ambos numeros son impares: ");
		} else {

			JOptionPane.showMessageDialog(null, "numero par y el otro es impar: ");
		}
	}

}
