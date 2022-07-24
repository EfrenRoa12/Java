import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// generamos variableas
		String nombre;
		String marca;
		double precio;
		int contenido_neto;
		Refresco r = null;
		Scanner soda = null;
		//inicializamos el menu
		int menu = 0;
		// opcion de menu
		do {
			System.out.println("Refresco Enucom");
			System.out.println("Elije una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Editar Precio");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");
			
			soda = new Scanner(System.in);
			
			menu = soda.nextInt();
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Alta  Refresco");
				System.out.println("Escribe el nombre del refresco");
				soda = new Scanner(System.in);
				nombre = soda.nextLine();

				System.out.println("escribe la marca");
				soda = new Scanner(System.in);
				marca = soda.nextLine();

				System.out.println("Escribe el precio");
				soda = new Scanner(System.in);
				precio = soda.nextInt();

				System.out.println("escribe el contenido neto");
				soda = new Scanner(System.in);
				contenido_neto = soda.nextInt();


				//
				r = new Refresco(nombre, marca, precio, contenido_neto);
				System.out.println("se dio de alta el lenguaje" + r.getNombre());

				break;
			case 2:
				System.out.println("Escribe nuevo precio");
				soda = new Scanner(System.in);
				precio = soda.nextInt();

				r.setPrecio(precio);
				System.out.println("se edito correctamente");

				break;
			case 3:
				System.out.println(r);

				break;
			case 4:
				System.out.println("salir");
			}

		} while (menu < 4);

	}

}
