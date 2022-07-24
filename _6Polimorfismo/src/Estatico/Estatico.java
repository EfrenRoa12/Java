package Estatico;

public class Estatico {
	//ASI SE TRABAJA CON STATIC
	private static String frase = "primera frase ";

	// CREAMOS UN METODO ESTATICO
	public static int sumar(int n1, int n2) {
		int suma = n1 + n2;
		return suma;
	}

	public static void main(String[] args) {

		System.out.println(Estatico.frase);
		System.out.println(Estatico.sumar(7, 1));
	}

}
