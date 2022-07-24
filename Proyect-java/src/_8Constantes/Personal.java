package _8Constantes;

public class Personal {
	//CREAMOS LOS ATRIBUTOS ---> CONSTANTES ALGO QUE NO VA A CAMBIAR
	//FINAL SE CONVIERTE EN CONSTANTE
	private final String nombre;//cuando marca error al atributo creamosel metodo constructor con parametros
	private int edad;
	
	//METOD CONSTRUCTOR
	public Personal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	//METODO MOSTRAR DATOS
	public void mostrarDatos() {
		System.out.println("el nombre es: "+nombre);
		System.out.println("la edad es: "+edad);
	}
	//generamos los metodos getter y setter para la edad porque...no esta en final o sea en constante claro que eclipse marca peron no debemos hacer

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
