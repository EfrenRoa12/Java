package _12Sobreescritura;

public class Perro extends Animal{
	//override significa que estamos sobre escribiendoel metodo comer
	@Override
	public void comer() {
		System.out.print("estoy comiendo croquetas\n");
	}
	
}
