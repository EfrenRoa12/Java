package Arreglo;

public class Principal {

	public static void main(String[] args) {
		// clase principal
		//se crea Musico estudiante por la clase que principal va a encargarse de ejecutarlos
		MusicoEstudiante musicoE = new MusicoEstudiante ();
		
		musicoE.hablar();
		musicoE.estudiar();
		musicoE.tocarMusica();
		//------------------------------------------------
		//de esta forma simulamos la herencia multiple
		
		
		
	}

}
