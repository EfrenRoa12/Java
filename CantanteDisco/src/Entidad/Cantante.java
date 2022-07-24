package Entidad;

public class Cantante {
	String nombre_cantante;// KEY
	String app;
	String genero;
	int edad_cantante;
	//CANTANTE-nombre_cantante---app---genero--edad_cantante-disco
	/// ES UN OBJETO DE LA CLASE DISCO DENTRO DE CANTANTE---UNA VEZ CREADO LA CLASE
	/// DISCO
	Disco disco;

	// CONTRUCTOR VACIO
	public Cantante() {

	}
	// COMO LO VAMOS A HACER EN HashMap DONDE LE PASAMOS EL PARAMETRO NOMBRE EN ESTE
	// CASO

	public Cantante(String nombre_cantante) {
		this.nombre_cantante = nombre_cantante;
	}
	// CLASE CONSTRUCTOR CO PARAMETROS

	public Cantante(String nombre_cantante, String app, String genero, int edad_cantante, Disco disco) {
		this.nombre_cantante = nombre_cantante;
		this.app = app;
		this.genero = genero;
		this.edad_cantante = edad_cantante;
		this.disco = disco;
	}

	// DEBEMOS CREAR CON CUIDADP EL HASH YA QUE HAY COSAS QUE DEBEN DE PODER
	// INGRESARLO
	@Override
	public String toString() {
		return "Cantante [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", nombre_cantante=" + nombre_cantante + ", app=" + app + ", genero=" + genero + ", edad_cantante="
				+ edad_cantante + ", disco=" + disco + "]\n";
	}

	public String getNombre_cantante() {
		return nombre_cantante;
	}

	public void setNombre_cantante(String nombre_cantante) {
		this.nombre_cantante = nombre_cantante;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad_cantante() {
		return edad_cantante;
	}

	public void setEdad_cantante(int edad_cantante) {
		this.edad_cantante = edad_cantante;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	// METODO GETTER Y SETTER

}
