
public class Principal {

	public static void main(String[] args) {

		// INSTANCIAMOS
		Postre pos1 = new Postre("Flan", 20, 100);
		Postre pos2 = new Postre("Pay de queso", 15, 200);
		Postre pos3 = new Postre("Pastel helado", 50, 500);
		
		// COMODIN--INSTANCIAMOS CON POSTRE
		Postre pc = null;
		Postre pc2 = null;
		//IPEMENTACION LO INSTANCIAMOS--DE AHI VIENEN LS METODOS LAS ACCIONES A REALIZAR
		Implementacion imp = new Implementacion();

		// GUARDAR--LOS DATO DONDE INSTANCIAMOS-POR LA IMPLEMENTACION--POR METODO
		imp.guardar(pos1);
		imp.guardar(pos2);
		imp.guardar(pos3);
		// METODO MOSTRAR
		imp.mostrar();

		// NO BUSCADO
		pc = new Postre("Pastel de zanahoria", 25, 100);
		System.out.println("Postre sin buscar" + pc);
		
		// ENCONTRADO
		pc2 = imp.buscar(pc);
		System.out.println("Postre encontrado " + pc);

		// ANTES DE EDITAR BUSCAR
		pc.setPrecio(105);
		imp.editar(pc);
		imp.mostrar();

		// eliminar

		pc = new Postre("arroz");
		imp.eliminar(pc);
		imp.mostrar();

	}// cierra main

}// cierra clase principal
