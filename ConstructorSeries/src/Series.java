
public class Series {
	// Atributo
	String nombre;
	int capitulo;
	int temporada;
	String genero;

	//
	public Series() {

	}

	//constructor con variables
	public Series(String nombre, int capitulo, int temporada, String genero) {
		super();
		this.nombre = nombre;
		this.capitulo = capitulo;
		this.temporada = temporada;
		this.genero = genero;
	}
	//toString
	@Override
	public String toString() {
		return "Series [nombre=" + nombre + ", capitulo=" + capitulo + ", temporada=" + temporada + ", genero=" + genero
				+ "]\n";
	}
	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
