import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// instanciar
		Perro perro = new Perro();
		// colocar los valores de set
		perro.setNombre("Ratoncito");// nombre del perro
		perro.setColor("Negra");
		perro.setGenero("Hembrea");
		perro.setEdad(3);
		// obtener los valores
		System.out.println("Los datos del perro son: ");
		System.out.println("Nombre: " + perro.getNombre());
		System.out.println("Nombre: " + perro.getColor());
		System.out.println("Nombre: " + perro.getGenero());
		System.out.println("Nombre: " + perro.getEdad());

		

}
}
