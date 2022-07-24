import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// NOS TRAEMOS LOS ATRIBUTOS DE MEDIOS DE TRANSPORTE
		String nombre;// key-->
		String tipo;
		double costo;
		int pasajeros;
		// CREAMOS LA INSTANCIA
		MedioTransporte mt = null;
		// DECARAMOS VARIABLES PARA MENU
		int menu, menuE;
		// PARA IPRIMIR--INTRODUZCA DE TECLADO LA OPCION
		Scanner lec = null;
		// PARA LLMAR A CADA UNO DE LOS METODOS
		ImpMT imp = new ImpMT();
		do {
			// OPERACIONES QUE SE REALIZA EN UNA OPERACION
			System.out.println("Bienvenido a sus medios de transporte ");
			System.out.println("Menu de opciones ");
			System.out.println("1) Alta");
			System.out.println("2) Editar");
			System.out.println("3) Eliminar");
			System.out.println("4) Buscar");
			System.out.println("5) Buscar por tipo");
			System.out.println("6) Contar");
			System.out.println("7) Eliminr todo");
			System.out.println("8) Vaciar");
			System.out.println("9) Mostrar");
			System.out.println("10) Salir");
			//PERMITE EL FLUJO DE ENTRADA A LA CLASE SCANNER CUANDO LOESTANCAI UNA VEZ CUANDO LA PERSONA INTRODUCE LA OPCION SE GUARDA EN LEC
			lec = new Scanner(System.in);
			//AL OBJETO LEC DE TIPO SCANER LO CONVERTIMOS DE TIPO ENTERO COMO EL POLIMORFISMO DE MUCHASFORMAS
			menu = lec.nextInt();
			//MENU
			switch (menu) {

			}

		} while (menu < 10);

	}
}
