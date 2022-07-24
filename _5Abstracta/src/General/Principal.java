package General;

import java.util.Scanner;

import Entidad.IngSistemas;
import Entidad.Medico;

public class Principal {
	public static void main(String[] args) {

		int menu = 0;
		Scanner lec = null;
		do {
			try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
					// NUEVO EL PARAMETRO
				Medico m = new
				// NOS ALOJA LOS STRING PARA QUE PODAMOS INSERTAR LOS DATOS
				Medico("Gregory", "house", "m01", "c02", "hardvard", "no usa", "diagnostica");
				System.out.println(m);// m VIENE DE MEDICO QUE ES IGUAL A --->
										// "Gregory","house","m01","c02","hardvard","no usa","diagnostica" ---> DONDE
										// IMPRIMIMOS MEDICO
				// METODO NO ABSTRACTO EN LA CLASE PROFESIONISTA---->EN LA FORMA DE COBRAR
				m.cobrar("efectivo", 2000);
				// METODO ABSTRACTO
				m.trabajar();
				// METODO PROPIO DE LAS CLASE MEDICO
				m.consultar();

				IngSistemas is = new
				// NOS ALOJA LOS STRING PARA QUE PODAMOS INSERTAR LOS DATOS
				IngSistemas("mark", "zuquerver", "i02", "mo2", "harvadr", "back", "php", "face");
				System.out.println(is);// is VIENE DE ---> "mark","zuquerver","i02","mo2","harvadr","back","php","face"
										// ---> DONDE IMPRIMIMOS CON is
				// METODO NO ABSTRACTO EN LA CLASE PROFESIONISTA---->EN LA FORMA DE COBRAR
				is.cobrar("transferencia", 12500);
				// METODO ABSTRACTO
				is.trabajar();
				// METODO PROPIO DE LAS CLASEIngSistemas
				is.explorando();

				// MENU DE OPCIONES
				System.out.println("menu de opciones");
				System.out.println("elige la opcion");
				System.out.println("1) alta");
				System.out.println("2) mstrar");
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

	}// CIERRA MAIN

}
