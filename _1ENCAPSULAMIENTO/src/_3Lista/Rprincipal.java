package _3Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String bebida;
		String tipo;
		int porcion;
		int precio;
		// nombre, bebida, tipo, porcion, precio
		// INSTANCIAMOS
		Restaurante restaurante = null;
		// DECLARAMOS LOS MENU
		int menu = 0, indice, menuE;
		// ES PARA IMPRIMIR
		Scanner entrada = null;
		// CREAMOS LA LISTA--DONDE LE PONEMOS DE NOMBRE lista
		List<Restaurante> lista = new ArrayList<Restaurante>();

		do {
			try {

			System.out.println("*** Tienda de Computadoras Enucom ***");
			System.out.println("---MENU---");
			System.out.println("1) Agregar");
			System.out.println("2) Editar");
			System.out.println("3) Eliminar");
			System.out.println("4) Mostrar");
			System.out.println("5) Buscar");
			System.out.println("6) Contar");
			System.out.println("7) Vaciar");
			System.out.println("8) Salir");

			entrada = new Scanner(System.in);// funcion para que lea desde teclado
			menu = entrada.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opcion Agregar");
				System.out.println("Escriba el nombre");
				entrada = new Scanner(System.in);
				nombre = entrada.nextLine();// convertimos en caracter

				System.out.println("Escribe la  bebida ");
				entrada = new Scanner(System.in);
				bebida = entrada.nextLine();// convertimos en caracter
				
				System.out.println("Escribe el tipo ");
				entrada = new Scanner(System.in);
				tipo = entrada.nextLine();// convertimos en caracter

				System.out.println("Escribe la porcion");
				entrada = new Scanner(System.in);
				porcion = entrada.nextInt();//

				System.out.println("Escribe el precio");
				entrada = new Scanner(System.in);
				precio = entrada.nextInt();// convertimos en caracter

				// trae la lista de los datos
				restaurante = new Restaurante(nombre, bebida, tipo, porcion, precio);
				lista.add(restaurante);
				System.out.println("Se dio de alta el restaurante: " + restaurante);// compu ya trae todas las
				
				
				break;

			case 2:
				// Editar
				// primero buscamos
				System.out.println("Escribe el indice a editar de la lista: ");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();// lo comvertimos en entero
				// buscamos
				restaurante = lista.get(indice);

				// que cambiamos
				do {
					
					System.out.println("Opcion a editar: ");
					System.out.println("1) Nombre: ");
					System.out.println("2) Bebida: ");
					System.out.println("3) Tipo: ");
					System.out.println("4) Porcion: ");
					System.out.println("5) Precio: ");
					System.out.println("6) Menu ");
					entrada = new Scanner(System.in);
					menuE = entrada.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("escribe el nombre: ");
						entrada = new Scanner(System.in);
						nombre = entrada.next();

						restaurante.setNombre(nombre);// es lo que cambiamos lo seteamos

						break;
					
					case 2:
						// cambiamos el precio
						System.out.println("escribe la bebida: ");
						entrada = new Scanner(System.in);
						bebida = entrada.next();
						restaurante.setBebida(bebida);

						break;
					case 3:// nombre, bebida, tipo, porcion, precio
						System.out.println("escribe el tipo: ");
						entrada = new Scanner(System.in);
						tipo = entrada.next();

						restaurante.setNombre(tipo);// es lo que cambiamos lo seteamos

						break;
					
					case 4:
						// cambiamos el precio
						System.out.println("escribe la porcion: ");
						entrada = new Scanner(System.in);
						porcion = entrada.nextInt();
						restaurante.setPrecio(porcion);

						break;
					case 5:
						System.out.println("escribe el precio: ");
						entrada = new Scanner(System.in);
						precio = entrada.nextInt();

						restaurante.setPrecio(precio);// es lo que cambiamos lo seteamos

						break;
					// nombre, bebida, tipo, porcion, precio Restaurante restaurante
					case 6:
						// cambiamos el precio
						System.out.println("salir: ");

						break;

					}// cierra switch e

				} while (menuE < 6);
				lista.set(indice, restaurante);// indice y objeto se edita la lista
				System.out.println("Se edito el restaurante-----> " + restaurante.getNombre());
				break;

			case 3:
				System.out.println("Escribe el indice a Eliminar ");
				entrada = new Scanner(System.in);// dato de teclado
				indice = entrada.nextInt();// convertir en entero
				restaurante = lista.get(indice);// la variable computadora es igual a lo que obtenga de acuerdo al
												// indice
				lista.remove(indice);
				System.out.println("la computadora elimada fue:---->" + restaurante);

				break;
			case 4:
				System.out.println(lista);
				break;
			case 5:
				System.out.println("Buscar");
				entrada = new Scanner(System.in);// dato de teclado
				indice = entrada.nextInt();// convertir en entero
				restaurante = lista.get(indice);
				System.out.println("la comida encontrada es --->" + restaurante);

				break;
			case 6:
				System.out.println("la lista tiene: " + lista.size());// cuenta cuentos elementos tiene

				break;
			case 7:

				lista.clear();
				System.out.println("se eliminaro todos los elementos de la lista ");

				break;
			case 8:
				System.out.println("Bye");
				break;

			}// cierra switch
			}catch(Exception e) {
				System.out.println("Error itente  nuevamente");
			}

		} while (menu < 8);

	}

}
