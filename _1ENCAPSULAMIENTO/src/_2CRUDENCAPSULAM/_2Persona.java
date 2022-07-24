package _2CRUDENCAPSULAM;

public class _2Persona {
	// CREAMOS LOS ATRIBUTOS
	int id;
	String nombre;
	String apellido;
	int edad;

	// CREAMOS SOBRECARGA DE METODOS PARA TENER MAS DE UN METODO EN LA CLASE
	// (CONSTRUCTOR)
	// CREAMOS EL CONSTRUCTOR PARA INICIALIZAR LA CLASE
	public _2Persona() {

	}

	// CREAMOS EL CONSTRUCTOR CON PARAMETOS PARA ESTABLECER VALORES INICIALES PARA
	// ATRIBUTOS DEL OBJETO
	public _2Persona(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// CREAMOS EL TO STRING PARA CONVERTIR DE CACARTER A CADENA
	@Override
	public String toString() {
		return "_2Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	// CREAMOS EL ENCAPSULAMIENTO PARA ACCEDER A LOS ATRIBUTOS DE LA CLASE
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
