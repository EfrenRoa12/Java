import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		
		System.out.print("digita el primer numero: ");
		numero1 = entrada.nextInt();
		System.out.print("digita el segundo numero: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.print("el resultado es: "+resultado);

	}

}
