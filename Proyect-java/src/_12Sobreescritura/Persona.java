package _12Sobreescritura;

public class Persona extends Animal{//hereda de aminal
	//override significa que estamos sobre escribiendoel metodo comer
	@Override
	public void comer() {
		System.out.println("estoy comiendo con cubiertos\n ");
	}
		
}
