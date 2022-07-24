import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int id;
		String nombre;
		String genero;
		double precio;

		Libros lib = null;
		int menu = 0, indice, menuL;

		Scanner lec = null;
		List<Libros> lista = new ArrayList<Libros>();
		do {

			System.out.println("*** Biblioteca Enucom ***");
			System.out.println("MENU");
			System.out.println("1)ALTA");
			System.out.println("2)EDITAR");
			System.out.println("3)ELIMINAR");
			System.out.println("4)MOSTRAR");
			System.out.println("5)BUSCAR");
			System.out.println("6)CONTAR");
			System.out.println("7)VACIAR");

			System.out.println("8)SALIR");

			lec = new Scanner(System.in);// 
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opcion Alta");
				System.out.println("Escribe el id");
				lec = new Scanner(System.in);
				id = lec.nextInt();// convert

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();// 
				
				System.out.println("Escribe el genero");
				lec = new Scanner(System.in);
				genero = lec.nextLine();//

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();// 

				// lista de los datos
				lib = new Libros(id,nombre,genero,precio);
				lista.add(lib);
				System.out.println("Se dio de alta el libro: " + lib);// compu ya trae todas las caracteristicas

				break;

			case 2:
				// Editar
				// 1buscamos
				System.out.println("Escribe el indice a editar de la lista: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();// 
				// 2 buscamos
				lib = lista.get(indice);

				// que cambiamos
				do {

					System.out.println("que quiere editar de la lista: ");
					System.out.println("1) id: ");
					System.out.println("2) nombre: ");
					System.out.println("3) genero: ");
					System.out.println("4) precio: ");
					System.out.println("5) menu principal: ");
					lec = new Scanner(System.in);
					menuL = lec.nextInt();

					switch (menuL) {
					case 1:
						System.out.println("escribe el id del libro: ");
						lec = new Scanner(System.in);
						id = lec.nextInt();

						lib.setId(id);//lo seteamos

						break;

					case 2:
						// cambiamos el nombre
						System.out.println("escribe el nombre del libro: ");
						lec = new Scanner(System.in);
						nombre = lec.nextLine();
						lib.setNombre(nombre);

						break;
					case 3:
						

						// cambiamos el genero
						System.out.println("escribe el genero del libro: ");
						lec = new Scanner(System.in);
						genero = lec.nextLine();
						lib.setGenero(genero);
						break;

					case 4:
						// cambiamos el precio
						System.out.println("escribe el precio de la nueva computadora: ");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						lib.setPrecio(precio);

						break;

					}// cierra switch 

				} while (menuL < 5);
				
				lista.set(indice, lib);// indice y objeto se edita la lista
				System.out.println("Se edito la computadora-----> " + lib.getGenero());
				break;

			case 3:
				System.out.println("Escribe el indice a Eliminar ");
				lec = new Scanner(System.in);// dato de teclado
				indice = lec.nextInt();// convertir en entero
				lib = lista.get(indice);// la variable computadora es igual a lo que obtenga de acuerdo al indice
				lista.remove(indice);
				System.out.println("el libro elimada fue:---->" + lib);

				break;
			case 4:
				System.out.println(lista);
				break;
			case 5:
				System.out.println("Buscar");
				lec = new Scanner(System.in);// dato de teclado
				indice = lec.nextInt();// convertir en entero
				lib = lista.get(indice);
				System.out.println("el libro encontrada es --->" + lib);

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
