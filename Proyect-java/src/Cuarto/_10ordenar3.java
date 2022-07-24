package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _10ordenar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir tres numeros y mostrar odrenados de mayor a menor
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("digite el tercer numero: "));

		if ((numero1 > numero2) && (numero2 > numero3)) {

			JOptionPane.showMessageDialog(null, "orden: " + numero1 + "-" + numero2 + "-" + numero3);
		}

		else if ((numero1 > numero3) && (numero3 > numero2)) {//

			JOptionPane.showMessageDialog(null, "orden: " + numero1 + "-" + numero3 + "-" + numero2);
		} else if ((numero2 > numero1) && (numero1 > numero3)) {//

			JOptionPane.showMessageDialog(null, "orden: " + numero2 + "-" + numero1 + "-" + numero3);
		}

		else if ((numero2 > numero3) && (numero3 > numero1)) {

			JOptionPane.showMessageDialog(null, "orden: " + numero2 + "-" + numero3 + "-" + numero1);
		}

		else if ((numero3 > numero1) && (numero1 > numero2)) {
			JOptionPane.showMessageDialog(null, "orden: " + numero3 + "-" + numero1 + "-" + numero2);
		} else {
			JOptionPane.showMessageDialog(null, "orden: " + numero3 + "-" + numero2 + "-" + numero1);
		}
	}

}
