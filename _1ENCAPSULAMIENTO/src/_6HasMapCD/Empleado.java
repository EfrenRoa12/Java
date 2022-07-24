package _6HasMapCD;

public class Empleado {
	// CREAMOS EL ATRIBUTO
	String nombre;
	int edad;
	String direccion;

	// CREAMOS LA SOBRECARGA DE METODOS
	// CREAMOS EL CONSTRUCTOR VACIO PARA INICIALIZAR EL OBJETO DE LA CLASS
	public Empleado() {

	}

	// CREAMOS EL CONSTRUCTOR CON PARAMETROS PARA INICIALIZAR LOS ATRIBUTOS DE LA
	// CLASE
	public Empleado(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	// CREAMOS EL TO STRING PARA PASARDE CARACTER A CADENA
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]\n";
	}

	// CREAMOS EL ENCAPSULAMIENTO
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
