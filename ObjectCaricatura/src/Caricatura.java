
public class Caricatura {
	String nombre;
	String horario;
	int capitulo;

	public Caricatura() {

	}

	public Caricatura(String nombre) {// lo buscamos por nombre---parametro nombre
		this.nombre = nombre;
	}

	public Caricatura(String nombre, String horario, int capitulo) {
		this.nombre = nombre;
		this.horario = horario;
		this.capitulo = capitulo;
	}

	@Override
	public String toString() {
		return "Caricatura [nombre=" + nombre + ", horario=" + horario + ", capitulo=" + capitulo + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

}
