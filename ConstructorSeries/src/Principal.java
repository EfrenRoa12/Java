import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		String nombre;
		int capitulo;
		int temporada;
		String genero;
		Series s = null;
		Scanner serie = null;
		// inicializamos el menu
		int menu = 0;
		// opcion de menu
		do {
			System.out.println("Series Enucom");
			System.out.println("Elije una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Editar Nombre");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");

			serie = new Scanner(System.in);

			menu = serie.nextInt();
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Alta  Serie");
				System.out.println("Escribe el nombre de la serie");
				serie = new Scanner(System.in);
				nombre = serie.nextLine();

				System.out.println("escribe cuantos capitulos son");
				serie = new Scanner(System.in);
				capitulo = serie.nextInt();
				
				System.out.println("Escribe la temporada");
				serie = new Scanner(System.in);
				temporada = serie.nextInt();

				System.out.println("escribe el genero");
				serie = new Scanner(System.in);
				genero = serie.nextLine();

				//
				s = new Series(nombre, capitulo, temporada, genero);
				System.out.println("se dio de alta el lenguaje" + s.getNombre());

				break;
			case 2:
				System.out.println("Escribe el nuevo nombre");
				serie = new Scanner(System.in);
				nombre = serie.nextLine();

				s.setNombre(nombre);
				System.out.println("se edito correctamente");

				break;
			case 3:
				System.out.println(s);

				break;
			case 4:
				System.out.println("salir");
			}

		} while (menu < 4);
	}

}
