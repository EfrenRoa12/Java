package _9Estaticos;

public class Estatico {
	//static--se hace una copia diferente delo que no sea estatico de la clase
	
	private static String frase = "primera frase";//ya no pertenece a los objetos le pertenece a la clase--por lo tanto imprimeen local
	
	//creamos un metodo sencillo
	public static int sumar(int numero1, int numero2) {//ya no pertenece a atributos le pertenece a la clase
		int suma = numero1 + numero2;
		return suma;
	}
	
	public static void main(String[] args) {
		
		//estatico2 es un objeto diferente que va a imprimir en estatico 2
		//NO HAY NECESIDAD DE INSTANCIARLO LO PODEMOS LLAMAR DIRECTAMENTE
		System.out.println(Estatico.frase);//lo llamamos directamente
		System.out.println("la suma es: "+Estatico.sumar(9, 7));//como es estatico---->lo podemos mandar directamente desde la clase
		
		
	}
	
	

}
