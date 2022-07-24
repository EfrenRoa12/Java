package _2CRUDENCAPSULAM;

import java.util.Scanner;

public class _2Principal {
	public static void main(String[] args) {
		// MISMOS VARIABLES DE LA CLASE PERSONA
		int id;
		String nombre;
		String apellido;
		int edad;
		// VAMOS A Inatanciar
		_2Persona persona = null;
		// IMPRIME
		Scanner entrada = null;
		// ES PARA VALIDAR LOS CASOS DEL MENU
		int menu = 0;

		// CREAMOS EL DO WHILE
		do {
			try {
				System.out.println("Bienvenido al menu ");
				System.out.println("1)Alta ");
				System.out.println("2)Editar");
				System.out.println("3) Mostrar ");
				System.out.println("4) Salir ");
				// INICIALIZAMOS EL VALOR
				entrada = new Scanner(System.in);
				// INICIALIZAMOS EL MENU
				menu = entrada.nextInt();
				switch (menu) {
				
				case 1:
					System.out.println("Escribe el id: ");
					entrada = new Scanner(System.in);
					id = entrada.nextInt();
					
					System.out.println("Escribe el nombre: ");
					entrada = new Scanner(System.in);
					nombre = entrada.nextLine();
					
					System.out.println("Escribe el apellido: ");
					entrada = new Scanner(System.in);
					apellido = entrada.nextLine();
					
					System.out.println("Escribe el edad: ");
					entrada = new Scanner(System.in);
					edad = entrada.nextInt();
					
					//CREAMOS LA INSTANCIA
					persona = new _2Persona();
					//ESTABLECEMOS LOS VALORES
					persona.setNombre(nombre);
					persona.setApellido(apellido);
					persona.setEdad(edad);
					persona.setId(id);
					//MENSAJE DE ALTA
					System.out.println("Se dio de alta persona "+persona.getNombre());
					break;
				case 2:
					
					System.out.println("Escribe el nombre: ");
					entrada = new Scanner(System.in);
					nombre = entrada.nextLine();
					//ESTABLECEMOS NOMBRE NUEVO
					persona.setNombre(nombre);
					System.out.println("se edito el nombre: "+persona.getNombre());
					
					break;
				case 3:
					System.out.println("Mostrar");
					System.out.println("el id es: "+persona.getId());
					System.out.println("el nombre es: "+persona.getNombre());
					System.out.println("el apellido es: "+persona.getApellido());
					System.out.println("la edad es: "+persona.getEdad());
					
					
					break;
				case 4:
					System.out.println("salir");
					break;
				}

			} catch (Exception e) {
				System.out.println("error intente de nuevo ");
			}

		} while (menu < 4);

	}

}
