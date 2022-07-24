package _1ENCAPSULAMIENTO;

public class Principal {

	public static void main(String[] args) {
		// INSTACIAMOS LA CLASE
		Animal animal = new Animal();
		
		animal.setNombre("CATITA");
		animal.setGenero("HEMBRA");
		animal.setEdad(2);
		
		System.out.println("EL NOMBRE ES: "+animal.getNombre());
		System.out.println("EL GENERO ES: "+animal.getGenero());
		System.out.println("LA EDAD ES: "+animal.getEdad());

	}

}
