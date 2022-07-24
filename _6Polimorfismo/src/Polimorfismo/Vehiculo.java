package Polimorfismo;

public class Vehiculo {
	// ATRIBUTOS
	protected String matricula;
	protected String marca;
	protected String modelo;

	// SOBRECARGA DE METODOS
	// METODO CONSTRUCTOR VACIO PARA IDENTIFICAR LA CLASE DONDE INICIALIZA LA CLASE
	public Vehiculo() {

	}

	// METODO CONSTRUCTOR CON PARAMETROS
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	// ENCAPSULAMIENTO
	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	// CREAMOS EL METODO PARA IMPRIMIR
	public String MostrarDatos() {
		return "Matricula: " + matricula + "\nMarca" + marca + "\nModelo" + modelo;
	}

}
