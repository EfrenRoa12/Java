package _13Abstracto;

public class Principal {

	public static void main(String[] args) {
		// Imprimimos
		
		Planta planta = new Planta();
		planta.alimentarse();

		AnimalCarnivoro animalcarnivoro = new AnimalCarnivoro();
		animalcarnivoro.alimentarse();
		
		AnimalHervivoro animalhervivoro = new AnimalHervivoro();
		animalhervivoro.alimentarse();
		
		
	}

}
