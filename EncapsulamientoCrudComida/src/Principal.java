import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		String Nombre;
		int Porcion;
		double Precio;
		String Region;
		//ES INTANCIA DE LA CLASE COMIDA
		Comida C = null;
		//ES PARA QUE PUEDA IMPRIMIR EN SCANNER
		Scanner lec = null;
		// validar los casos
		int menu = 0;

		do {
			System.out.println("Bienvenido al restaurante enucom");
			System.out.println("Menu de opciones");
			System.out.println("1) Alta");
			System.out.println("2) Editar Precio");
			System.out.println("3) Mostrar");
			System.out.println("4) Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Escribe el nombre:");
				lec = new Scanner(System.in);
				Nombre = lec.next();

				System.out.println("Escribe el precio:");
				lec = new Scanner(System.in);
				Precio = lec.nextDouble();

				System.out.println("Escribe la porcion:");
				lec = new Scanner(System.in);
				Porcion = lec.nextInt();

				System.out.println("Escribe la region:");
				lec = new Scanner(System.in);
				Region = lec.next();

				// creamos la instanciacion
				C = new Comida();

				// damos los valores setearlo
				C.setNombre(Nombre);
				C.setPorcion(Porcion);
				C.setPrecio(Precio);
				C.setPrecio(Precio);
				System.out.println("se dio de alta " + C.getNombre());

				break;

			case 2:
				// editamos elprecio
				System.out.println("Escribe nuevo precio");
				lec = new Scanner(System.in);
				Precio = lec.nextDouble();
				C.setPrecio(Precio);
				System.out.println("Nuevo precio");
				break;
			case 3:
				System.out.println("la comida tiene");
				System.out.println("Nombre: --->" + C.getNombre());
				System.out.println("Precio --->: " + C.getPrecio());
				System.out.println("Porcion:---> " + C.getPorcion());
				System.out.println("Region: --->" + C.getRegion());
				break;
			case 4:
				System.out.println("Salir");
				break;
			}

		} while (menu < 4);
	}

}
