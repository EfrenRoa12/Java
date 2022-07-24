import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Modelo;
		String Marca;
		String Precio;
		int Anio;
		int Puerta;
		// tipo null para su registro
		Auto a = null;// se instancia a la clase Auto
		Scanner at = null;// es el resultado a teclear

		int menu = 0;
		do {
			System.out.println("Bienvenido a auto-enucom");
			System.out.println("Elige una opcion");
			System.out.println("1) Alta");
			System.out.println("2) Mostrar automovil");
			System.out.println("3) Salir");

			at = new Scanner(System.in);// lee desde teclado
			menu = at.nextInt();
			// validar opciones
			switch (menu) {
			case 1:
				// Menu Alta
				System.out.println("Escriba el modelo del automovil");
				at = new Scanner(System.in);
				Modelo = at.nextLine();

				System.out.println("Escriba la marca");
				at = new Scanner(System.in);
				Marca = at.nextLine();

				System.out.println("Escriba el precio del automivil");
				at = new Scanner(System.in);
				Precio = at.nextLine();

				System.out.println("Escribe el año del automovil");
				at = new Scanner(System.in);
				Anio = at.nextInt();

				System.out.println("Escribe el numero de puertas del automovil");
				at = new Scanner(System.in);
				Puerta = at.nextInt();

				// Es para inciaializarlos///*************************************
				a = new Auto();

				// damos de alta con los siguentes atributos
				a.setModelo(Modelo);
				a.setMarca(Marca);
				a.setPrecio(Precio);
				a.setAnio(Anio);
				a.setPuerta(Puerta);
				// imprime es resultado de alta
				System.out.println("Se ha dado de alta " + a.getMarca());

				break;
			case 2:
				// Menu Mostar-- mostramos el resultado de alta del registro
				System.out.println("El registro es " + a.getPrecio());
				System.out.println("El modelo es " + a.getModelo());
				System.out.println("La marca es " + a.getMarca());
				System.out.println("Precio " + a.getPrecio());
				System.out.println("El año es " + a.getAnio());
				System.out.println("Numero de puerta " + a.getPuerta());

				break;
			case 3:
				// Menu salir
				System.out.println("Salir");
				break;

			}

		} while (menu < 3);

	}

}
