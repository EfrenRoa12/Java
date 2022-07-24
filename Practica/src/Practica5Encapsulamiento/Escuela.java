package Practica5Encapsulamiento;

public class Escuela {
	// CREAMOS LOS ATRIBUTOS
	String nombre;
	String tipo;
	int total_ni;
	int total_pr;
	int tot_grupos;

	// CREAMOS EL METODO CONSTRUCTOR POR DEFECTO
	public Escuela() {

	}

	// CREAMOS EL CONSTRUCTOR CON PARAMETROS
	public Escuela(String nombre, String tipo, int total_ni, int total_pr, int tot_grupos) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.total_ni = total_ni;
		this.total_pr = total_pr;
		this.tot_grupos = tot_grupos;
	}

	// CREAMOS LOS METODOS GETTER Y SETTER PARA MOSTRAR Y ESTABLECER LOS VALORE
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTotal_ni() {
		return total_ni;
	}

	public void setTotal_ni(int total_ni) {
		this.total_ni = total_ni;
	}

	public int getTotal_pr() {
		return total_pr;
	}

	public void setTotal_pr(int total_pr) {
		this.total_pr = total_pr;
	}

	public int getTot_grupos() {
		return tot_grupos;
	}

	public void setTot_grupos(int tot_grupos) {
		this.tot_grupos = tot_grupos;
	}

}
