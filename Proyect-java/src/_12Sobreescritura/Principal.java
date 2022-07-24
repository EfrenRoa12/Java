package _12Sobreescritura;

public class Principal {

	public static void main(String[] args) {
		//instancamos para llamar a imprimir
		Persona persona = new Persona();
		Perro perro = new Perro();
		Vaca vaca = new Vaca();
		Animal animal = new Animal();
		
		//imprime
		animal.comer();
		persona.comer();
		perro.comer();
		vaca.comer();
		
		

	}

}
