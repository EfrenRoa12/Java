import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String modelo;
		String marca;
		double precio;

		Computadora compu = null;
		int menu = 0, indice, menuE;

		Scanner lec = null;
		List<Computadora> lista = new ArrayList<Computadora>();

		do {

			System.out.println("*** Tienda de Computadoras Enucom ***");
			System.out.println("MENU");
			System.out.println("1)ALTA");
			System.out.println("2)EDITAR");
			System.out.println("3)ELIMINAR");
			System.out.println("4)MOSTRAR");
			System.out.println("5)BUSCAR");
			System.out.println("6)CONTAR");
			System.out.println("7)Vacio");

			System.out.println("8)SALI");

			lec = new Scanner(System.in);// funcion para que lea desde teclado
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opcion alta");
				System.out.println("Escriba el modelo");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();// convertimos en caracter

				System.out.println("Escribela marca de la computadora");
				lec = new Scanner(System.in);
				marca = lec.nextLine();// convertimos en caracter

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();// convertimos en caracter

				// trae la lista de los datos
				compu = new Computadora(modelo, marca, precio);
				lista.add(compu);
				System.out.println("se dio de alta la computadora: " + compu);// compu ya trae todas las caracteristicas

				break;

			case 2:
				// Editar
				// primero buscamos
				System.out.println("Escribe el indice a editar de la lista: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();// lo comvertimos en entero
				// buscamos
				compu = lista.get(indice);

				// que cambiamos
				do {

					System.out.println("que quiere editar de la lista: ");
					System.out.println("1) marca: ");
					System.out.println("2) precio: ");
					System.out.println("3) menu principal: ");
					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("escribe la marca de la nueva computadora: ");
						lec = new Scanner(System.in);
						marca = lec.nextLine();

						compu.setMarca(marca);// es lo que cambiamos lo seteamos

						break;

					case 2:
						// cambiamos el precio
						System.out.println("escribe el precio de la nueva computadora: ");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						compu.setPrecio(precio);

						break;

					}// cierra switch e

				} while (menuE < 3);
				lista.set(indice, compu);// indice y objeto se edita la lista
				System.out.println("Se edito la computadora-----> " + compu.getModelo());
				break;

			case 3:
				System.out.println("Escribe el indice a Eliminar ");
				lec = new Scanner(System.in);// dato de teclado
				indice = lec.nextInt();// convertir en entero
				compu = lista.get(indice);// la variable computadora es igual a lo que obtenga de acuerdo al indice
				lista.remove(indice);
				System.out.println("la computadora elimada fue:---->" + compu);

				break;
			case 4:
				System.out.println(lista);
				break;
			case 5:
				System.out.println("Buscar");
				lec = new Scanner(System.in);// dato de teclado
				indice = lec.nextInt();// convertir en entero
				compu = lista.get(indice);
				System.out.println("la computadora encontrada es --->" + compu);

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

		} while (menu < 8);

	}

}
