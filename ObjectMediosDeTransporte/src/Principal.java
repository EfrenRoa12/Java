import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;//key
		String tipo;
		double costo;
		int pasajeros;
		
		MediosTransporte mt = null;
		int menu, menuE;
		Scanner lec = null;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("bienvenidos a sus medios de transporte: ");
			System.out.println("menu deopciones: ");

			System.out.println("1)alta: ");
			System.out.println("2)editar: ");
			System.out.println("3)editar nombre: ");
			System.out.println("4)buscar: ");
			System.out.println("5)buscar por tipo: ");
			System.out.println("6)contar: ");
			System.out.println("7)eliminar todo: ");
			System.out.println("8)vaciar: ");
			System.out.println("9)mostrar: ");
			System.out.println("10)salir: ");
			lec = new Scanner(System.in);
			menu = lec.nextInt();

			// que opcion elije usuario
			switch (menu) {
			case 1:
				System.out.println("alta medios de transporte: ");
				System.out.println("escriba el nombre: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("escribe el tipo");
				lec = new Scanner(System.in);
				tipo = lec.nextLine();

				System.out.println("escribe el costo");
				lec = new Scanner(System.in);
				costo = lec.nextInt();

				System.out.println("escribe el pasajero");
				lec = new Scanner(System.in);
				pasajeros = lec.nextInt();

				//mt =  MediosTransporte("", "", 4, "");
				mt = new MediosTransporte(nombre, tipo, costo, pasajeros);
				
				imp.guardar(mt);
				System.out.println("se guardo el medio de transporte" + mt.getNombre());

				break;
			case 2:
				// Editar
				// primero buscamos
				System.out.println("Escribe el nombre a editar de la lista: ");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();// lo comvertimos en entero
				// buscamos
				//mt = mt.getNombre();

				// que cambiamos
				do {

					System.out.println("que quiere editar de la lista: ");
					System.out.println("1) nombre: ");
					System.out.println("2) hora: ");
					System.out.println("3) menu principal: ");
					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("escribe el nuevo nombre: ");
						lec = new Scanner(System.in);
						nombre = lec.nextLine();

						mt.setNombre(nombre);// es lo que cambiamos lo seteamos

						break;

					case 2:
						// cambiamos el precio
						System.out.println("escribe el costo nuevo: ");
						lec = new Scanner(System.in);
						costo = lec.nextDouble();
						mt.setCosto(costo);

						break;

					}// cierra switch e

				} while (menuE < 3);
				mt.setNombre(nombre);
				//mt.set(nombre, mt);// indice y objeto se edita la lista
				System.out.println("Se edito el transporte-----> " + mt.getNombre());
				break;
				
				
				
			case 3:
				System.out.println("escribe nombre de la caricatura a editar");//nos muestra el cambio quese hizo
				lec=new Scanner(System.in);
				nombre = lec.nextLine();
				mt=new MediosTransporte(nombre);
				imp.eliminar(mt);
				System.out.println("la caricatura se ha eliminado es: "+mt.getNombre());
				//System.out.println("la computadora elimada fue:---->" + mt);

				break;
			case 4:
				System.out.println("escribe el nombre del medio de transporte a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				mt = new MediosTransporte(nombre);
				mt = (MediosTransporte) imp.buscar(mt);
				System.out.println("el mt encontrado es: " + mt);

				break;
			case 5:
				System.out.println("escribe el tipo del medio de transporte a buscar");
				lec = new Scanner(System.in);
				tipo = lec.nextLine();
				mt = new MediosTransporte(tipo);
				mt.setTipo(tipo);
				imp.buscar(mt);
				// imp.buscar(tipo);

				break;
			case 6:
				imp.contar();
				break;

			case 7:
				imp.eliminar(mt);
				// imp.eliminar(imp);
				break;

			case 8:
				imp.eliminarTodo(mt);
				// imp.vaciar();
				break;
			case 9:
				//imp.mostrar();
				System.out.println(mt);//mt es iprimw busqueda
				//imp.mostrar(imp);
				break;
			case 10:
				System.out.println("byer");
				break;

			}// cierra switch

		} while (menu < 10);

	}

}
