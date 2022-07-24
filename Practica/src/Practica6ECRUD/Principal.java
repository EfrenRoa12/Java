package Practica6ECRUD;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// LOS MISMOS ATRIBUTOS DE LA CLASE PERRO LOS TOMAMPS
		String nombre;
		int edad;
		String color;
		int peso;
		// ES INTANCIA DE LA CLASE PERRO
		Perro Pe = null;
		// ES PARA QUE PUEDA IMPRIMIR EN SCANNER
		Scanner entrada = null;
		// validar los casos del menu
		int menu = 0;
		try {
		do {
			// CREAMOS EL MENU DE OPCIONES
			System.out.println("Bienvenido a mascotas Enucom");
			System.out.println("Menu de opciones");
			System.out.println("1) Alta");
			System.out.println("2) Editar Nombre");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");

			entrada = new Scanner(System.in);
			menu = entrada.nextInt();
			// CREAMOS EL MENU
			switch (menu) {
			case 1:
				System.out.println("Escribe el Nombre:");
				entrada = new Scanner(System.in);
				nombre = entrada.next();

				System.out.println("Escribe el Edad:");
				entrada = new Scanner(System.in);
				edad = entrada.nextInt();

				System.out.println("Escribe la Color:");
				entrada = new Scanner(System.in);
				color = entrada.next();

				System.out.println("Escribe la Precio:");
				entrada = new Scanner(System.in);
				peso = entrada.nextInt();

				// creamos la instanciacion
				Pe = new Perro();

				// VAMOS A SETTEARLO--->QUE SIGNIFICA QUE DONDE DICE 
				// --Escribe el nobre EL USUARIO LE VA A PONER EL NOMBRE Y YA ESTA SETEADO
				// SETEARLO
				Pe.setNombre(nombre);
				Pe.setEdad(edad);
				Pe.setColor(color);
				Pe.setPeso(peso);
				System.out.println("se dio de alta " + Pe.getNombre());

				break;

			case 2:
				// editamos elprecio
				System.out.println("Escribe nuevo nombre");
				entrada = new Scanner(System.in);
				nombre = entrada.next();
				Pe.setNombre(nombre);
				System.out.println("Nuevo precio");
				break;
			case 3:
				System.out.println("Los datos del perro es");
				System.out.println("Nombre: --->" + Pe.getNombre());
				System.out.println("Edad --->: " + Pe.getEdad());
				System.out.println("Color:---> " + Pe.getColor());
				System.out.println("Peso: --->" + Pe.getPeso());
				break;
			case 4:
				System.out.println("Salir");
				break;
			}

		} while (menu < 3);
		}//finaliza while
		catch (Exception e) { // resto de excepciones de tipo Exception y derivadas
			System.out.println("Error inesperado ingrese solo numeros en opcion ");
		}//finaliza catch

	}//finaliza main

}//finaliza clase

	
