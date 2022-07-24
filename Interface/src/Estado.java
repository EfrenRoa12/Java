
public class Estado {
	String nombre;
	String region;
	int extension;

	public Estado() {

	}

	public Estado(String nombre, String region, int extension) {
		this.nombre = nombre;
		this.region = region;
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", region=" + region + ", extension=" + extension + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

}
