package _14Polimorfismo;

public class Vehiculo {
	//Atributo
	protected String matricula;
	protected String marca;
	protected String modelo;
//Metodo constructor
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
//metodo getter y setter
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//metodo mostrar datos
	public String mostrarDatos() {
		return "matricula "+matricula+"marca "+marca+" modelo "+modelo;
		
	}

}
