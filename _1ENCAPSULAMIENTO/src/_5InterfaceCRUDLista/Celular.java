package _5InterfaceCRUDLista;

public class Celular {
	//CREAMOS METODOS DE LA CLASE
	private String nombre;
	private String modelo;
	private String marca;
	private int serie;
	//CREAMOS LA SOBRECARGA  DE METODOS
	//CREAMOS EL CONSTRUCTOR VACIO
	public Celular() {
		
	}
	
	//CREAMOS EL CONSTRUCTOR PARA INICIALIZAR EL OBJETO DE LA CLASE
	public Celular(String nombre, String modelo, String marca, int serie) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.serie = serie;
	}
	
	//CREAMOS EL TO SRING
	@Override
	public String toString() {
		return "Celular [nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + ", serie=" + serie + "]\n";
	}

	//CREAMOS EL ENCAPSULAMIENTO
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	
}
