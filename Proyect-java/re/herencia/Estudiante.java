package herencia;

public class Estudiante extends Persona{
	
	private int codigoEstudiante;
	private float notaFinal;
	//constructor
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
		
		
		
	}
	//ostrar datos
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre()+" \nApellido"+getApellido()+" \nedad"+getEdad()+" \nel codigo del estudiante es: "+codigoEstudiante+" \nnofa final"+notaFinal);
		
		
		
	}

}
