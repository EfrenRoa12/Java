import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Colocamos variables

		String Nombre;
		String Region;
		String Tamanio;
		double Precio;
		// tipo null para su registro
		Torta t = null;
		Scanner lec = null;// es el resultado a teclear

		// creacion de menu
		int menu = 0;
		do {
			System.out.println("Bienvenido al restaurante enucom");
			System.out.println("Elige una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Mostrar");
			System.out.println("3) Salir");

			lec = new Scanner(System.in);// para leerdesde teclado
			menu = lec.nextInt();
			// validar opciones
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Escriba el nombre de la torta");
				lec = new Scanner(System.in);
				Nombre = lec.nextLine();

				System.out.println("Escriba la region");
				lec = new Scanner(System.in);
				Region = lec.nextLine();

				System.out.println("Escriba el tamaño");
				lec = new Scanner(System.in);
				Tamanio = lec.nextLine();

				System.out.println("Escribe el precio");
				lec = new Scanner(System.in);
				Precio = lec.nextDouble();

				// setearlo
				t = new Torta();
				// damos de alta la torta con los siguentes atributos
				t.setNombre(Nombre);
				t.setPrecio(Precio);
				t.setRegion(Region);
				t.setTamanio(Tamanio);
				// imprime es resultado de alta
				System.out.println("Se ha dado de alta la torta cubana" + t.getNombre());

				break;
			case 2:
				// Menu Mostar-- mostramos el resultado de alta del registro
				System.out.println("El registro de la torta es: ");
				System.out.println("Nombre: " + t.getNombre());
				System.out.println("Region: " + t.getRegion());
				System.out.println("Precio: " + t.getPrecio());
				System.out.println("Tamaño: " + t.getTamanio());

				break;
			case 3:
				// Menu salir
				System.out.println("Salir");
				break;

			}

		} while (menu < 3);

	}

}
