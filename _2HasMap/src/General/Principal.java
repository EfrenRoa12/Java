package General;

import java.util.Scanner;

import Entidad.Celular;
import Entidad.Marca;
import Implementacion.ImplementacionCelular;
import Implementacion.ImplementacionMarca;
public class Principal {

	public static void main(String[] args) {
		// ATRIBUTO-MARCA
		String nombre_marca;// key
		String pais_marca;
		String slogan_marca;
		// ATRIBUTOS- CELULAR
		String modelo;// key,
		String si;
		double precio;
		// ES UN OBJETO DE LA CLASE PROFESOR DENTRO DEL ALUMNO---UNA VEZ CREADO LA CLASE
		// MARCA
		Marca marca;
		Celular celular;

		Scanner entrada = null;
		int menu, menuE;

		ImplementacionMarca impMarca = new ImplementacionMarca();// marca profe
		ImplementacionCelular impCelular = new ImplementacionCelular();// celular alumno
		try {// INICIAMOS EL TRY --> POR SI EL USUARIO SE EQUIVOCA PUEDA VOLVER A INGRESAR DE
				// NUEVO EL PARAMETRO
				// CREAMOS EL MENU PRINCIPAL
			do {

				System.out.println("Bienvenidos a celular Enucom");
				System.out.println("1 alta Marca->Codigo Duro");
				System.out.println("2 mostrar Marca");
				System.out.println("3 alta celular");
				System.out.println("4 editar celular");
				System.out.println("5 Eliminar celular");
				System.out.println("6 Buscar celular");
				System.out.println("7 Mostrar celular");
				System.out.println("8 Buscar celular por marca");
				System.out.println("9 salir");
				// INSTANCIAMOS EL MENU
				entrada = new Scanner(System.in);
				menu = entrada.nextInt();

				switch (menu) {
				case 1:
					// CODIGO DURO
					// SON LOS ATRIBUTOS DE PROFESOR MENU PRINCIPAL

					marca = new Marca("NOKIA", "FINLANDIA", "Conectando personas");
					// impP ES DONDE SE INSTANCIA DE IMPLEMENTOS DE METODOS COMO GUARDAR ELMININAR
					// ETC.
					impMarca.guardar(marca);
					marca = new Marca("SAMNGUNG", "COREA", "Designed For");
					impMarca.guardar(marca);
					marca = new Marca("LG", "COREA DEL SUR", "Life´s Good");
					impMarca.guardar(marca);
					// MENSAJE DE QUE SE GUARDARON LOS ELEMENTOS
					System.out.println("Se guardaron las marcas correctamente");
					break;
				case 2:
					// MOSTRAOS EL CODIGO DURO--- DE DONDE VIENE
					impMarca.mostrar();
					break;
				case 3:
					// DAMOS DE ALTA AL ALUMNO

					System.out.println("Alta de Celular");

					System.out.println("Escribe modelo");
					// LO ASIGNAMOS DE println
					entrada = new Scanner(System.in);
					// TIPO DE CARACTER LINE lec ES VARIABE DEL SISTEMA
					modelo = entrada.nextLine();

					System.out.println("Escribe el so");
					// LO ASIGNAMOS DE println
					entrada = new Scanner(System.in);
					si = entrada.nextLine();

					System.out.println("Escribe el precio");
					// LO ASIGNAMOS DE println
					entrada = new Scanner(System.in);
					precio = entrada.nextInt();

					// MOSTRAR PROFESORES
					impMarca.mostrar();
					// ASIGNAREMOS

					System.out.println("Escribe el nombre de la marca a asignar");

					entrada = new Scanner(System.in);
					// MATRICULA PARA
					nombre_marca = entrada.nextLine();
					// LO INSTANCIAMOS PROFESOR CON LA VARIABLE MATRICULA
					marca = new Marca(nombre_marca);
					// VAMOS A CASTEARLO PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO
					// RECIBE UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO PROFESOR DONDE SE ENCUANTRA
					// EN CLASE ALUMNO QUE LO HEMOS DECLARADO
					marca = (Marca) impMarca.buscar(marca);
					// LLAMAMOS A ALUMNO Y LE DAMOS LOS PARAMETROS
					celular = new Celular(modelo, si, precio, marca);
					// PARAMETRO ALUMNO
					impCelular.guardar(celular);
					// LO CONCATENAMOS
					System.out.println(
							"Se guardo el celular " + celular.getModelo() + " con el precio " + celular.getPrecio());
					break;
				case 4:
					System.out.println("Edicion de  celular");
					// CASO DE EDITAR
					System.out.println("Escribe la modelo del celular a editar");
					// INSTANCIAMOS
					entrada = new Scanner(System.in);
					modelo = entrada.nextLine();
					celular = new Celular(modelo);
					// LO CASTEAMOS PORQUE LO ESTAMOS BUSCANDO CON EL METODO BUSCAR PERO COMO RECIBE
					// UN OBJETO
					// LO QUE VAMOS A BUSCAR ES UN TIPO OBJETO LLAMADO ALUMNO DONDE SE ENCUANTRA EN
					// CLASE PRINCIAPL QUE LO HEMOS DECLARADO
					celular = (Celular) impCelular.buscar(celular);
					// EL ALUMNO ES
					System.out.println("Celular a editar->" + celular);
					// CADA VEZ QUE CREAMOS ALUMNO LO GUARDAMOS Y TENGAMOS LA OPCION DE IR EDITANDO
					// CUALQUIERA DE LOS ATRIBUTOS
					do {

						System.out.println("Opcion de edicion");
						System.out.println("1 modelo");
						System.out.println("2 precio");
						System.out.println("3 asigna marca");
						System.out.println("4 Menu Principal");
						// LO INSTANCIAMOS ASIGNAMOS
						entrada = new Scanner(System.in);
						menuE = entrada.nextInt();

						switch (menuE) {
						case 1:
							// PEDIMOS LOS DATOS DEL USUARIO PARA QUE EDITE
							System.out.println("Escribe el modelo ");
							entrada = new Scanner(System.in);
							modelo = entrada.next();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO

							celular.setModelo(modelo);
							break;
						case 2:
							System.out.println("Escribe precio nuevo");
							// LO ASIGNAMOS DE println
							entrada = new Scanner(System.in);
							precio = entrada.nextInt();
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							celular.setPrecio(precio);
							break;
						case 3:
							impMarca.mostrar();
							System.out.println("Escribe nombre de la marca a asignar nuevo");
							// LO ASIGNAMOS DE println
							entrada = new Scanner(System.in);
							// VAMOS A SETEARLO DAMOS UN VALOR ASIGNADO
							nombre_marca = entrada.nextLine();

							marca = new Marca(nombre_marca);
							// EN ESTA PARTE LO CASTEAMOS PORQUE LO ESTAMOS USANDO IMPLEMENTACION DE METODOS
							marca = (Marca) impMarca.buscar(marca);
							// EL PROFESOR NUEVO ES
							System.out.println("Marca nueva->" + marca);
							// VAMOS A PASAR LA CLASE PROFESOR PARA QUE HAGA EL CAMBIO
							celular.setMarca(marca);
							break;

						}// CIERRA SWITCH EDICION
							// TERMINA EL MENU WHILE
					} while (menuE < 4);
					// LE PASAMOS ALUMNO PARA QUE NOS CAMBIELOS DATOS DEL PROFESOR
					impCelular.editar(celular);
					break;
				case 5:
					// ELIMINAMOS UN ALUMNO
					System.out.println("Eliminar Celular");

					System.out.println("Escribe el modelo del celular a eliminar");
					// LO ASIGNAMOS DE println
					entrada = new Scanner(System.in);

					modelo = entrada.nextLine();
					// INSTANCIAMOS ALUMNO DE ATRICULA CLASE ALUMNO
					celular = new Celular(modelo);
					// CASTEAMOS
					celular = (Celular) impCelular.buscar(celular);
					// LE VAMOS A PASAR LO QUE TIENE ALUMNO---LE PASAMOS LA OPCION DE ALIMINAR DE
					// IMPLEMENTACION Y LISTAO
					impCelular.eliminar(celular);
					// concatenamos lo que tenemos de la matricula
					System.out.println(
							"Se elimino el celular " + celular.getMarca() + " con el modelo " + celular.getModelo());
					break;
				case 6:
					System.out.println("Buscar celular");
					//
					System.out.println("Escribe el modelo del celular a buscar");
					// LO ASIGNAMOS
					entrada = new Scanner(System.in);
					modelo = entrada.nextLine();
					// LE PASAMOS LA MATRICULA
					celular = new Celular(modelo);
					// LO CASTEAMOS ESPERA UN OBJETO IMPLEMENTACION DE TIPO ALUMNO A PUNTO BUSCAR
					// ALUMNO
					celular = (Celular) impCelular.buscar(celular);
					// QUE FUE LO QUE ENCONATRO
					System.out.println("El celular encontrado es->" + celular);
					break;
				case 7:
					// MOSTRAMOS EL RESULTADO ALUMNO DE LA IMPLEMENTACION ALUMNO QUE FUE LO QUE
					// HICIMOS PARA QUE NOS ARROJEL RESULTADO
					// DE LO QUE HICIMOS
					impCelular.mostrar();
					break;
				case 8:
					// BUSCAMOS EL ALUMNO POR PROFESOR
					System.out.println("Busqueda de Celular por Marca");
					// LLAMAMOS AL METODO MOSTRAR DE IMPLEMENTACION ALUMNO
					impMarca.mostrar();
					//
					System.out.println("Escribe el nombre del marca que decear que se meustren sus celular asignados");
					// LO ASIGNAMOS
					entrada = new Scanner(System.in);
					// PADRE-PROFESOR-MARCA-imP------HIJO-ALUMNO-CELULAR-impA
					// atributo marca---> nombre_marca pais_marca slogan_marca
					// atributo celular----> modelo---> si precio --- marca
					nombre_marca = entrada.nextLine();
					marca = new Marca(nombre_marca);
					// LO BUSCAMOS POR EL METODO DE IMPLEMENTACION PROFESOR
					impCelular.buscarCelularPorMarca(marca);
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

	}

}
