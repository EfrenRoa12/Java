package _14Polimorfismo;

public class VehiculoTurismo extends Vehiculo{//HEREDA DE LA CLASE VEHICULO
	//AGREGAMOS LOS PARAMETROS
	private int NumeroPuertas;
	//CREAMOS METODO CONSTRUCTOR
	public VehiculoTurismo(String matricula, String marca, String modelo, int NumeroPuertas) {
		super(matricula, marca, modelo);
		this.NumeroPuertas = NumeroPuertas;
	}
	//--->PARA EL NUMERO DE PUERTAS
	public int getNumeroPuertas() {
		return NumeroPuertas;
	}
	//SOBREescritura cuando ya es el mimo metodo con herencia de diferentes clases
	public String mostrarDatos() {
		return "matricula "+matricula+"marca "+marca+" modelo "+modelo+" numero de puertas "+ NumeroPuertas;
		
	}
	
	
	
}
