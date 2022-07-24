package _10herencia;

public class Persona {
	// CREAMOS LOS ATRIBUTOS DE PERSONA
	private String nombre;
	protected String apellido;
	protected int edad;

	// CREAMOS EL CONSTRUCTOR
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// CREAMOS LOSGETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
