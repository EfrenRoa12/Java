import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables
		String lenguaje;
		String tipado;
		int anios;
		Lenguaje len = null;//es para instanciarlo
		Scanner lec = null;
		int menu = 0;
		// opcion de menu
		do {
			System.out.println("Bienvenidos a Escuela Enucom");
			System.out.println("Elije una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Editar");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");
			lec = new Scanner(System.in);
			menu=lec.nextInt();
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Alta lenguaje de programacion");
				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				lenguaje = lec.nextLine();

				System.out.println("escribe si es tipado");
				lec = new Scanner(System.in);
				tipado = lec.nextLine();

				System.out.println("Escribe los años");
				lec = new Scanner(System.in);
				anios = lec.nextInt();

				//
				len = new Lenguaje(lenguaje, tipado, anios);
				System.out.println("se dio de alta el lenguaje" + len.getLenguaje());

				break;
			case 2:
				System.out.println("Escribe los años");
				lec = new Scanner(System.in);
				anios = lec.nextInt();
				
				len.setAnios(anios);
				System.out.println("se edito correctamentes");

				break;
			case 3:
				System.out.println(len);

				break;
			case 4:
				System.out.println("salir");
			}

		} while (menu < 4);

	}

}
