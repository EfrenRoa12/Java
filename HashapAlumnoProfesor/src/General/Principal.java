package General;

import java.util.Scanner;

import Entidad.Alumno;
import Entidad.Profesor;
import Implementacion.ImProfesor;
import Implementacion.ImpAlumnos;

public class Principal {

	public static void main(String[] args) {
		// LOS ATRIBUTO LO TRAEMOS DESDE PROFESOR
		String matricula;// key
		String nombre;
		String app;
		int edad;

		// LOS ALUMNOS LO TRAEMOS DESDE SU CLASE
		String matriculaA;
		String nombreA;
		String appA;
		String carrera;
		Profesor profesor;
		Alumno alumno;

		Scanner lec = null;
		int menu, menuE;
		// CADA UNO LO IPORTAMOS DESDE EL PAQUETE
		ImProfesor impP = new ImProfesor();// LO INSTACIAMOS DE LA CLASE IMPPROFESOR
		ImpAlumnos impA = new ImpAlumnos();// LO INSTANCIAMOS DE LA CLASE ALUMNOS
		try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
				// NUEVO EL PARAMETRO
				// CREAMOS EL MENU PRINCIPAL
			do {

				System.out.println("Bienvenidos a su Escuela Enucom");
				System.out.println("1 alta Profesor->Codigo Duro");
				System.out.println("2 mostrar Profesor");
				System.out.println("3 alta Alumno");
				System.out.println("4 editar Alumno");
				System.out.println("5 Eliminar Alumno");
				System.out.println("6 Buscar Alumno");
				System.out.println("7 Mostrar Alumno");
				System.out.println("8 Buscar Alumno por Profesor");
				System.out.println("9 salir");
				// INSTANCIAMOS EL MENU
				lec = new Scanner(System.in);
				menu = lec.nextInt();

				switch (menu) {
				case 1:
					// ALTA
					System.out.println("Escribe la matricula");
					lec = new Scanner(System.in);
					matricula = lec.nextLine();//

					System.out.println("Escribe el nombre del profesor");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();//

					System.out.println("Escribe el apellido del profesor");
					lec = new Scanner(System.in);
					app = lec.nextLine();

					System.out.println("Escribe la edad");
					lec = new Scanner(System.in);
					edad = lec.nextInt();//
					// LISTA DE DATOS-- DONDE SE HAN GUARDADO A LA HORA DE QUE EL USUARIO INSERTAR
					// LOS DATOS
					// TODOS SE GUARDARON EN cel YA QUE ESTA INSTANCIADO E IMPRIME POR TO STRING
					profesor = new Profesor(matricula,nombre,app,edad);
					impP.guardar(profesor);
					// IPRIME LO DATOS DEL CANTATE
					System.out.println("Se dio de alta el profesor: " + profesor);// COMO ESTA INSTANCIADA VIENE DE TOS TRING
					
					break;
				case 2:
					// MOSTRAOS EL CODIGO DURO--- DE DONDE VIENE
					impP.mostrar();
					break;
				case 3:
					// DAMOS DE ALTA AL ALUMNO
					System.out.println("Alta de Alumno");

					System.out.println("Escribe la matricula del alumno");
					//LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
					matriculaA = lec.nextLine();

					System.out.println("Escribe el nombre del alumno");
					//LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					nombreA = lec.nextLine();

					System.out.println("Escribe el app del alumno");
					//LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					appA = lec.nextLine();

					System.out.println("Escribe la carrera del alumno");
					//LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					carrera = lec.nextLine();
					// MOSTRAR PROFESORES
					impP.mostrar();
					// ASIGNAREMOS
					System.out.println("Escribe la matricula del Profesor a asignar");

					lec = new Scanner(System.in);
					// MATRICULA PARA
					matricula = lec.nextLine();
					// LO INSTANCIAMOS PROFESOR CON LA VARIABLE MATRICULA
					profesor = new Profesor(matricula);
					// VAMOS A CASTEARLO PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO
					// RECIBE UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO PROFESOR DONDE SE ENCUANTRA
					// EN CLASE ALUMNO QUE LO HEMOS DECLARADO
					profesor = (Profesor) impP.buscar(profesor);
					// LLAMAMOS A ALUMNO Y LE DAMOS LOS PARAMETROS
					alumno = new Alumno(matriculaA, nombreA, appA, carrera, profesor);
					// PARAMETRO ALUMNO
					impA.guardar(alumno);
					// LO CONCATENAMOS
					System.out.println("Se guardo el alumno " + alumno.getNombre() + " con la matricula " + alumno.getMatricula());
					break;
				case 4:
					System.out.println("Edicion de  Alumno");
					// CASO DE EDITAR
					System.out.println("Escribe la matricula del alumno a editar");
					// INSTANCIAMOS
					lec = new Scanner(System.in);
					matriculaA = lec.nextLine();
					alumno = new Alumno(matriculaA);
					// LO CASTEAMOS PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO RECIBE
					// UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO ALUMNO DONDE SE ENCUANTRA EN
					// CLASE PRINCIAPL QUE LO HEMOS DECLARADO
					alumno = (Alumno) impA.buscar(alumno);
					// EL ALUMNO ES
					System.out.println("Alumno a editar->" + alumno);
//CADA VEZ QUE CREAMOS ALUMNO LO GUARDAMOS Y TENGAMOS LA OPCION DE IR EDITANDO CUALQUIERA DE LOS ATRIBUTOS
					do {
						System.out.println("Opcion de edicion");
						System.out.println("1 App");
						System.out.println("2 Carrera");
						System.out.println("3 Profesor");
						System.out.println("4 Menu Principal");
						// LO INSTANCIAMOS ASIGNAMOS
						lec = new Scanner(System.in);
						menuE = lec.nextInt();

						switch (menuE) {
						case 1:
							// PEDIMOS LOS DATOS DEL USUARIO PARA QUE EDITE
							System.out.println("Escribe el apellido paterno ");
							lec = new Scanner(System.in);
							appA = lec.nextLine();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							alumno.setApp(appA);
							break;
						case 2:
							System.out.println("Escribe la carrera del alumno nuevo");
							//LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							carrera = lec.nextLine();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							alumno.setCarrera(carrera);
							break;
						case 3:
							impP.mostrar();
							System.out.println("Escribe la matricula del Profesor a asignar nuevo");
							//LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							matricula = lec.nextLine();

							profesor = new Profesor(matricula);
							// EN ESTA PARTE LO CASTEAMOS PORQUE LO ESTAMOS USANDO IMPLEMENTACION DE METODOS
							profesor = (Profesor) impP.buscar(profesor);
							// EL PROFESOR NUEVO ES
							System.out.println("Profesor nuevo->" + profesor);
							// VAMOS A PASAR LA CLASE PROFESOR PARA QUE HAGA EL CAMBIO
							alumno.setProfesor(profesor);
							break;
							
							
						}// CIERRA SWITCH EDICION
							// TERMINA EL MENU WHILE
					} while (menuE < 4);
					// LE PASAMOS ALUMNO PARA QUE NOS CAMBIELOS DATOS DEL PROFESOR
					impA.editar(alumno);
					break;
				case 5:
					//ELIMINAMOS UN ALUMNO
					System.out.println("Eliminar Alumno");

					System.out.println("Escribe la matricula del alumno a eliminar");
					//LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					//
					matriculaA = lec.nextLine();
					//INSTANCIAMOS ALUMNO DE ATRICULA CLASE ALUMNO
					alumno = new Alumno(matriculaA);
					//CASTEAMOS
					alumno = (Alumno) impA.buscar(alumno);
					//LE VAMOS A PASAR LO QUE TIENE ALUMNO---LE PASAMOS LA OPCION DE ALIMINAR DE IMPLEMENTACION Y LISTAO
					impA.eliminar(alumno);
					//concatenamos lo que tenemos de la matricula
					System.out.println("Se elimino el alumno " + alumno.getNombre() + " con la matriula " + alumno.getMatricula());
					break;
				case 6:
					System.out.println("Buscar Alumno");
					//
					System.out.println("Escribe la matricula del alumno a buscar");
					//LO ASIGNAMOS
					lec = new Scanner(System.in);
					matriculaA = lec.nextLine();
					//LE PASAMOS LA MATRICULA
					alumno = new Alumno(matriculaA);
					//LO CASTEAMOS ESPERA UN OBJETO IMPLEMENTACION DE TIPO ALUMNO A PUNTO BUSCAR ALUMNO
					alumno = (Alumno) impA.buscar(alumno);
					//QUE FUE LO QUE ENCONATRO
					System.out.println("El alumno encontrado es->" + alumno);
					break;
				case 7:
					//MOSTRAMOS EL RESULTADO ALUMNO DE LA IMPLEMENTACION ALUMNO QUE FUE LO QUE HICIMOS PARA QUE NOS ARROJEL RESULTADO
					//DE LO QUE HICIMOS
					impA.mostrar();
					break;
				case 8:
					//BUSCAMOS EL ALUMNO POR PROFESOR
					System.out.println("Busqueda de Alumnos por Profesor");
					//LLAMAMOS AL METODO MOSTRAR DE IMPLEMENTACION ALUMNO 
					impP.mostrar();
					//
					System.out.println("Escribe la matricula del profesor que decear que se meustren sus alumno asignados");
					//LO ASIGNAMOS
					lec = new Scanner(System.in);
					//
					matricula = lec.nextLine();
					profesor = new Profesor(matricula);
					//LO BUSCAMOS POR EL METODO DE IMPLEMENTACION PROFESOR
					impA.buscarAlumnosProfesor(profesor);
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
	}// CIERRA MAIN

}// CIERRA PRINCIPAL
