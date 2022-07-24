package Quinta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int dato;

		dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero: "));

		switch (dato) {
		case 1:
			JOptionPane.showMessageDialog(null, "es el numero 1");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "es el numero 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "es el numero 3");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "es el numero 4");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "es el numero 5");
			break;
		default:
			JOptionPane.showMessageDialog(null, "el numero no esta en el rango de 1 a 5");
		}
	}

}
