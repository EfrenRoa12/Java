package Practica8ECRUD;

import java.util.Scanner;

import Practica7ECRUD.Auto;

public class Principal {

	public static void main(String[] args) {
		// MISMOA ATRIBUTOS QUE LA CLASE
		String nombre_m;
		String apellido;
		int edad;
		String especialidad;
		String universidad;
		// CREAMOS INSTANCIA
		Medico medico = null;
		// CREAMMOS SCANNER PARA IMPRIMIR
		Scanner imprime = null;
		// CREAMOS EL MEU DANDO VALOR A 0
		int menu = 0;
		// CREAMOS EL TRY CACTH
		try {
			do {
				// CREAMOS EL MENU DE OPCIONES
				System.out.println("Bienvenido a Medico Enucom");
				System.out.println("Menu de opciones");
				System.out.println("1) Alta");
				System.out.println("2) Editar Medico");
				System.out.println("3) Mostrar");
				System.out.println("4) Salir");

				imprime = new Scanner(System.in);
				menu = imprime.nextInt();
				// CREAMOS EL MENU
				switch (menu) {
				case 1:
					System.out.println("Escribe el nombre del medico:");
					imprime = new Scanner(System.in);
					nombre_m = imprime.next();

					System.out.println("Escribe el apellido:");
					imprime = new Scanner(System.in);
					apellido = imprime.next();

					System.out.println("Escribe la edad:");
					imprime = new Scanner(System.in);
					edad = imprime.nextInt();

					System.out.println("Escribe la especialidad:");
					imprime = new Scanner(System.in);
					especialidad = imprime.nextLine();
					
					System.out.println("Escribe la universidad:");
					imprime = new Scanner(System.in);
					universidad = imprime.nextLine();

					// CREAMOS LA INSTANCIA DESDE LA CLASE AUTO
					medico = new Medico();

					// VAMOS A SETTEARLO--->QUE SIGNIFICA QUE DONDE DICE
					// --Escribe el nobre EL USUARIO LE VA A PONER EL NOMBRE Y YA ESTA SETEADO
					// SETEARLO
					medico.setNombre_m(nombre_m);
					medico.setApellido(apellido);
					medico.setEdad(edad);
					medico.setEspecialidad(especialidad);
					medico.setUniversidad(universidad);
					System.out.println("se dio de alta " + medico.getNombre_m());

					break;

				case 2:
					// editamos elprecio
					System.out.println("Escribe el nombre nuevo del medico");
					imprime = new Scanner(System.in);
					nombre_m = imprime.next();
					medico.setNombre_m(nombre_m);
					System.out.println("Nueva marca");
					break;
				case 3:
					// VA A MOSTRAR LOS DATOS E IMPRIME CON CASE LLAMANDOLO OPCION3 EJECUTA
					// Y CON GET OBTENIDA LOS VALORES PODEMOS IMPRIMIRLO Y MOSTRAR LOS DATOS
					// OBTENIDOS PRIMERO RGISTRADO CLARO
					System.out.println("Los datos del Medico es");
					System.out.println("Nombre: --->" + medico.getNombre_m());
					System.out.println("apellido --->: " + medico.getApellido());
					System.out.println("edad:---> " + medico.getEdad());
					System.out.println("especialidad: --->" + medico.getEspecialidad());
					System.out.println("universidad: --->" + medico.getUniversidad());
					break;
				case 4:
					System.out.println("Salir");
					break;
				}

			} while (menu < 3);
		} catch (Exception e) {
			System.out.println("Error intenta nuevamente pendejo");
		} // cierra el cath

	}// cierra menu

}// cierra clase
