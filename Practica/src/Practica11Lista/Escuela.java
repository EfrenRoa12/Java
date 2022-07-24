package Practica11Lista;

public class Escuela {
	// ATRIBUTOS
	String nombre;
	String tipo_escuela;
	int n_alumnos;
	int n_profesores;
	int n_aulas;

	// CONSTRUCTOR POR DEFAULT
	public Escuela() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public Escuela(String nombre, String tipo_escuela, int n_alumnos, int n_profesores, int n_aulas) {
		this.nombre = nombre;
		this.tipo_escuela = tipo_escuela;
		this.n_alumnos = n_alumnos;
		this.n_profesores = n_profesores;
		this.n_aulas = n_aulas;
	}

	// TO STRING--ES PARA IMPRIMIR EN CADENA- EN PRINCIPAL ES BUSCADO Y ESTO MUESTRA
	// EL DATO GENERAL
	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", tipo_escuela=" + tipo_escuela + ", n_alumnos=" + n_alumnos
				+ ", n_profesores=" + n_profesores + ", n_aulas=" + n_aulas + "]";
	}

	// METODO SETER Y GETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_escuela() {
		return tipo_escuela;
	}

	public void setTipo_escuela(String tipo_escuela) {
		this.tipo_escuela = tipo_escuela;
	}

	public int getN_alumnos() {
		return n_alumnos;
	}

	public void setN_alumnos(int n_alumnos) {
		this.n_alumnos = n_alumnos;
	}

	public int getN_profesores() {
		return n_profesores;
	}

	public void setN_profesores(int n_profesores) {
		this.n_profesores = n_profesores;
	}

	public int getN_aulas() {
		return n_aulas;
	}

	public void setN_aulas(int n_aulas) {
		this.n_aulas = n_aulas;
	}

}
