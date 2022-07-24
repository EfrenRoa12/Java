package General;

import java.util.Scanner;

import Entidad.Enfermera;
import Entidad.Medico;
import Entidad.Paramedico;
import Entidad.PersonalHospital;
import Implementacion.ImpEnfermera;
import Implementacion.ImpMedico;

public class Principal {
	public static void main(String[] args) {
		// ARIBUTOS DE MEDICO
		String consulta;
		String especialidad;
		// ARIBUTOS DE ENFERMERA
		String observacion;
		String id_clinico;
		// ARIBUTOS DE PARAMEDICO
		String cursos;
		String tipo_ambulancia;

		// ARIBUTOS DE CLASES
		PersonalHospital PersonalHospital;
		Medico medico;// el papa profesor
		Enfermera enfermera;// el hijo alumno
		Paramedico paramedico;

		// ATRIBUTO MEDICO GENERAL
		String nombre;
		String app;
		String titulo;
		String cedula;
		String universidad;

		Scanner lec = null;
		int menu, menuE;
		// CADA UNO LO IPORTAMOS DESDE EL PAQUETE
		ImpMedico impP = new ImpMedico();// el papa profesor
		ImpEnfermera impA = new ImpEnfermera();// hijo alumno

		try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
				// NUEVO EL PARAMETRO
				// CREAMOS EL MENU PRINCIPAL
			do {

				System.out.println("Bienvenidos al Hospital Enucom");
				System.out.println("1 alta Medico->Codigo Duro");
				System.out.println("2 mostrar Medico");
				System.out.println("3 alta Enfermera");
				System.out.println("4 editar Enfermera");
				System.out.println("5 Eliminar Enfermera");
				System.out.println("6 Buscar Enfermera");
				System.out.println("7 MostrarEnfermera");
				System.out.println("8 Buscar Enfermera por Medico");
				System.out.println("9 salir");
				// INSTANCIAMOS EL MENU
				lec = new Scanner(System.in);
				menu = lec.nextInt();

				switch (menu) {
				case 1:
					// CODIGO DURO
					// SON LOS ATRIBUTOS DE PROFESOR MENU PRINCIPAL
					medico = new Medico("jose", "hernanz", "medico", "ced-123", "Unam", "activo", "cirujano",
							PersonalHospital);
					// impP ES DONDE SE INSTANCIA DE IMPLEMENTOS DE METODOS COMO GUARDAR ELMININAR
					// ETC.
					impP.guardar(medico);
					medico = new Medico("hector", "vizcarra", "medico", "ced-532", "politecnico", "activo", "pediatria",
							PersonalHospital);
					impP.guardar(medico);
					medico = new Medico("mario", "yanez", "medico", "ced-8634", "buap", "activo", "general",
							PersonalHospital);
					impP.guardar(medico);
					// MENSAJE DE QUE SE GUARDARON LOS ELEMENTOS
					System.out.println("Se guardaron los medicos correctamente");
					break;
				case 2:
					// MOSTRAOS EL CODIGO DURO--- DE DONDE VIENE
					impP.mostrar();
					break;
				case 3:

					// DAMOS DE ALTA AL ALUMNO
					System.out.println("Alta de Enfermera");
					System.out.println("Escribe el nombre de la enfermera");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					nombre = lec.nextLine();

					System.out.println("Escribe el apellido del alumno");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					app = lec.nextLine();

					System.out.println("Escribe id de enfermera");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
					id_clinico = lec.nextLine();

					System.out.println("Escribe la universidad del alumno");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					universidad = lec.nextLine();

					System.out.println("Escribe titulo de enfermera");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
					titulo = lec.nextLine();

					System.out.println("Escribe la observacion");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					observacion = lec.nextLine();

					// MOSTRAR PROFESORES
					impP.mostrar();

					// ASIGNAREMOS
					System.out.println("Escribe la especialidad del medico a asignar");

					lec = new Scanner(System.in);
					// MATRICULA PARA

					especialidad = lec.nextLine();
					// LO INSTANCIAMOS PROFESOR CON LA VARIABLE MATRICULA
					medico = new Medico(especialidad);
					// VAMOS A CASTEARLO PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO
					// RECIBE UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO PROFESOR DONDE SE ENCUANTRA
					// EN CLASE ALUMNO QUE LO HEMOS DECLARADO
					medico = (Medico) impP.buscar(medico);
					// LLAMAMOS A ALUMNO Y LE DAMOS LOS PARAMETROS

					enfermera = new Enfermera(observacion, id_clinico, nombre, app, titulo, cedula, universidad,
							medico);
					// PARAMETRO ALUMNO
					impA.guardar(enfermera);
					// LO CONCATENAMOS
					System.out.println("Se guardo la enfermera " + enfermera.getNombre() + " con el id "
							+ enfermera.getId_clinico());
					break;
				case 4:
					System.out.println("Edicion de  enfermera");
					// CASO DE EDITAR
					System.out.println("Escribe la id de enfermera a editar");
					// INSTANCIAMOS
					lec = new Scanner(System.in);
					id_clinico = lec.nextLine();
					enfermera = new Enfermera(id_clinico);
					// LO CASTEAMOS PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO RECIBE
					// UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO ALUMNO DONDE SE ENCUANTRA EN
					// CLASE PRINCIAPL QUE LO HEMOS DECLARADO
					enfermera = (Enfermera) impA.buscar(enfermera);
					// EL ALUMNO ES
					System.out.println("Alumno a editar->" + enfermera);
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
							System.out.println("Alta de Enfermera");
							System.out.println("Escribe el nombre de la enfermera");
							// LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							nombre = lec.nextLine();

							break;
						case 2:
							System.out.println("Escribe id de enfermera");
							// LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
							id_clinico = lec.nextLine();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							enfermera.setId_clinico(id_clinico);
							break;
						case 3:
							impP.mostrar();
							System.out.println("Escribe la especialidad del medico a nuevo");
							// LO ASIGNAMOS DE println
							lec = new Scanner(System.in);
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							especialidad = lec.nextLine();

							medico = new Medico(especialidad);
							// EN ESTA PARTE LO CASTEAMOS PORQUE LO ESTAMOS USANDO IMPLEMENTACION DE METODOS
							medico = (Medico) impP.buscar(medico);
							// EL PROFESOR NUEVO ES
							System.out.println("Profesor nuevo->" + medico);
							// VAMOS A PASAR LA CLASE PROFESOR PARA QUE HAGA EL CAMBIO
							enfermera.setPersonalHospital(medico);
							break;

						}// CIERRA SWITCH EDICION
							// TERMINA EL MENU WHILE
					} while (menuE < 4);
					// LE PASAMOS ALUMNO PARA QUE NOS CAMBIELOS DATOS DEL PROFESOR
					impA.editar(enfermera);
					break;
				case 5:
					// ELIMINAMOS UN ALUMNO
					System.out.println("Eliminar enfermera");

					System.out.println("Escribe el id de la enfermera a eliminar");
					// LO ASIGNAMOS DE println
					lec = new Scanner(System.in);
					//
					id_clinico = lec.nextLine();
					// INSTANCIAMOS ALUMNO DE ATRICULA CLASE ALUMNO
					enfermera = new Enfermera(id_clinico);
					// CASTEAMOS
					enfermera = (Enfermera) impA.buscar(enfermera);
					// LE VAMOS A PASAR LO QUE TIENE ALUMNO---LE PASAMOS LA OPCION DE ALIMINAR DE
					// IMPLEMENTACION Y LISTAO
					impA.eliminar(enfermera);
					// concatenamos lo que tenemos de la matricula
					System.out.println("Se elimino la enfermera " + enfermera.getNombre() + " con el id "
							+ enfermera.getId_clinico());
					break;
				// nombre-app titulo-cedula-universidad;
				// ImpMedico impP--->profesor--> Medico-->consulta-especialidad
				// ImpEnfermera impA --->enfermera --->observacion---id_clinico
				case 6:
					System.out.println("Buscar enfermera");
					//
					System.out.println("Escribe id de la enfermera a buscar");
					// LO ASIGNAMOS
					lec = new Scanner(System.in);
					id_clinico = lec.nextLine();
					// LE PASAMOS LA MATRICULA
					enfermera = new Enfermera(id_clinico);
					// LO CASTEAMOS ESPERA UN OBJETO IMPLEMENTACION DE TIPO ALUMNO A PUNTO BUSCAR
					// ALUMNO
					enfermera = (Enfermera) impA.buscar(enfermera);
					// QUE FUE LO QUE ENCONATRO
					System.out.println("la enfermera encontrada es->" + enfermera);
					break;
				case 7:
					// MOSTRAMOS EL RESULTADO ALUMNO DE LA IMPLEMENTACION ALUMNO QUE FUE LO QUE
					// HICIMOS PARA QUE NOS ARROJEL RESULTADO
					// DE LO QUE HICIMOS
					impA.mostrar();
					break;
				case 8:
					// BUSCAMOS EL ALUMNO POR PROFESOR
					System.out.println("Busqueda de enfermera por medico");
					// LLAMAMOS AL METODO MOSTRAR DE IMPLEMENTACION ALUMNO
					impP.mostrar();
					//
					System.out
							.println("Escribe especialidad del medico que decear que se meustren sus alumno asignados");
					// LO ASIGNAMOS
					lec = new Scanner(System.in);
					//
					especialidad = lec.nextLine();
					medico = new Medico(especialidad);
					// LO BUSCAMOS POR EL METODO DE IMPLEMENTACION PROFESOR
					impA.buscarEnfermeraPorPersonalHospitalNombre(PersonalHospital);
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

}
