package General;

import java.util.Scanner;

import Entidad.Cantante;
import Entidad.Disco;
import Implementacion.ImpCantante;
import Implementacion.ImpDisco;

public class Principal {

	public static void main(String[] args) {
		// LOS ATRIBUTO LO TRAEMOS DESDE DISCO
		// PROFESOR DISCO
		String titulo_disco;
		int anio;
		int num_pistas;
		// LOS CANTANTE LO TRAEMOS DESDE SU CLASE
		String nombre_cantante;// KEY
		String app;
		String genero;
		int edad_cantante;
		/// ES UN OBJETO DE LA CLASE DISCO DENTRO DE CANTANTE---UNA VEZ CREADO LA CLASE
		Cantante cantante;
		/// DISCO
		Disco disco;
		// CREAMOS lec PARA INSTANCIAR
		Scanner lec = null;
		// CREAMOS EL MENU
		int menu, menuE;
		// SON LAS IMPLEMENTACIONES

		ImpDisco impP = new ImpDisco();
		ImpCantante impA = new ImpCantante();
		try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
				// NUEVO EL PARAMETRO
				// CREAMOS EL MENU PRINCIPAL
			do {

				System.out.println("Bienvenidos a Musical Enucom");
				System.out.println("1 alta Disco->Codigo Duro");
				System.out.println("2 mostrar Disco");
				System.out.println("3 alta Cantante");
				System.out.println("4 editar Cantante");
				System.out.println("5 Eliminar Cantante");
				System.out.println("6 Buscar Cantanteo");
				System.out.println("7 Mostrar Cantanteo");
				System.out.println("8 Buscar Cantante por Disco");
				System.out.println("9 salir");
				// INSTANCIAMOS EL MENU
				lec = new Scanner(System.in);
				menu = lec.nextInt();

				switch (menu) {
				case 1:
					// CODIGO DURO
					// SON LOS ATRIBUTOS DE PROFESOR MENU PRINCIPAL

					disco = new Disco("latin-jazz", 2015, 8);
					// impP ES DONDE SE INSTANCIA DE IMPLEMENTOS DE METODOS COMO GUARDAR ELMININAR
					// ETC.
					impP.guardar(disco);
					disco = new Disco("rockeros-rey", 2018, 11);
					impP.guardar(disco);
					disco = new Disco("vive-sueña", 2019, 9);
					impP.guardar(disco);
					// MENSAJE DE QUE SE GUARDARON LOS ELEMENTOS
					System.out.println("Se guardaron los Discos correctamente");
					break;
				case 2:
					// MOSTRAOS EL CODIGO DURO--- DE DONDE VIENE
					impP.mostrar();
					break;
				case 3:

					// DAMOS DE ALTA AL CANTANTE
					System.out.println("Alta de Alumno");

					System.out.println("Escribe el nommbre del cantate");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
					nombre_cantante = lec.nextLine();

					System.out.println("Escribe el apellido del cantante");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					app = lec.nextLine();

					System.out.println("Escribe el genero del cantante");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					genero = lec.nextLine();

					System.out.println("Escribe la edad del cantante");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					edad_cantante = lec.nextInt();
					// MOSTRAR PROFESORES
					impP.mostrar();
					// ASIGNAREMOS
					System.out.println("Escribe el nombre del disco a asignar");

					lec = new Scanner(System.in);

					// MATRICULA PARA
					titulo_disco = lec.nextLine();
					// LO INSTANCIAMOS PROFESOR CON LA VARIABLE MATRICULA
					disco = new Disco(titulo_disco);
					// VAMOS A CASTEARLO PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO
					// RECIBE UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO PROFESOR DONDE SE ENCUANTRA
					// EN CLASE ALUMNO QUE LO HEMOS DECLARADO
					disco = (Disco) impP.buscar(disco);
					// LLAMAMOS A ALUMNO Y LE DAMOS LOS PARAMETROS
					cantante = new Cantante(nombre_cantante, app, genero, edad_cantante, disco);
					// PARAMETRO ALUMNO
					impA.guardar(cantante);
					// LO CONCATENAMOS
					System.out.println("Se guardo el app  " + cantante.getApp() + " con el nombre "
							+ cantante.getNombre_cantante());
					break;
				case 4:
					System.out.println("Edicion de  cantante");
					// CASO DE EDITAR
					System.out.println("Escribe el nombre del cantante a editar");
					// INSTANCIAMOS
					lec = new Scanner(System.in);

					nombre_cantante = lec.nextLine();
					cantante = new Cantante(nombre_cantante);
					// LO CASTEAMOS PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO RECIBE
					// UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO ALUMNO DONDE SE ENCUANTRA EN
					// CLASE PRINCIAPL QUE LO HEMOS DECLARADO
					cantante = (Cantante) impA.buscar(cantante);
					// EL ALUMNO ES
					System.out.println("Cantante a editar->" + cantante);
//CADA VEZ QUE CREAMOS ALUMNO LO GUARDAMOS Y TENGAMOS LA OPCION DE IR EDITANDO CUALQUIERA DE LOS ATRIBUTOS
					do {

						System.out.println("Opcion de edicion");
						System.out.println("1 Nombre");
						System.out.println("2 Apellido");
						System.out.println("3 Disco");
						System.out.println("4 Menu Principal");
						// LO INSTANCIAMOS ASIGNAMOS
						lec = new Scanner(System.in);
						menuE = lec.nextInt();

						switch (menuE) {
						case 1:

							// PEDIMOS LOS DATOS DEL USUARIO PARA QUE EDITE
							System.out.println("Escribe el nombre nuevo del cantante");
							// LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							nombre_cantante = lec.nextLine();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							cantante.setNombre_cantante(nombre_cantante);
							break;
						case 2:
							System.out.println("Escribe el apellido paterno ");
							lec = new Scanner(System.in);
							app = lec.nextLine();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							cantante.setApp(app);

							break;
						case 3:
							impP.mostrar();
							System.out.println("Escribe titulo del Disco a asignar nuevo");
							// LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							titulo_disco = lec.nextLine();

							disco = new Disco(titulo_disco);
							// EN ESTA PARTE LO CASTEAMOS PORQUE LO ESTAMOS USANDO IMPLEMENTACION DE METODOS
							disco = (Disco) impP.buscar(disco);
							// EL PROFESOR NUEVO ES
							System.out.println("Disco nuevo->" + disco);
							// VAMOS A PASAR LA CLASE PROFESOR PARA QUE HAGA EL CAMBIO
							cantante.setDisco(disco);
							break;

						}// CIERRA SWITCH EDICION
							// TERMINA EL MENU WHILE
					} while (menuE < 4);
					// LE PASAMOS ALUMNO PARA QUE NOS CAMBIELOS DATOS DEL PROFESOR

					impA.editar(cantante);
					break;
				case 5:
					// ELIMINAMOS UN CANTANTE
					System.out.println("Eliminar Cantante");

					System.out.println("Escribe el nombre del cantante a eliminar");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					//
					nombre_cantante = lec.nextLine();
					// INSTANCIAMOS Cantante DE nombre CLASE cantante nombre_cantante
					cantante = new Cantante(nombre_cantante);
					// CASTEAMOS
					cantante = (Cantante) impA.buscar(cantante);
					// LE VAMOS A PASAR LO QUE TIENE ALUMNO---LE PASAMOS LA OPCION DE ALIMINAR DE
					// IMPLEMENTACION Y LISTAO cantante
					impA.eliminar(nombre_cantante);
					// concatenamos lo que tenemos de la matricula
					System.out.println("Se elimino el cantante " + cantante.getNombre_cantante() + " con el apellido "+ cantante.getApp());
					break;
				case 6:
					System.out.println("Buscar cantante");
					//
					System.out.println("Escribe el nombre del cantante a buscar");
					// LO ASIGNAMOS
					lec = new Scanner(System.in);
					nombre_cantante = lec.nextLine();
					// LE PASAMOS LA MATRICULA
					cantante = new Cantante(nombre_cantante);
					// LO CASTEAMOS ESPERA UN OBJETO IMPLEMENTACION DE TIPO ALUMNO A PUNTO BUSCAR
					// ALUMNO
					cantante = (Cantante) impA.buscar(cantante);
					// QUE FUE LO QUE ENCONATRO
					System.out.println("El cantante encontrado es->" + cantante);
					break;
				case 7:
					// MOSTRAMOS EL RESULTADO ALUMNO DE LA IMPLEMENTACION ALUMNO QUE FUE LO QUE
					// HICIMOS PARA QUE NOS ARROJEL RESULTADO
					// DE LO QUE HICIMOS
					impA.mostrar();
					break;
				case 8:
					// BUSCAMOS EL ALUMNO POR PROFESOR
					System.out.println("Busqueda de cantante por Disco");
					// LLAMAMOS AL METODO MOSTRAR DE IMPLEMENTACION ALUMNO
					impP.mostrar();
					//
					System.out.println("Escribe el nombre del cantante que decea que se meustren sus discos asignados");
					// LO ASIGNAMOS
					lec = new Scanner(System.in);
					//// PROFESOR DISCO imP---ALUMNO CANTANTE impA
					// CANTANTE-nombre_cantante---app---genero--edad_cantante-disco
					nombre_cantante = lec.nextLine();
					disco = new Disco(nombre_cantante);
					// LO BUSCAMOS POR EL METODO DE IMPLEMENTACION PROFESOR
					impA.buscarCantantePorDisco(disco);
					break;
				case 9:
					System.out.println("Adios");
					break;
				}// CIERREDE SWITCH
			} while (menu < 9);
			// e ES PARA QUE ATRAPE LA EXCEPTION
		} catch (Exception e) {
			// MENSAJE DEL ERROR
			System.out.println("error" + e + ", favor de intentar nuevamente con numeros!!!!!!");
		}
	}// cierra main

}
