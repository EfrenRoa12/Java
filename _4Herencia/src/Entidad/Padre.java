package Entidad;

public class Padre {
	private String nombre;
	private String app;
	private String apm;
	private int edad;
	public Padre() {
		
	}
	public Padre(String nombre, String app, String apm, int edad) {

		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", edad=" + edad + "]\n";
	}
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
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
