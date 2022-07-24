package Sexta;

public class _4producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// diseñar un pograma que muestre el producto de los 10 primeros numeros impares
		
				long producto = 	1;
				
				for(int i=1;i<=20;i+=2) {
					producto *=i;
				}
				
				System.out.println("el producto es: "+producto);
	}

}
