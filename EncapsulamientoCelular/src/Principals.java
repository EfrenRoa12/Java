import java.util.Scanner;

public class Principals {
	public static void main(String[] args) {
		//
		String Modelo;
		String Marca;
		double Precio;
		int Ram;

		Celula C = null;
		Scanner cell = null;
		// validar los casos
		int menu = 0;

		do {
			System.out.println("Bienvenido a Celular Enucom");
			System.out.println("Menu de opciones");
			System.out.println("1) Alta");
			System.out.println("2) Editar Precio");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");

			cell = new Scanner(System.in);
			menu = cell.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Escribe el modelo:");
				cell = new Scanner(System.in);
				Modelo = cell.nextLine();

				System.out.println("Escribe la marca:");
				cell = new Scanner(System.in);
				Marca = cell.nextLine();

				System.out.println("Escribe el precio:");
				cell = new Scanner(System.in);
				Precio = cell.nextInt();

				System.out.println("Escribe el espacio de la memoria ram:");
				cell = new Scanner(System.in);
				Ram = cell.nextInt();

				// creamos la instanciacion
				C = new Celula();

				// damos los valores setearlo
				C.setModelo(Modelo);
				C.setModelo(Modelo);
				C.setPrecio(Precio);
				C.setRam(menu);
				System.out.println("se dio de alta " + C.getModelo());
				cell = new Scanner(System.in);
				Precio = cell.nextDouble();
				C.setPrecio(Precio);
				System.out.println("Nuevo precio");

				break;

			case 2:
				// editamos el precio
				System.out.println("Escribe nuevo precio");
				cell = new Scanner(System.in);
				Precio = cell.nextInt();
				C.setPrecio(Precio);
				System.out.println("Nuevo precio es: ");
				break;
			case 3:
				System.out.println("el celular tiene");
				System.out.println("Modelo: --->" + C.getModelo());
				System.out.println("Marca: --->: " + C.getMarca());
				System.out.println("Precio:---> " + C.getPrecio());
				System.out.println("Modelo: --->" + C.getModelo());
				break;
			case 4:
				System.out.println("Salir");
				break;
			}

		} while (menu < 4);
	}

}
