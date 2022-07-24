package Practica12Hash;

public class Hospital {
	// ATRIBUTOS
	String nombre_hospital;
	String tipo;
	String direccion;
	String horario;
	int numero_personal;
	int numero_pacientes;

	// CREAMOS EL CONSTRUCTOR POR DEFAULT
	public Hospital() {

	}

	// VA A SER LA LLAVE
	public Hospital(String nombre_hospital) {
		this.nombre_hospital = nombre_hospital;
	}

	// CREAMOS EL CONSTRUCTOR CON PARAMETROS
	public Hospital(String nombre_hospital, String tipo, String direccion, String horario, int numero_personal,
			int numero_pacientes) {
		this.nombre_hospital = nombre_hospital;
		this.tipo = tipo;
		this.direccion = direccion;
		this.horario = horario;
		this.numero_personal = numero_personal;
		this.numero_pacientes = numero_pacientes;
	}
//CREAMOS EL METODO TO STRING QUE VA A SER EL QUE EJECUTE CUANDO MOSTREMOS PERO MUESTRA EN CADENA

	@Override
	public String toString() {
		return "Hospital [nombre_hospital=" + nombre_hospital + ", tipo=" + tipo + ", direccion=" + direccion
				+ ", horario=" + horario + ", numero_personal=" + numero_personal + ", numero_pacientes="
				+ numero_pacientes + "N]";
	}
	// CREAMOS LOS METODOS GETTER Y SETTER

	public String getNombre_hospital() {
		return nombre_hospital;
	}

	public void setNombre_hospital(String nombre_hospital) {
		this.nombre_hospital = nombre_hospital;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumero_personal() {
		return numero_personal;
	}

	public void setNumero_personal(int numero_personal) {
		this.numero_personal = numero_personal;
	}

	public int getNumero_pacientes() {
		return numero_pacientes;
	}

	public void setNumero_pacientes(int numero_pacientes) {
		this.numero_pacientes = numero_pacientes;
	}

}
