
public class Cantante {
	String nombre;
	String apellidoP;
	String nombreA;
	String genero;
	int edad;

	public Cantante() {

	}

	public Cantante(String nombre, String apellidoP, String nombreA, String genero, int edad) {
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.nombreA = nombreA;
		this.genero = genero;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", apellidoP=" + apellidoP + ", nombreA=" + nombreA + ", genero=" + genero
				+ ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getNombreA() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
