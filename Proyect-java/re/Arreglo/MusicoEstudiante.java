package Arreglo;

public class MusicoEstudiante implements Musico, Estudiante {// podemos ingresar multiplos clases --- tiene dos clases padre Musico-Estudiante
	// simular herencia multiple

	// indicando que estamos sobrescribiendo de persona.
	//referencia de abuelo persona
	@Override
	public void hablar() {
		System.out.println("Estoy hablando español");
	}

	// referencia de musico. padre
	@Override
	public void tocarMusica() {
		System.out.println("Estoy tocando musica");
	}

	// referencia de estudiante. padre
	@Override
	public void estudiar() {
		System.out.println("Estoy estudiando");
	}
}
