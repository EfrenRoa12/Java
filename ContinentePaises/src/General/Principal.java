package General;

import java.util.Scanner;

import Entidad.Continente;
import Entidad.Paises;
import ImplementacionG.ImpContinente;
import ImplementacionG.ImpPaises;

public class Principal {

	public static void main(String[] args) {
		//padre-profesor-continente
		String nombre; // key
		double extension;
		//hijo-alumno-paises
		String nombreP;
		String capitalP;
		String tradicion;
		
		Continente continente;
		Paises paises;
		
		Scanner lec = null;
		int menu, menuE;
		
		ImpContinente impP = new ImpContinente();
		ImpPaises impA = new ImpPaises();
		
		
		do {
			System.out.println("Bienvenidos a Global Enucom");
			System.out.println("1 alta Continente->Codigo Duro");
			System.out.println("2 mostrar Continente");
			System.out.println("3 alta Pais");
			System.out.println("4 editar Pais");
			System.out.println("5 Eliminar Pais");
			System.out.println("6 Buscar Pais");
			System.out.println("7 Mostrar Pais");
			System.out.println("8 Buscar Pais por continente");
			System.out.println("9 salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				continente = new Continente("Europa",53);
				impP.guardar(continente);
				continente = new Continente("America",70);
				impP.guardar(continente);
				continente = new Continente("Asia", 48);
				impP.guardar(continente);
				System.out.println("Se guardaron los continente correctamente");
				break;
			case 2:
				impP.mostrar();
				break;
			case 3:
				
				
				System.out.println("Alta de Paises");

				System.out.println("Escribe el nombre del pais");
				lec = new Scanner(System.in);
				nombreP = lec.nextLine();

				System.out.println("Escribe la capital del pasi");
				lec = new Scanner(System.in);
				capitalP = lec.nextLine();

				System.out.println("Escribe la Tradicion del pais");
				lec = new Scanner(System.in);
				tradicion = lec.nextLine();

				
				impP.mostrar();
				
				System.out.println("Escribe el nombre del continente a asignar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				continente = new Continente(nombre);
				continente = (Continente) impP.buscar(continente);

				paises = new Paises(nombreP, capitalP, tradicion, continente);
				impA.guardar(paises);
				System.out.println(
						"Se gaurdo el pais " + paises.getNombre() + " con el nombre " + paises.getNombre());
				break;
			case 4:
				System.out.println("Edici�n de  Paises");

				System.out.println("Escribe la nombre del pais a editar");
				lec = new Scanner(System.in);
				
				nombre = lec.nextLine();
				paises = new Paises(nombre);
				paises = (Paises) impA.buscar(paises);
				System.out.println("Paises a editar->" + paises);
				do {
					System.out.println("Opci�n de edici�n");
					System.out.println("1 Nombre");
					System.out.println("2 Capital");
					System.out.println("3 Tradicion");
					System.out.println("4 Menu Principal");
		
					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("Escribe el nombre del Paise nuevo");
						lec = new Scanner(System.in);
						nombreP = lec.nextLine();
						paises.setNombre(nombreP);
						break;
					case 2:
						System.out.println("Escribe la capital del Paise nuevo");
						lec = new Scanner(System.in);
						capitalP = lec.nextLine();
						paises.setCapital(capitalP);
						break;
					case 3:
						impP.mostrar();
						System.out.println("Escribe la tradicion del Pais a asignar nuevo");
						lec = new Scanner(System.in);
						tradicion = lec.nextLine();
						continente = new Continente(tradicion);
						continente = (Continente) impP.buscar(continente);
						
						System.out.println("Continente nuevo->" + continente);
						paises.setContinente(continente);
						break;
					}// ciera siwtch edici�n
				} while (menuE < 4);
				impA.editar(paises);
				break;
			case 5:
				System.out.println("Eliminar Paises");

				System.out.println("Escribe el nombre del Paises a eliminar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				paises = new Paises(nombre);
				paises = (Paises) impA.buscar(paises);
				impA.eliminar(paises);
				System.out.println(
						"Se elimino el Paise " + paises.getNombre() + " con el nombre capital " + paises.getCapital());
				break;
			case 6:
				System.out.println("Buscar Paises");
				

				System.out.println("Escribe el nombre del paises a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				paises = new Paises(nombre);
				paises = (Paises) impA.buscar(paises);
				System.out.println("El Paise encontrado es->" + paises);
				break;
			case 7:
				impA.mostrar();
				break;
			case 8:
				System.out.println("Busqueda de Paises por Continenter");
				
			
				impP.mostrar();
				System.out.println("Escribe el nombre del Continente que decear que se meustren sus paises asignados");
				lec = new Scanner(System.in);
				nombreP = lec.next();
				continente = new Continente(nombreP);
				impA.buscarPaisesPorContinente(continente);
				break;
			case 9:
				System.out.println("Adios");
				break;
			}// cierra siwtch
		} while (menu < 9);
	}// cierra main
}

