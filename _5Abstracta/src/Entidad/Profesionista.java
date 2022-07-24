package Entidad;
//CREAMOS LA CLASE ABSTRACTA
public abstract class Profesionista {
	// CREAMOS LOS ATRIBUTOS
	String nombre;
	String app;
	String titulo;
	String cedula;
	String universidad;

	// METODO NO ABTRACTO --> METODO NORMAL
	// CUANTO ES LO QUE VA A PERCIBIR
	// DE QUE FORMA Y CUANTO FUE LO QUE COBRO UN PROFESIONISTA
	public void cobrar(String tipo, double cantidad) {
		System.out.println("me pagaron en " + tipo + " la canidad de " + cantidad);
	}

	// METODO NO ABTRACTO---> SE PUEDE IR ADECUANDO A CADA CLASE
	public abstract void trabajar();

	// CONSTRUCTOR SIN PARAMETROS
	public Profesionista() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public Profesionista(String nombre, String app, String titulo, String cedula, String universidad) {
		this.nombre = nombre;
		this.app = app;
		this.titulo = titulo;
		this.cedula = cedula;
		this.universidad = universidad;
	}

	// NO OCUPAMOS EL METODO TO STRING
	// METODOS GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
}
