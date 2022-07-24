package _5Sobrecarga_Metodos;

public class Personas {
	//CREAMOS LOSATRIBUTOS
	String nombre;
	int edad;
	String dni;
	//METODOS	//METODO CONSTRUCTOR CON PARAMETROS
	public Personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	//SE PUEDE SOBRECARGAR SIEMPRE Y CUANDO LOS PARAMETOS SEAN DIFERENTES
	public Personas(String dni) {
		this.dni = dni;
	}
	//CREAREMOS UN METODO----- Y VAMOS A SOBRECARGAR----
	public void Correr() {
		System.out.println("soy: "+nombre+" tengo:"+edad+"años ");
	}
	public void Correr(int km) {
		System.out.println("he corrido "+km +" km");
	}
	
	
}
