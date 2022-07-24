
public class Influencer {
	String nombre;
	String apellidoP;
	String nombreA;
	int edad;

	public Influencer() {

	}

	public Influencer(String nombre, String apellidoP, String nombreA, int edad) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.nombreA = nombreA;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Influencer [nombre=" + nombre + ", apellidoP=" + apellidoP + ", nombreA=" + nombreA + ", edad=" + edad
				+ "]\n";
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
