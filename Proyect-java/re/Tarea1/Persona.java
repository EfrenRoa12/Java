package Tarea1;

public class Persona {

	// atributo
	private String nombre = "";
	int edad = 0;

	public Persona() {
		System.out.println("se creo un objeto de tipo persona");
		nombre = "";//no se encuentra oculto ya que es de la misma clase si fuera externa no lo permite
	}
	
	//metodos
	public void crecer() {
		System.out.println("se creo un objeto de tipo persona");
		
	}
	//modificador de acceso privado
	private void vestirse() {
		System.out.println("se creo un objeto de tipo persona");
		
	}
}