import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		String tipo;
		double costo;
		int pasajero;

		// imp = new Transporte(nombre); imp.buscarNombre(imp);
		Transporte mt = null;// --------mt
		int menu, menuE, indice;
		Scanner lec = null;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("Bienvenidos a Transporte");
			System.out.println("*** Menu ***");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 mostrar");
			System.out.println("5 buscar");
			System.out.println("6 salir");
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			switch (menu) {
			case 1:
				// me pide realizar las acciones
				System.out.println("Alta de Transporte");

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el tipo");
				lec = new Scanner(System.in);
				tipo = lec.nextLine();

				System.out.println("Escribe el costo");
				lec = new Scanner(System.in);
				costo = lec.nextDouble();

				System.out.println("pasajero");
				lec = new Scanner(System.in);
				pasajero = lec.nextInt();

				// imp = new Transporte(nombre,costo, tipo, pasajero);
				imp.guardar(mt);
				System.out.println("Se guardo la El transporte " + imp.getClass());
				// System.out.println("se guardo el medio de transporte" + imp.getNombre());
				break;
			case 2:
				System.out.println("escriba el nombre a editar: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				//imp = imp.editar(imp);
				
				mt=new Transporte(nombre);
				mt=(Transporte)imp.buscar(mt);//marca error por casteo
				

				System.out.println("Escribe el nuevo nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				mt=new Transporte(nombre);
				mt=(Transporte)imp.buscar(mt);//marca error por casteo
				
				System.out.println("el nombre es"+nombre);

				break;
			case 3:
				System.out.println("escribe nombre del medio de transporte a eliminar");// nos muestra el cambio quese
				// hizo
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				mt = new Transporte(nombre);
				mt = (Transporte) imp.buscar(mt);
				imp.eliminar(mt);
				System.out.println("el mt eliminado es: " + mt.getNombre());
				
				break;
			case 4:
				System.out.println("Escribe el indice del transporte a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				mt = imp.buscar(indice);
				System.out.println("sopa encontrada->" + imp);
				
				
				System.out.println("transporte encontrada->" + imp);
				break;
			case 5:
				System.out.println("Escribe el nombre a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				// sopa = new Sopa(); //sopa.setNombre(nombre);

				// sopa = new Sopa(nombre, 0, 0, null);

				break;

			}// cierra menu } while (menu < 8);

		} while (menu < 6);
	}

}
