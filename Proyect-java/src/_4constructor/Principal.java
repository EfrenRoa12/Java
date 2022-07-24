package _4constructor;

public class Principal {

	public static void main(String[] args) {
		// INSTANCIAMOS EL OBJETO--> CON LOS PARAMETROS YA QUE ES DE TIPO CONSTRUCTOR THIS
		//OBJETO PERSON QUE TIENE LOS DATOS
		//LLAMO AL METODO CONSTRUCTOR THIS Y SE ESTA GUARDANTO EN OBJETO PERSON
		Persona persona1 = new Persona("Efren",27);
		Persona persona2 = new Persona("Joselin",25);
		Persona persona3 = new Persona("Gyseli",25);
		Persona persona4 = new Persona("Mayra C",23);
		Persona persona5 = new Persona("Paulina",22);
		//LOS IMPRIME---TREEMOS DESDE PERSONA
		persona1.mostrarDatos();
		persona2.mostrarDatos();
		persona3.mostrarDatos();
		persona4.mostrarDatos();
		persona5.mostrarDatos();
		

	}

}
