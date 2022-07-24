package Practica7ECRUD;

import java.util.Scanner;

import Practica6ECRUD.Perro;

public class Principal {

	public static void main(String[] args) {
		//
		// ATRIBUTOS--DE LA CLASE PRINCIPAL
		String marca;
		String color;
		int km;
		int anio;
		// ES INTANCIA DE LA CLASE Auto
		Auto Au = null;
		// ES PARA QUE PUEDA IMPRIMIR EN SCANNER
		Scanner imprime = null;
		// validar los casos del menu
		int menu = 0;
		try {
			do {
				// CREAMOS EL MENU DE OPCIONES
				System.out.println("Bienvenido a Autos Enucom");
				System.out.println("Menu de opciones");
				System.out.println("1) Alta");
				System.out.println("2) Editar Marca");
				System.out.println("3) Mostrar");
				System.out.println("4) Salir");

				imprime = new Scanner(System.in);
				menu = imprime.nextInt();
				// CREAMOS EL MENU
				switch (menu) {
				case 1:
					System.out.println("Escribe la marca:");
					imprime = new Scanner(System.in);
					marca = imprime.next();

					System.out.println("Escribe el color:");
					imprime = new Scanner(System.in);
					color = imprime.next();

					System.out.println("Escribe el kilometro:");
					imprime = new Scanner(System.in);
					km = imprime.nextInt();

					System.out.println("Escribe el año:");
					imprime = new Scanner(System.in);
					anio = imprime.nextInt();

					// CREAMOS LA INSTANCIA DESDE LA CLASE AUTO
					Au = new Auto();

					// VAMOS A SETTEARLO--->QUE SIGNIFICA QUE DONDE DICE
					// --Escribe el nobre EL USUARIO LE VA A PONER EL NOMBRE Y YA ESTA SETEADO
					// SETEARLO
					Au.setMarca(marca);
					Au.setColor(color);
					Au.setKm(km);
					Au.setAnio(anio);
					System.out.println("se dio de alta " + Au.getMarca());

					break;

				case 2:
					// editamos elprecio
					System.out.println("Escribe la nueva marca");
					imprime = new Scanner(System.in);
					marca = imprime.next();
					Au.setMarca(marca);
					System.out.println("Nueva marca");
					break;
				case 3:
					//VA A MOSTRAR LOS DATOS E IMPRIME CON CASE LLAMANDOLO OPCION3 EJECUTA
					//Y CON GET OBTENIDA LOS VALORES PODEMOS IMPRIMIRLO Y MOSTRAR LOS DATOS OBTENIDOS PRIMERO RGISTRADO CLARO
					System.out.println("Los datos del perro es");
					System.out.println("Marca: --->" + Au.getMarca());
					System.out.println("color --->: " + Au.getColor());
					System.out.println("kilometro:---> " + Au.getKm());
					System.out.println("año: --->" + Au.getAnio());
					break;
				case 4:
					System.out.println("Salir");
					break;
				}

			} while (menu < 3);

		} catch (Exception e) {// cierra try
			System.out.println("Error ingresa nuevamente por favor imbecil ");
		} // cierra catch

	}// cierra main

}// cierra clase
