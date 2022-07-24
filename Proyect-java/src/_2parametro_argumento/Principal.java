package _2parametro_argumento;

import java.util.Scanner;

import JAVA_POO_UDEMY_1operacion.Operacion;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//ATRIBUTOS
		int num1;
		int num2;
		//
		System.out.println("digite un numero: ");
		num1 = entrada.nextInt();
		System.out.println("digite un numero: ");
		num2 = entrada.nextInt();
		//INSTANCIAMOS DE LA CLASE--OP es para darle parametros
		Operac OP = new Operac();
		
		OP.sumar(num1, num2);
		OP.restar(num1, num2);
		OP.multiplicarr(num1, num2);
		OP.dividir(num1, num2);
		//MUESTRA ELL RESULTADO DESDE Operac
		OP.mostrar_resultado();
	}

}
