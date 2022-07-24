package _5InterfaceCRUDLista;

import java.util.Scanner;

import _3Lista.Restaurante;
import _4InterfaceLista.Implemenacion;

public class Principal {

	public static void main(String[] args) {
		// CREAMOS METODOS DE LA CLASE
		String nombre;
		String modelo;
		String marca;
		int serie;
		// INSTANCIAMOS
		Celular celular = null;
		// DECLARAMOS EL MENU
		int menu = 0, indice, menuE;
		// PARA IMPRIMIR
		Scanner entrada = null;
		Implementacion implementacion = new Implementacion();
		do {
			try {

				System.out.println("*** Tienda de Computadoras Enucom ***");
				System.out.println("---MENU---");
				System.out.println("1) Agregar");
				System.out.println("2) Editar");
				System.out.println("3) Eliminar");
				System.out.println("4) buscar por indice");
				System.out.println("5) buscar por nombre");
				System.out.println("6) contar");
				System.out.println("7) mostrar");
				System.out.println("8) Vaciar");
				System.out.println("9) salir");

				

				entrada = new Scanner(System.in);
				menu = entrada.nextInt();
				switch (menu) {
				case 1:
					System.out.println("ALTA DE SOPAS");

					System.out.println("Escribe el nombre");
					entrada = new Scanner(System.in);
					nombre = entrada.nextLine();

					System.out.println("Escribe el modelo");
					entrada = new Scanner(System.in);
					modelo = entrada.next();

					System.out.println("Escribe la marca");
					entrada = new Scanner(System.in);
					marca = entrada.next();

					System.out.println("Escribe la serie");
					entrada = new Scanner(System.in);
					serie = entrada.nextInt();

					celular = new Celular(nombre, modelo, marca, serie);
					implementacion.guardar(celular);
					System.out.println("Se guardo la sopa " + celular.getNombre());
					break;
				case 2:
					System.out.println("Escribe el indice a editar");
					entrada = new Scanner(System.in);
					indice = entrada.nextInt();
					celular = implementacion.buscar(indice);
					do {
						System.out.println("Escoge por que deceas editar");
						System.out.println("1 nombre");
						System.out.println("2 modelo");
						System.out.println("3 marca");
						System.out.println("4 serie");
						System.out.println("5 menu principal");

						entrada = new Scanner(System.in);
						menuE = entrada.nextInt();

						switch (menuE) {
						case 1:
							System.out.println("Escribe el nombre");
							entrada = new Scanner(System.in);
							nombre = entrada.next();
							celular.setNombre(nombre);
							break;
						case 2:// nombre, modelo, marca, serie
							System.out.println("Escribe el modelo");
							entrada = new Scanner(System.in);
							modelo = entrada.next();
							celular.setModelo(modelo);
							break;
						case 3:
							System.out.println("Escribe la marca");
							entrada = new Scanner(System.in);
							marca = entrada.next();
							celular.setMarca(marca);
							break;
						case 4:
							System.out.println("Escribe la serie");
							entrada = new Scanner(System.in);
							serie = entrada.nextInt();
							celular.setSerie(serie);
							break;
						case 5:
							System.out.println("Salir");

							break;
						}// cierra switchE
					} while (menuE < 5);
					implementacion.editar(indice, celular);
					System.out.println("Se edito la sopa " + celular);
					break;
				case 3:

					System.out.println("Escribe el indice a eliminar");
					entrada = new Scanner(System.in);
					indice = entrada.nextInt();
					celular = implementacion.buscar(indice);
					implementacion.eliminar(indice);
					System.out.println("Se elimino la sopa " + celular.getNombre());

					break;
				case 4:
					System.out.println("Escribe el indice a buscar");
					entrada = new Scanner(System.in);
					indice = entrada.nextInt();
					celular = implementacion.buscar(indice);
					System.out.println("sopa encontrada->" + celular);
					break;
				case 5:
					System.out.println("Escribe el nombre a buscar");
					entrada = new Scanner(System.in);
					nombre = entrada.nextLine();
					// ropa = new ropa();
					// ropa.setNombre(nombre);
					/*
					 * se coloca el tip de dato los metodo contructor nombre
					 */
					celular.setNombre(nombre);
					// ropa = new Ropa(nombre);
					// ropa = new Ropa();
					implementacion.buscarNombre(celular);

					break;
				case 6:
					implementacion.contar();
					break;
				case 7:
					implementacion.mostrar();
					break;
				case 8:
					implementacion.clear();
					System.out.println("se eliminaro todos los elementos de la lista ");

					break;
				case 9:
					System.out.println("bye");
					break;
				}// cierra menu
			} catch (Exception e) {
				System.out.println("Error itente  nuevamente");
			}

		} while (menu < 9);

	}

}
