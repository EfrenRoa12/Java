package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _8salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// un obrero necesita calcular su salario semanalel cual se obtiene de la
		// siguiente manera
		// si trabaja 40 horas o menos se le paga $16 por hora
		// si trabaja mas de 40 horas se le paga $ 16 por cada una de las primeras 40
		// horas
		// y 20 por cada hora extra

		Scanner entrada = new Scanner(System.in);

		int hora_trabajada;
		float salario_total;

		hora_trabajada = Integer.parseInt(JOptionPane.showInputDialog("digite las horas trajadas: "));

		if (hora_trabajada <= 40) {

			salario_total = hora_trabajada * 16;

		} else {
			salario_total = (40 * 16) + ((hora_trabajada - 40) * 20);

		}

		JOptionPane.showMessageDialog(null, "el salario total es: " + salario_total);
	}

}
