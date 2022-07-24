package Segundo;

import java.util.Scanner;

public class Incremento_decremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int x = 5;

		x++;// equivale x + 1

		System.out.println(x);// al 5 aumentaa uno serian 6
		// ----------------------------------------------------decremento
		int y = 5;

		y--;// equivale x + 1

		System.out.println(x);
		// --------------------------------EJERCICIO----------------------------

		int o = 5, p;

		p = o++;

		System.out.println("p");// la salida es 5
		System.out.println("o");// vale 6
	}

}
