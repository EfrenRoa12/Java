package _14Polimorfismo;

public class VehiculoForgoneta extends Vehiculo{
	private int carga;
	public VehiculoForgoneta(String matricula, String marca, String modelo,int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	//Es para traer la informacion y mostrarlo
	public int getCarga() {
		return carga;
	}
	//SOBREESCRIBIMOS YA QUE ES DIFERENTE CLASE CON HERENCIA Y MISMO METOD PERO QUE LO HACE DIFERENTE
	public String mostrarDatos() {
		return "matricula "+matricula+"marca "+marca+" modelo "+modelo+" carga "+ carga;
		
	}
}
