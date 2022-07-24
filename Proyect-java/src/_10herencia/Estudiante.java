package _10herencia;
//ES LA HERENCIA QUE SE REALIZA----hereda de la clase persona
public class Estudiante extends Persona{
	//CREAMOS LOS ATRIBUTOS
		private int codigoEstudiante;
		private float notaFinal;
	public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante, float  notaFinal) {
		//CREAMOS LOS METODOS GETTER Y SETTER-------->java ya lo hace en automaticoasi que añadimos getter y setter para poder incluirlo
		super(nombre, apellido, edad);//es lo que hereda--por eso es super<
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	
	//CREAMOS EL METODO MOSTRAR LOS DATOS
	public void mostrarDatos() {
		System.out.println("Los datos son: ");
		System.out.println("El nombre es: "+getNombre());//nombre, apellido + edad son lo que es heredado de cla clase Persona yaesta instanciada
		System.out.println("El apellido es: "+getApellido());
		System.out.println("la edad es: "+getEdad());
		System.out.println("El codigo de estudiante es: "+codigoEstudiante);
		System.out.println("la nota final es: "+notaFinal);
		System.out.println("bye");
		
	}
}
