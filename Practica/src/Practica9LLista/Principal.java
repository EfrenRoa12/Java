package Practica9LLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// ATRIBUTOS
		String marca;
		String modelo;
		String tipo;
		int anio_lanzamiento;
		// INSTANCIAMOS LA CLASE CELULAR
		Celular cel = null;
		// DECLARAMOS LOS MENUs de opcion
		int menu = 0, indice, menuL;
		// ES PARA IMPRIMIR
		Scanner imprime = null;
		// CREAMOS LA LISTA--DONDE LE PONEMOS DE NOMBRE lista
		List<Celular> lista = new ArrayList<Celular>();
		// CREAMOS EL TRY CACTH PAR LAS EXCEPCIONES
		try {
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
				//es para referenciar al imprimir
				imprime = new Scanner(System.in);//
				menu = imprime.nextInt();

				switch (menu) {

				case 1:
					// ALTA
					System.out.println("Escribe el marca");
					imprime = new Scanner(System.in);
					marca = imprime.nextLine();//

					System.out.println("Escribe la modelo");
					imprime = new Scanner(System.in);
					modelo = imprime.nextLine();//

					System.out.println("Escribe el tipo de gama");
					imprime = new Scanner(System.in);
					tipo = imprime.nextLine();//

					System.out.println("Escribe el año lanzamiento");
					imprime = new Scanner(System.in);
					anio_lanzamiento = imprime.nextInt();//

					// LISTA DE DATOS-- DONDE SE HAN GUARDADO A LA HORA DE QUE EL USUARIO INSERTAR
					// LOS DATOS
					// TODOS SE GUARDARON EN cel YA QUE ESTA INSTANCIADO E IMPRIME POR TO STRING
					cel = new Celular(marca,modelo,tipo,anio_lanzamiento);
					lista.add(cel);
					// IPRIME LO DATOS DEL CANTATE
					System.out.println("Se dio de alta el celular: " + cel);//COMO ESTA INSTANCIADA VIENE DE TOS TRING

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
					cel = lista.get(indice);

					do {
						// INSERTAMOS EL NUMERO DE LA OPCION A EDITAR
						System.out.println("que quiere editar de la lista: ");
						System.out.println("1) marca: ");
						System.out.println("2) modelo: ");
						System.out.println("3) tipo gama: ");
						System.out.println("4) lanzamiento: ");
						System.out.println("5) menu principal: ");
						imprime = new Scanner(System.in);
						menuL = imprime.nextInt();

						switch (menuL) {
						case 1:
							// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
							System.out.println("escribe el nombre nuevo de la marca: ");
							imprime = new Scanner(System.in);
							marca = imprime.nextLine();
							// SETEARLO
							cel.setMarca(marca);

							break;

						case 2:
							System.out.println("escribe el nuevo nombre del modelo: ");
							imprime = new Scanner(System.in);
							modelo = imprime.nextLine();
							// SETEARLO
							cel.setModelo(modelo);

							break;
						case 3:
							// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
							System.out.println("escribe el nombre nuevo tipo de gama: ");
							imprime = new Scanner(System.in);
							tipo = imprime.nextLine();
							// SETEARLO
							cel.setTipo(tipo);

							break;

						case 4:
							System.out.println("escribe el nuevo año de lanzamiento: ");
							imprime = new Scanner(System.in);
							anio_lanzamiento = imprime.nextInt();
							// SETEARLO
							cel.setAnio_lanzamiento(anio_lanzamiento);

							break;

						}// cierra switch

					} while (menuL < 5);

					lista.set(indice, cel);// indice y objeto se edita la lista
					System.out.println("Se ha editado correctamente-----> " + cel.getMarca());
					break;

				case 3:
					System.out.println("Escribe el indice a Eliminar ");
					imprime = new Scanner(System.in);// ESCOGEMOS LA POSICION(INDICE) A ELIMINAR
					indice = imprime.nextInt();// convertir en entero
					cel = lista.get(indice);// la variable cantante es igual a lo que obtenga de acuerdo al indice
					lista.remove(indice);
					System.out.println("Celular elimado es:---->" + cel);

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
					cel = lista.get(indice);
					System.out.println("celular encontrado es --->" + cel);

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
		} // FINALIZA EL TRY CATCH

	}// FINALIZA MAIN

}// FINALIZA LA CLASE
