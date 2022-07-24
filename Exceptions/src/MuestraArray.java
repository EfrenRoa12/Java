import java.util.InputMismatchException;
import java.util.Scanner;

public class MuestraArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scanner1 =new Scanner(System.in);
	
		String entradaTeclado=null;
		int[] array = { 4, 2, 6, 7 };
		int n, n1, n2;
		boolean repetir = false;
		do {
			// anidamiento de bloques try-catch:
			try {// try mas externo
				 repetir = false;
				System.out.print("Introduce un n�mero: ");

				n1 = sc.nextInt();
				try { // mas interno
					System.out.print("Introduce otro n�mero: ");
					
					n2 = sc.nextInt();
					System.out.println(n1 + " / " + n2 + " = " + n1 / (double) n2);
					if(n2>0) {
					System.out.println("Desea Continuar no/yes");
					 scanner1 =new Scanner(System.in);
					entradaTeclado = scanner1.nextLine();
					}//if
				   if(entradaTeclado.equals("no")) {
					   System.out.println("bye");
					   repetir=true;
						
					}
					
					else if(entradaTeclado.equals("yes")) {
						//System.exit(0);
						repetir=false;
						
						
						}
					
					
				} catch (InputMismatchException e) { // es lanzada por la clase Scanner cuando el elemento recibido no
														// corresponde al tipo de dato esperado,
					sc.nextLine();
					n2 = 0;
					System.out.println("Debe introducir un n�mero");
					repetir = true;
				} catch (ArithmeticException e) { // Excepcion por una operacion aritmetica p.e:division entre cero
					sc.nextLine();
					n2 = 0;
					System.out.println("No se puede dividir por cero"+e.toString());
					repetir = true;

				} catch (IndexOutOfBoundsException e) {
					System.out.println("Debe introducir un n�mero entero > 0 y < " + array.length + " ");
					repetir = true;

				} catch (Exception e) { // resto de excepciones de tipo Exception y derivadas
					System.out.println("Error inesperado " + e.toString());
					repetir = true;
				}

				
			
				}catch (InputMismatchException e) {
            sc.nextLine();
            n1 = 0;
            System.out.println("Debe introducir un n�mero");
            repetir=true;
 
			
			//Aqui pueden habilitar esta parte de codigo
			} // try-catch mas externo

			/*try {

				muestraArray();

			} catch (ArrayIndexOutOfBoundsException e) { // no se importa ArrayIndexOutOfBoundsException
				System.out.println("Ha intentado acceder a una posicion fuera del array");// pudieramos imprimir el
																							// obj e de tipo
																							// ArrayIndex..

			} // catch arrayIndex*/

		} while (repetir==false);
	}// main

	public static void muestraArray() {// metodo donde imprime los valores del arreglo
		int[] array = { 4, 2, 6 };
		for (int i = 0; i <= 3; i++)
			System.out.println(array[i]);

	}
}
