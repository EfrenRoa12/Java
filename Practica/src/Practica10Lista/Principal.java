package Practica10Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Practica9LLista.Celular;

public class Principal {

	public static void main(String[] args) {
		//ESTABLECEMOS LAS VARIABLES MISMAS QUE LAS CLASES
		String marca;
		String modelo;
		String color;
		int anio;
		//INSTANCIAMOS
		Auto auto = null;
		//CREAMOS EL SCANNER PARA IPRIMIR
		Scanner imprime = null;
		//CREAMOS EL MENU
		int menu = 0, indice, menuL;
		// CREAMOS LA LISTA--DONDE LE PONEMOS DE NOMBRE lista
		List<Auto> lista = new ArrayList<Auto>();
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

					System.out.println("Escribe el color");
					imprime = new Scanner(System.in);
					color = imprime.nextLine();//

					System.out.println("Escribe el año");
					imprime = new Scanner(System.in);
					anio = imprime.nextInt();//

					// LISTA DE DATOS-- DONDE SE HAN GUARDADO A LA HORA DE QUE EL USUARIO INSERTAR
					// LOS DATOS
					// TODOS SE GUARDARON EN cel YA QUE ESTA INSTANCIADO E IMPRIME POR TO STRING
					auto = new Auto(marca,modelo,color,anio);
					lista.add(auto);
					// IPRIME LO DATOS DEL CANTATE
					System.out.println("Se dio de alta el celular: " + auto);//COMO ESTA INSTANCIADA VIENE DE TOS TRING

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
					auto = lista.get(indice);

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
							auto.setMarca(marca);

							break;

						case 2:
							System.out.println("escribe el nuevo nombre del modelo: ");
							imprime = new Scanner(System.in);
							modelo = imprime.nextLine();
							// SETEARLO
							auto.setModelo(modelo);

							break;
						case 3:
							// VAMOS A SETTEARLO--->DARLE NUEVO NOBRE--CAMBIARLO
							System.out.println("escribe el color: ");
							imprime = new Scanner(System.in);
							color = imprime.nextLine();
							// SETEARLO
							auto.setColor(color);

							break;

						case 4:
							System.out.println("escribe el nuevo año : ");
							imprime = new Scanner(System.in);
							anio = imprime.nextInt();
							// SETEARLO
							auto.setAnio(anio);

							break;

						}// cierra switch

					} while (menuL < 5);

					lista.set(indice, auto);// indice y objeto se edita la lista
					System.out.println("Se ha editado correctamente-----> " + auto.getMarca());
					break;

				case 3:
					System.out.println("Escribe el indice a Eliminar ");
					imprime = new Scanner(System.in);// ESCOGEMOS LA POSICION(INDICE) A ELIMINAR
					indice = imprime.nextInt();// convertir en entero
					auto = lista.get(indice);// la variable cantante es igual a lo que obtenga de acuerdo al indice
					lista.remove(indice);
					System.out.println("Auto elimado es:---->" + auto);

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
					auto = lista.get(indice);
					System.out.println("auto encontrado es --->" + auto);

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

			} while (menu < 8);//FINALIZA WHILE MENU
		}catch(Exception e) {
			System.out.println("Error intente nuevamente:");
		}//FINALIZA CATCH
	}//FINALIZA MAIN

}//FINALIZA CLASE
