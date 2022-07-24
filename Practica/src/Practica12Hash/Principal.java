package Practica12Hash;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// ATRIBUTOS
		String nombre_hospital;
		String tipo;
		String direccion;
		String horario;
		int numero_personal;
		int numero_pacientes;
		
		// DECLARAMOS EL ATRIBUTO DE LA CLASE
		// DELARAMOS LA VARIABLE --- MEDIOS DE TRANPORTE LLAMANDO DESDE SU CLASE
		Hospital hospitall;
		// CREAMOS EL MENU DE INDICE
		int menu = 0, menuE, indice;
		// les ES PARA SCNNER IMPRIME
		Scanner imprime = null;
		// INSTANCIAMOS LA IMPLEMENTACION QUE VIENE DE LOS METODS LASACCIONES A REALIZAR
		Implemenacion implementacion = new Implemenacion();
		do {
			//CREAMOS EL CATCH PARA LAS EXCEPCIONES
			try {//SIEMPRE SE COLOCA DENTRO DE DO PARA QUE FUNCIONE
			//CREAMOS EL MENU
			System.out.println("Bienvenidos al hospital Enucom");
			System.out.println("*** Menu ***");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar por nombre");
			System.out.println("5 mostrar");
			System.out.println("6 salir");
			
			//ES PARA IMPRIMIR
			imprime = new Scanner(System.in);
			//INSTANCIAMOS DONDE NICIALIZAMOS 
			menu = imprime.nextInt();
			//CUANDO EL USUARIO DA LA INDICACION DE LA OPCION 1 DAMOS ALTA
			switch (menu) {
			case 1:
				System.out.println("ALTA HOSPITAL");

				System.out.println("Escribe el nombre");
				imprime = new Scanner(System.in);
				nombre_hospital = imprime.nextLine();

				System.out.println("Escribe la tipo");
				imprime = new Scanner(System.in);
				tipo = imprime.nextLine();
				
				System.out.println("Escribe la direccion");
				imprime = new Scanner(System.in);
				direccion = imprime.nextLine();

				System.out.println("Escribe el numero de personal");
				imprime = new Scanner(System.in);
				numero_personal = imprime.nextInt();

				System.out.println("Escribe el numero de paciente");
				imprime = new Scanner(System.in);
				numero_pacientes = imprime.nextInt();

				//TRANSPORTE ESTA DECLARADO COMO MEDIOS DE TRANSPORTE---Y LE PASAMOS LOS PARAMETROS
				//LO GUARDAMOS EN TRANSPORTE PARA QUE LO IMPRIMA
				hospitall = new Hospital(nombre_hospital);//*********
				//IMPRIME LOS DATOS DONDE EL USUARIO DIO DE ALTA EL TRANSPORTE Y MUESTRA QUE ES LO QUE DIO DE ALTA
				System.out.println("Se guardo el transporte " + hospitall.getNombre_hospital());
				break;
			case 2:
				//OPCION DE EDITAR
				System.out.println("Escribe el indice a editar");
				imprime = new Scanner(System.in);
				indice = imprime.nextInt();
				//BUSCA EL NUMERO DE INDICE A EDITAR -- UNA VEZ ENCONTRADA NOS MANDA A INDICAR QUE ES LO QUE VAMOS  A EDITAR
				
				hospitall = implementacion.buscar(indice);
				do {
					//NOS DA LA OPCION A EDITAR
					
					System.out.println("Escoge por que deceas editar");
					System.out.println("1 nombre de hospital");
					System.out.println("2 tipo");
					System.out.println("3 direccion");
					System.out.println("4 nuermo personal");
					System.out.println("5 nuero pacientes");
					System.out.println("6 menu principal");
					//LEC ES PARA IM´PRIMIR
					imprime = new Scanner(System.in);
					//NOS DA LA OPCION DE EDITAR
					menuE = imprime.nextInt();

					switch (menuE) {
					case 1:
						//DIGITAMOS LOS CAMBIOS A EDITAR
						System.out.println("Escribe el nuevo nombre de hospital");
						imprime = new Scanner(System.in);
						nombre_hospital = imprime.next();
						hospitall.setNombre_hospital(nombre_hospital);
						break;
					case 2:
						
						System.out.println("Escribe el tipo de hospital");
						imprime = new Scanner(System.in);
						tipo = imprime.nextLine();
						hospitall.setTipo(tipo);
						break;
					case 3:
						//DIGITAMOS LOS CAMBIOS A EDITAR
						System.out.println("Escribe la nueva direccion del hospital");
						imprime = new Scanner(System.in);
						direccion = imprime.next();
						hospitall.setDireccion(direccion);
						break;
					case 4:
						//DIGITAMOS LOS CAMBIOS A EDITAR
						System.out.println("Escribe el nuevo numero de personal");
						imprime = new Scanner(System.in);
						numero_personal = imprime.nextInt();
						hospitall.setNumero_personal(numero_personal);
						break;
					case 5:
						//DIGITAMOS LOS CAMBIOS A EDITAR
						System.out.println("Escribe el nuevo nombre de pacientes");
						imprime = new Scanner(System.in);
						numero_pacientes = imprime.nextInt();
						hospitall.setNumero_pacientes(numero_pacientes);
						break;
						
					}// cierra switchE
				} while (menuE < 6);
				//GUARDAMOS QUE ES LO QUE EDITAMOS
				implementacion.editar(indice, hospitall);
				//NOS MUESTRA COMO QUEDO LO QUE EDITAMOS
				System.out.println("Se edito el hospital " + hospitall);
				break;
			case 3:
				//EL CASO 3 EN GENERAL VOLVEMOS ESCRIBIMOS QUE ES LO QUE VAMOS A ELIMINAR Y LA FUNCION HACE LO SIGUIENTE 
				//CLARO CON LOS METODOS DECLARADOS DESDE LA IMPLEMENTAACION PORQUE YA ES DINAMICA

				//LO BUSCAMOS POR INDICE A ELIMINAR
				System.out.println("Escribe el indice a eliminar");
				imprime = new Scanner(System.in);
				indice = imprime.nextInt();
				//EL TRANSPORTE DECLARADO DE LA CLASE MEDIOS DE TRANSPORTE HACE REFERENCIA
				hospitall = implementacion.buscar(indice);
				//LO CASTEAMOS--DE IMPLEMENTACION---BUSCA POR INDICE
				//ELIMINA EL INDICE
				implementacion.eliminar(indice);
				//MUESTRA EL INDICE QUE SE ELIMINO
				System.out.println("Se elimino el hospital " + hospitall.getNombre_hospital());

				break;
			case 4:
				//BUSCA EL REGISTRO POR INDICE
				System.out.println("Escribe el indice a buscar");
				imprime = new Scanner(System.in);
				indice = imprime.nextInt();
				//TRANSPORTE DE CLASE DE IMPLEMENTACION LO BUSCA POR INDICE
				hospitall = implementacion.buscar(indice);
				//IMPRIME EL INDICE ENCONTRADO
				System.out.println("hospital encontrada->" + hospitall);
				break;
			
			case 5:
				//imp VIENE DECLARACION DE IMPLEMENTACION E IMPLEMENTACION EL METODO
				//ASI MUESTRA
				implementacion.mostrar();
				break;
			case 6:
				System.out.println("bye");
				break;
			}// cierra menu	
			}catch(Exception e) {
				System.out.println("Error intenta nuevamente");
			}//CIERRA CATCH
			
		}while(menu<8);

	}

}
