package Practica11Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Practica9LLista.Celular;

public class Principal {

	public static void main(String[] args) {
		//
		String nombre;
		String tipo_escuela;
		int n_alumnos;
		int n_profesores;
		int n_aulas;
		// INSTANCIAMOS
		Escuela escuela = null;
		// CREAMOS ACANNER PARA IMPRIMIR
		Scanner imprime = null;
		// MENU
		int menu = 0, indice, menuL;
		// LISTA REFERENTE A ESCUELA
		List<Escuela> lista = new ArrayList<Escuela>();
		try {
			// INICIAMOS DO PARA EL MENU
			do {
				// MENU DE LISTA
				System.out.println("*** Celular Enucom ***");
				System.out.println("MENU");
				System.out.println("1)ALTA");
				System.out.println("2)EDITAR");
				System.out.println("3)ELIMINAR");
				System.out.println("4)MOSTRAR");
				System.out.println("5)BUSCAR");
				System.out.println("6)CONTAR");
				System.out.println("7)VACIAR");
				System.out.println("8)SALIR");
				// es para referenciar al imprimir
				imprime = new Scanner(System.in);//
				menu = imprime.nextInt();

				switch (menu) {

				case 1:
					// ALTA
					System.out.println("Escribe el nombre de la escuela");
					imprime = new Scanner(System.in);
					nombre = imprime.nextLine();//

					System.out.println("Escribe el tipo de escuela");
					imprime = new Scanner(System.in);
					tipo_escuela = imprime.nextLine();//

					System.out.println("Escribe el numero de alumnos");
					imprime = new Scanner(System.in);
					n_alumnos = imprime.nextInt();

					System.out.println("Escribe el numero de profesores");
					imprime = new Scanner(System.in);
					n_profesores = imprime.nextInt();//
					
					System.out.println("Escribe el numero de aulas");
					imprime = new Scanner(System.in);
					n_aulas = imprime.nextInt();//

					// LISTA DE DATOS-- DONDE SE HAN GUARDADO A LA HORA DE QUE EL USUARIO INSERTAR
					// LOS DATOS
					// TODOS SE GUARDARON EN cel YA QUE ESTA INSTANCIADO E IMPRIME POR TO STRING
					escuela = new Escuela(nombre,tipo_escuela,n_alumnos,n_profesores,n_aulas);
					lista.add(escuela);
					// IPRIME LO DATOS DEL CANTATE
					System.out.println("Se dio de alta la escuela: " + escuela);// COMO ESTA INSTANCIADA VIENE DE TOS TRING

					break;

				case 2:
					// EDITAR
					// 1 BUSCAMOS POR INDICE (NUMERO)--depende cuantos hemos agregado es el numero
					// de indice
					// CLARO DESDE LA POSICION 0 1 2 3 4 5 6 7
					System.out.println("Escribe el indice a editar de la lista: ");
					imprime = new Scanner(System.in);
					indice = imprime.nextInt();//
					// 2 buscamos
					escuela = lista.get(indice);

					do {
						// INSERTAMOS EL NUMERO DE LA OPCION A EDITAR
						System.out.println("que quiere editar de la lista: ");
						System.out.println("1) nombre: ");
						System.out.println("2) tipo de escuela: ");
						System.out.println("3) numero de alumnios: ");
						System.out.println("4) numero de profesores: ");
						System.out.println("5) numero de aulas: ");
						System.out.println("6) menu principal: ");
						imprime = new Scanner(System.in);
						menuL = imprime.nextInt();

						switch (menuL) {
						case 1:
							// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
							System.out.println("escribe el nombre nuevo de la escuela: ");
							imprime = new Scanner(System.in);
							nombre = imprime.nextLine();
							// SETEARLO
							escuela.setNombre(nombre);

							break;

						case 2:
							System.out.println("escribe el tipo: ");
							imprime = new Scanner(System.in);
							tipo_escuela = imprime.nextLine();
							// SETEARLO
							escuela.setTipo_escuela(tipo_escuela);

							break;
						case 3:
							// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
							System.out.println("escribe el el nuevo numero de alumnos: ");
							imprime = new Scanner(System.in);
							n_alumnos = imprime.nextInt();
							// SETEARLO
							escuela.setN_alumnos(n_alumnos);

							break;

						case 4:
							System.out.println("escribe el numero nuevo de profesores: ");
							imprime = new Scanner(System.in);
							n_profesores = imprime.nextInt();
							// SETEARLO
							escuela.setN_profesores(n_profesores);

							break;
						case 5:
							System.out.println("escribe el nuevo numero de aulas: ");
							imprime = new Scanner(System.in);
							n_aulas = imprime.nextInt();
							// SETEARLO
							escuela.setN_aulas(n_aulas);

							break;

						}// cierra switch

					} while (menuL < 6);

					lista.set(indice, escuela);// indice y objeto se edita la lista
					System.out.println("Se ha editado correctamente-----> " + escuela.getNombre());
					break;

				case 3:
					System.out.println("Escribe el indice a Eliminar ");
					imprime = new Scanner(System.in);// ESCOGEMOS LA POSICION(INDICE) A ELIMINAR
					indice = imprime.nextInt();// convertir en entero
					escuela = lista.get(indice);// la variable cantante es igual a lo que obtenga de acuerdo al indice
					lista.remove(indice);
					System.out.println("escuela elimado es:---->" + escuela);

					break;
				case 4:
					// CON EL METODO TO STRING FUNCIONA DE UNA MANERA QUE IMPRIME
					System.out.println(lista);
					break;
				case 5:
					System.out.println("Buscar por indice");
					imprime = new Scanner(System.in);// INSERTAMOS EL INDICE 0 1 2 3 LOS QUE REGISTRAMOS CUAL VAMOS A
														// ELIMINAR
					indice = imprime.nextInt();// convertir en entero
					escuela = lista.get(indice);
					System.out.println("escuela encontrada es --->" + escuela);

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

		} catch (Exception e) {
			System.out.println("Error intenta nuevamente");
		} // FINALIZA CATCH
	}// FINALIZA MAIN

}// FINALIZA CLASE
