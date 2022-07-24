import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
				
				//numero entero-----------
				int numero;
				
				System.out.println("digite un numero entero  ");
				numero = entrada.nextInt();
				
				System.out.println("el numero entero es: "+numero);
				
				//numero flotante-----------
				
				Float numero1;
				
				System.out.println("digite un numero decimal ");
				numero1 = entrada.nextFloat();
				
				System.out.println("el numero decimal es: "+numero1);
				//numero double-----------
				double numero2;
				
				System.out.println("digite un numero double decimal ");
				numero2 = entrada.nextDouble();
				
				System.out.println("el numero double decimal es: "+numero2);
				//--------------------------------------------------------------cadenas--------
				
				String cadena;
				
				System.out.println("Digite una cadena ");
				cadena = entrada.nextLine();//next guarda la canena hasta que hay un espacio ------- nextline esta en 
				
				System.out.println("la cadena es"+cadena);
				//-----------------char
				
				char letra;
				
				System.out.println("Digite una letra ");
				letra = entrada.next().charAt(0);//lee un solo caracter solo lee el primer 
				
				System.out.println("la letra es"+letra);
				
			
	}

}
