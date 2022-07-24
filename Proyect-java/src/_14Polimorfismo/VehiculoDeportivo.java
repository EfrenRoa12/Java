package _14Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
	private int cilindrada;
	public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	//HACEMOS SOBRESCRITURA CUANDO ES DIFERENTE CLASE MISMO METODO CON HERENCIA
	public String mostrarDatos() {
		return "matricula "+matricula+"marca "+marca+" modelo "+modelo+" cilindrada "+ cilindrada;
		
	}
	
	
}
