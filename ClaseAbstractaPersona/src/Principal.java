import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Scanner lec = null;
		do {
			try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
					// NUEVO EL PARAMETRO
				Animal m = new
				// NOS ALOJA LOS STRING PARA QUE PODAMOS INSERTAR LOS DATOS
				Animal("pulga", "Canino", "croqueta", "macho", "doberman", "miel", "croqueta");
				System.out.println(m);// m VIENE DE ANIMAL QUE ES IGUAL A --->
										// "Gregory","house","m01","c02","hardvard","no usa","diagnostica" ---> DONDE
										// IMPRIMIMOS MEDICO
				// METODO NO ABSTRACTO EN LA CLASE ANIMAL---->EN LA FORMA DE COMER
				m.comer("croqueta", 2);
				// METODO ABSTRACTO
				m.dormic();
				// METODO PROPIO DE LAS CLASE Animal
				m.veterinario();

				Planta is = new
				// NOS ALOJA LOS STRING PARA QUE PODAMOS INSERTAR LOS DATOS
				Planta("girasol", "Sunspot.", "agua", "Helianthus L.", "Big Smile", "amarillo");
				System.out.println(is);// is VIENE DE ---> "mark","zuquerver","i02","mo2","harvadr","back","php","face"
										// ---> DONDE IMPRIMIMOS CON is
				// METODO NO ABSTRACTO EN LA CLASE PROFESIONISTA---->EN LA FORMA DE COBRAR
				is.comer("agua lts", 2);
				// METODO ABSTRACTO
				is.dormic();
				// METODO PROPIO DE LAS CLASE PLANTA
				is.ladra();

				// MENU DE OPCIONES
				System.out.println("menu de opciones");
				System.out.println("elige la opcion");
				System.out.println("1) alta");
				System.out.println("2) mostrar");
				System.out.println("3) salir");
				// PARA QUE INTRODUZCA LA OPCION LO INSTANCIAMOS CON LA CLASE SCANNER
				lec = new Scanner(System.in);
				// INT PORQUE ES UNA OPCIONDE NUMERO
				menu = lec.nextInt();
				// VIENE DE MENU DE OPCIONES PARA QUE EL USUARIO INSERTE LAS OPCIONES CON
				// NUMEROS
				if (menu == 1) {
					System.out.println("opcion alta");
				} else if (menu == 2) {
					System.out.println("opcion mostrar");
				} else {
					System.out.println("salir");
				}
				// e ES PARA QUE ATRAPE LA EXCEPTION
			} catch (Exception e) {
				// MENSAJE DEL ERROR
				System.out.println("error" + e + ", favor de intentar nuevamente con numeros!!!!!!");
			} // LLAVES DEL CATCH

		} while (menu < 3);// TENDRA SOLO 3 OPCIONES

	}

}
