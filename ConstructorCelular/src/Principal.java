import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		String modelo;
		String marca;
		double precio;
		String color;
		int ram;
		Celular c = null;
		Scanner cell = null;
		int menu = 0;
		// opcion de menu
		do {
			System.out.println("Celulares Enucom");
			System.out.println("Elije una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Editar ram");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");
			cell = new Scanner(System.in);
			menu = cell.nextInt();
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Alta  Celular");
				System.out.println("Escribe el modelo");
				cell = new Scanner(System.in);
				modelo = cell.nextLine();

				System.out.println("escribe la marca");
				cell = new Scanner(System.in);
				marca = cell.nextLine();

				System.out.println("Escribe el precio");
				cell = new Scanner(System.in);
				precio = cell.nextInt();

				System.out.println("escribe el color");
				cell = new Scanner(System.in);
				color = cell.nextLine();

				System.out.println("Escribe la ram");
				cell = new Scanner(System.in);
				ram = cell.nextInt();

				//
				c = new Celular(modelo, marca, precio, color, ram);
				System.out.println("se dio de alta el lenguaje" + c.getModelo());

				break;
			case 2:
				System.out.println("Escribe la ram");
				cell = new Scanner(System.in);
				ram = cell.nextInt();

				c.setRam(ram);
				System.out.println("se edito correctamente");

				break;
			case 3:
				System.out.println(c);

				break;
			case 4:
				System.out.println("salir");
			}

		} while (menu < 4);

	}

}
