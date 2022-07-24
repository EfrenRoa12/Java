import java.util.Scanner;

public class Chicharronera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double a, b, c, resultado1, resultado2;

		System.out.println("digite el valor de a: ");
		a = entrada.nextDouble();

		System.out.println("digite el valor de b: ");
		b = entrada.nextDouble();

		System.out.println("digite el valor de c: ");
		c = entrada.nextDouble();

		resultado1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		resultado2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		System.out.println("el primer resultado es: " + resultado1);
		System.out.println("el segundo resultado es: " + resultado2);

	}

}
