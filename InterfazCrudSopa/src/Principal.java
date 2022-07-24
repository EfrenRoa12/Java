import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		double precio;
		int porcion;
		String sabor;
		Sopa sopa;
		
		int menu, menuE, indice;
		Scanner lec = null;
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("Bienvenidos a su tienda de comida Enucom");
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
				System.out.println("ALTA DE SOPAS");

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe la porci�n");
				lec = new Scanner(System.in);
				porcion = lec.nextInt();

				System.out.println("Escribe el sabor");
				lec = new Scanner(System.in);
				sabor = lec.nextLine();

				sopa = new Sopa(nombre, precio, porcion, sabor);
				imp.guardar(sopa);
				System.out.println("Se guardo la sopa " + sopa.getNombre());
				break;
			case 2:
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				sopa = imp.buscar(indice);
				do {
					System.out.println("Escoge por que deceas editar");
					System.out.println("1 precio");
					System.out.println("2 porcion");
					System.out.println("3 menu principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("Escribe el nuevo precio");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						sopa.setPrecio(precio);
						break;
					case 2:
						System.out.println("Escribe la nueva porci�n");
						lec = new Scanner(System.in);
						porcion = lec.nextInt();
						sopa.setPorcion(porcion);
						break;
					}// cierra switchE
				} while (menuE < 3);
				imp.editar(indice, sopa);
				System.out.println("Se edito la sopa " + sopa);
				break;
			case 3:
				
				System.out.println("Escribe el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				sopa = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Se elimino la sopa " + sopa.getNombre());
				
				
				break;
			case 4:
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				sopa = imp.buscar(indice);
				System.out.println("sopa encontrada->" + sopa);
				break;
			case 5:
				System.out.println("Escribe el nombre a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				sopa = new Sopa(nombre);
				imp.buscarNombre(sopa);
				
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
	}
}
