import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//CREAMOS MISMOS ATRIBUTOS QUE MEDIOS TRANSPORTE
		String nombre;
		String tipo;
		double costo;
		int pasajeros;
		//DELARAMOS LA VARIABLE --- MEDIOS DE TRANPORTE LLAMANDO DESDE SU CLASE
		MediosTransporte transporte;
		//CREAMOS EL MENU DE INDICE
		int menu=0, menuE, indice;
		// les ES PARA SCNNER IMPRIME
		Scanner lec = null;
		//INSTANCIAMOS LA IMPLEMENTACION QUE VIENE DE LOS METODS LASACCIONES A REALIZAR
		Implementacion imp = new Implementacion();
		
		do {
			//CREAMOS EL CATCH PARA LAS EXCEPCIONES
			try {//SIEMPRE SE COLOCA DENTRO DE DO PARA QUE FUNCIONE
			//CREAMOS EL MENU
			System.out.println("Bienvenidos a su tienda de comida Enucom");
			System.out.println("*** Menu ***");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar por nombre");
			System.out.println("5 mostrar");
			System.out.println("6 salir");
			//ES PARA IMPRIMIR
			lec = new Scanner(System.in);
			//INSTANCIAMOS DONDE NICIALIZAMOS 
			menu = lec.nextInt();
			//CUANDO EL USUARIO DA LA INDICACION DE LA OPCION 1 DAMOS ALTA
			switch (menu) {
			case 1:
				System.out.println("ALTA DE TRANSPORTE");

				System.out.println("Escribe el nombre");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe la tipo");
				lec = new Scanner(System.in);
				tipo = lec.nextLine();
				
				
				System.out.println("Escribe el costo");
				lec = new Scanner(System.in);
				costo = lec.nextDouble();

				

				System.out.println("Escribe el pasajeros");
				lec = new Scanner(System.in);
				pasajeros = lec.nextInt();

				//TRANSPORTE ESTA DECLARADO COMO MEDIOS DE TRANSPORTE---Y LE PASAMOS LOS PARAMETROS
				//LO GUARDAMOS EN TRANSPORTE PARA QUE LO IMPRIMA
				transporte = new MediosTransporte(nombre, tipo, pasajeros, pasajeros);
				imp.guardar(transporte);
				//IMPRIME LOS DATOS DONDE EL USUARIO DIO DE ALTA EL TRANSPORTE Y MUESTRA QUE ES LO QUE DIO DE ALTA
				System.out.println("Se guardo el transporte " + transporte.getNombre());
				break;
			case 2:
				//OPCION DE EDITAR
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				//BUSCA EL NUMERO DE INDICE A EDITAR -- UNA VEZ ENCONTRADA NOS MANDA A INDICAR QUE ES LO QUE VAMOS  A EDITAR
				
				transporte = imp.buscar(indice);
				do {
					//NOS DA LA OPCION A EDITAR
					System.out.println("Escoge por que deceas editar");
					System.out.println("1 precio");
					System.out.println("2 tipo");
					System.out.println("3 menu principal");
					//LEC ES PARA IM´PRIMIR
					lec = new Scanner(System.in);
					//NOS DA LA OPCION DE EDITAR
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						//DIGITAMOS LOS CAMBIOS A EDITAR
						System.out.println("Escribe el nuevo precio");
						lec = new Scanner(System.in);
						costo = lec.nextDouble();
						transporte.setCosto(costo);
						break;
					case 2:
						System.out.println("Escribe el tipo");
						lec = new Scanner(System.in);
						tipo = lec.nextLine();
						transporte.setTipo(tipo);
						break;
					}// cierra switchE
				} while (menuE < 3);
				//GUARDAMOS QUE ES LO QUE EDITAMOS
				imp.editar(indice, transporte);
				//NOS MUESTRA COMO QUEDO LO QUE EDITAMOS
				System.out.println("Se edito el transporte " + transporte);
				break;
			case 3:
				//EL CASO 3 EN GENERAL VOLVEMOS ESCRIBIMOS QUE ES LO QUE VAMOS A ELIMINAR Y LA FUNCION HACE LO SIGUIENTE 
				//CLARO CON LOS METODOS DECLARADOS DESDE LA IMPLEMENTAACION PORQUE YA ES DINAMICA

				//LO BUSCAMOS POR INDICE A ELIMINAR
				System.out.println("Escribe el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				//EL TRANSPORTE DECLARADO DE LA CLASE MEDIOS DE TRANSPORTE HACE REFERENCIA
				transporte = imp.buscar(indice);
				//LO CASTEAMOS--DE IMPLEMENTACION---BUSCA POR INDICE
				//ELIMINA EL INDICE
				imp.eliminar(indice);
				//MUESTRA EL INDICE QUE SE ELIMINO
				System.out.println("Se elimino el transporte " + transporte.getNombre());

				break;
			case 4:
				//BUSCA EL REGISTRO POR INDICE
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				//TRANSPORTE DE CLASE DE IMPLEMENTACION LO BUSCA POR INDICE
				transporte = imp.buscar(indice);
				//IMPRIME EL INDICE ENCONTRADO
				System.out.println("trasnporte encontrada->" + transporte);
				break;
			
			case 5:
				//imp VIENE DECLARACION DE IMPLEMENTACION E IMPLEMENTACION EL METODO
				//ASI MUESTRA
				imp.mostrar();
				break;
			case 6:
				System.out.println("bye");
				break;
			}// cierra menu
			}catch(Exception e) {
				System.out.println("Error intenta nuevamente");
			}//CIERRA CATCH
		} while (menu < 6);
		
	}// cierra main
}
