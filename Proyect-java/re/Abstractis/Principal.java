package Abstractis;

public class Principal {

	public static void main(String[] args) {
		// Ejecuta la funcion
		//simular instanciacion
		Planta planta = new Planta();
		planta.alimentarse();
		
		AnimalCarnivoro AnimalC = new AnimalCarnivoro();
		AnimalC.alimentarse();
		
		AnimalHerviboro AnimalH = new AnimalHerviboro();
		AnimalH.alimentarse();
		
	}

}
