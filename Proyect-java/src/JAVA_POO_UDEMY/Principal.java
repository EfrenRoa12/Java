package JAVA_POO_UDEMY;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String color;
		String marca;
		int km;
		Conceptos coche1 = new Conceptos();//se instancia de conceptos
		
		//RELLENAMOS LOS ATRIBUTOS DEL COCHE
		coche1.color = "blanco";
		coche1.marca = "audi";
		coche1.km = 0;
		
		System.out.println("el color del coche 1 es: "+coche1.color);
		System.out.println("la marca del coche 1 es: "+coche1.marca);
		System.out.println("el kilometro del coche 1 es: "+coche1.km);
		
		
		Conceptos coche2 = new Conceptos();
		
		coche2.color = "azul";
		coche2.marca = "ferrari";
		coche2.km = 10;
		
		System.out.println("\nel color del coche 1 es: "+coche2.color);
		System.out.println("la marca del coche 1 es: "+coche2.marca);
		System.out.println("el kilometro del coche 1 es: "+coche2.km);
	}

}
