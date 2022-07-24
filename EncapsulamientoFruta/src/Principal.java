import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Fruta fruta = new Fruta();
		// colocar los valores Set
		fruta.setNombre("Manzana");
		fruta.setColor("verde");
		fruta.setPeso(1);
		fruta.setPrecio(20);
		// obtener valores
		fruta.getNombre();
		fruta.getColor();
		fruta.getPeso();
		fruta.getPrecio();

		System.out.println("Los datos de la fruta son: ");
		System.out.println("Nombre: " + fruta.getNombre());
		System.out.println("Color: " + fruta.getColor());
		System.out.println("Peso: " + fruta.getPeso() + " Kilogramo");
		System.out.println("Precio: " + fruta.getPrecio() + " Pesos");

	}
}