import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellidoP;
		String nombreA;
		String genero;
		int edad;
		//INSTANCIAMOS
		Cantante cant = null;
		//DECLARAMOS LOS MENU
		int menu = 0, indice, menuL;
		//ES PARA IMPRIMIR
		Scanner lec = null;
		//CREAMOS LA LISTA--DONDE LE PONEMOS DE NOMBRE lista 
		List<Cantante> lista = new ArrayList<Cantante>();

		do {
			//MENU DE LISTA
			System.out.println("*** Discografia Enucom ***");
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
				//ALTA
				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();//

				System.out.println("Escribe el apellido");
				lec = new Scanner(System.in);
				apellidoP = lec.nextLine();//

				System.out.println("Escribe el nombre artistico");
				lec = new Scanner(System.in);
				nombreA = lec.nextLine();//

				System.out.println("Escribe el genero");
				lec = new Scanner(System.in);
				genero = lec.nextLine();//

				System.out.println("Escribe la edad");
				lec = new Scanner(System.in);
				edad = lec.nextInt();

				// LISTA DE DATOS-- DONDE SE HAN GUARDADO A LA HORA DE QUE EL USUARIO INSERTAR LOS DATOS
				//TODOS SE GUARDARON EN CANT
				cant = new Cantante(nombre, apellidoP, nombreA, genero, edad);
				lista.add(cant);
				//IPRIME LO DATOS DEL CANTATE
				System.out.println("Se dio de alta el cantante: " + cant);//

				break;

			case 2:
				// EDITAR
				// 1 BUSCAMOS POR INDICE (NUMERO)--depende cuantos hemos agregado es el numero de indice 
				//CLARO DESDE LA POSICION 0 1 2 3 4 5 6 7
				System.out.println("Escribe el indice a editar de la lista: ");
				lec = new Scanner(System.in);
				indice = lec.nextInt();//
				// 2 buscamos
				cant = lista.get(indice);

				
				do {
					//INSERTAMOS EL NUMERO DE LA OPCION A EDITAR
					System.out.println("que quiere editar de la lista: ");

					System.out.println("1) nombre: ");
					System.out.println("2) genero: ");
					System.out.println("3) menu principal: ");
					lec = new Scanner(System.in);
					menuL = lec.nextInt();

					switch (menuL) {
					case 1:
						// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
						System.out.println("escribe el nombre del cantante: ");
						lec = new Scanner(System.in);
						nombre = lec.nextLine();
						//SETEARLO
						cant.setNombre(nombre);

						break;

					case 2:
						System.out.println("escribe el genero de la musica: ");
						lec = new Scanner(System.in);
						genero = lec.nextLine();
						//SETEARLO
						cant.setGenero(genero);

						break;

					}// cierra switch

				} while (menuL < 3);

				lista.set(indice, cant);// indice y objeto se edita la lista
				System.out.println("Se ha editado correctamente-----> " + cant.getGenero());
				break;

			case 3:
				System.out.println("Escribe el indice a Eliminar ");
				lec = new Scanner(System.in);// ESCOGEMOS LA POSICION(INDICE) A ELIMINAR
				indice = lec.nextInt();// convertir en entero
				cant = lista.get(indice);// la variable cantante es igual a lo que obtenga de acuerdo al indice
				lista.remove(indice);
				System.out.println("cantante elimado es:---->" + cant);

				break;
			case 4:
				//CON EL METODO TO STRING FUNCIONA DE UNA MANERA QUE IMPRIME
				System.out.println(lista);
				break;
			case 5:
				System.out.println("Buscar");
				lec = new Scanner(System.in);// INSERTAMOS EL INDICE  0 1 2 3 LOS QUE REGISTRAMOS CUAL VAMOS A ELIMINAR
				indice = lec.nextInt();// convertir en entero
				cant = lista.get(indice);
				System.out.println("cantante encontrado es --->" + cant);

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
