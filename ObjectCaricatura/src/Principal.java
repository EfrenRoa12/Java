import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	String nombre;
	String horario;
	int capitulo;
	Caricatura cari = null;
	
	Caricatura mt=null;
	int menu, menuE;
	Scanner lec=null;	

	Implementacion imp = new Implementacion();
	
	do {
		System.out.println("bienvenidos a canal de caricatura: ");
		System.out.println("menu deopciones: ");
		
		System.out.println("1)alta: ");
		System.out.println("2)editar hora: ");
		System.out.println("3)eliminar: ");
		System.out.println("4)buscar: ");
		System.out.println("5)mostrar: ");
		System.out.println("6)salir: ");
		lec = new Scanner(System.in);
		menu = lec.nextInt();

		// que opcion elije usuario
		switch (menu) {
		case 1:
			System.out.println("alta caricatura: ");
			

			System.out.println("escribe el nombre");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();

			System.out.println("escribe el horario");
			lec = new Scanner(System.in);
			horario = lec.nextLine();
			System.out.println("escribe el capitulo");
			lec = new Scanner(System.in);
			capitulo = lec.nextInt();

			//mt =  MediosTransporte("", "", 4, "");
			mt = new Caricatura(nombre, horario, capitulo);
			
			imp.guardar(cari);
			System.out.println("se guardo caricatura" + mt.getNombre());

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
					System.out.println("escribe la hora: ");
					lec = new Scanner(System.in);
					horario = lec.nextLine();
					mt.setHorario(horario);

					break;

				}// cierra switch e

			} while (menuE < 3);
			mt.setNombre(nombre);
			//mt.set(nombre, mt);// indice y objeto se edita la lista
			System.out.println("Se edito la caricatura-----> " + mt.getNombre());
			break;
			
			
			
		case 3:
			System.out.println("escribe nombre de la caricatura a editar");//nos muestra el cambio quese hizo
			lec=new Scanner(System.in);
			nombre = lec.nextLine();
			mt=new Caricatura(nombre);
			imp.eliminar(mt);
			System.out.println("la caricatura se ha eliminado es: "+mt.getNombre());
			//System.out.println("la computadora elimada fue:---->" + mt);

			break;
		case 4:
			System.out.println("escribe el nombre de la caricatura a buscar");
			lec = new Scanner(System.in);
			nombre = lec.nextLine();
			mt = new Caricatura(nombre);
			mt = (Caricatura) imp.buscar(mt);
			System.out.println("la Caricatura encontrado es: " + mt);

			break;
		case 5:
			System.out.println(mt);
			break;
		case 6:
			System.out.println("byer");
			break;

		}// cierra switch

	} while (menu < 6);
	
		
	
	

		
		}
	}