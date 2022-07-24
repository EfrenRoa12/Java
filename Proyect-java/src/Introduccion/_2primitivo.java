package Introduccion;

public class _2primitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitivo

		byte entero = 12;
		short entero2 = 12456;
		int entero3 = 12456789;
		long entero4 = 1234567898;

		System.out.println("numero entero byte " + entero);// byte de tamaño de 8 bits de -128 a 127

		System.out.println("numero entero short " + entero2);// short alcanzaal de 16 bits-32,768 a 32,767

		System.out.println("numero entero int " + entero3);// int ocupa 32 bits de -2,147,483,648 a 2147483647

		System.out.println("numero entero long " + entero4);// long ocupa 64 bits de -9,223,036,854,775,808 a
															// 9,223,036,854,775,807

		// ----------------------------------------------------------------------------------------------------------------------------

		float decimal1 = 3.48f;// se pone f para no tener problemas
		double decimal2 = 3.45697;

		System.out.println("numero decimal float " + decimal1);// 32 bits

		System.out.println("numero entero long " + decimal2);// 64 bits

		// ----------------------------------------------------------------------------------------------------------------------------

		char caracter = 'a';

		System.out.println("es un caracter " + caracter);// todo a quel que no encontramos en letra o numero

		boolean desicion = true;

	}

}
