import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		String nombre;
		String tipo;
		double precio;
		String color = null;
		Ropa ropa;
		int menu, menuE, indice;
		Scanner lec = null;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("Bienvenidos a su tienda de ropa Enucom");
			System.out.println("*** Menu ***");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar por indice");
			System.out.println("5 buscar por nombre");
			System.out.println("6 contar");
			System.out.println("7 mostrar");
			System.out.println("8 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();
			switch (menu) {
			case 1:
				System.out.println("ALTA ROPA");

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe la tipo");
				lec = new Scanner(System.in);
				tipo = lec.nextLine();

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe el color");
				lec = new Scanner(System.in);
				color = lec.nextLine();

				ropa = new Ropa(nombre, tipo, precio, color);
				imp.guardar(ropa);
				System.out.println("Se guardo la ropa " + ropa.getNombre());
				break;
			case 2:
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				ropa = imp.buscar(indice);
				do {
					System.out.println("Escoge opcion a editar");
					System.out.println("1 nombre");
					System.out.println("2 precio");
					System.out.println("3 menu principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("Escribe el nuevo nombre");
						lec = new Scanner(System.in);
						nombre = lec.nextLine();
						ropa.setNombre(nombre);
						break;
					case 2:

						System.out.println("Escribe el nuevo precio");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						ropa.setPrecio(precio);
						break;
					}// cierra switchE
				} while (menuE < 3);
				imp.editar(indice, ropa);
				System.out.println("Se edito la ropa " + ropa);
				break;
			case 3:
				System.out.println("Escribe el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				ropa = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Se elimino la ropa " + ropa.getNombre());
				break;
			case 4:
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				ropa = imp.buscar(indice);
				System.out.println("ropa encontrada->" + ropa);
				break;
			case 5:
				System.out.println("Escribe el nombre a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				// ropa = new ropa();
				// ropa.setNombre(nombre);
				/*
				 * se coloca el tip de dato los metodo contructor nombre
				 */
				ropa = new Ropa(nombre, null, 0, null);

				// ropa = new Ropa(nombre);
				// ropa = new Ropa();
				imp.buscarNombre(ropa);

				break;
			case 6:
				imp.contar();
				break;
			case 7:
				imp.mostrar();
				break;
			case 8:
				System.out.println("bye");
				break;
			}// cierra menu
		} while (menu < 8);
	}// cierra main
	/*
	 * System.out.println("1 alta");
	 * System.out.println("2 editar->habitantes->CAPITAL");
	 * System.out.println("3 eliminar"); System.out.println("4 buscar por indice");
	 * System.out.println("5 buscar por nombre"); System.out.println("6 contar");
	 * System.out.println("7 mostrar"); System.out.println("8 salir");
	 * 
	 * 9 ELIMINAR TODO 10 VACIA
	 * 
	 * 
	 * Crud->Pais->String nombre, String capital, int habitantes, double territorio
	 * 
	 */

}
