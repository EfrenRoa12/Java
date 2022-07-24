
public class Alumno {
	String nombre;
	String pp;
	int edad;

	public Alumno() {

	}

	public Alumno(String nombre, String pp, int edad) {
		super();
		this.nombre = nombre;
		this.pp = pp;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", pp=" + pp + ", edad=" + edad + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
