import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Fruta> lista = new ArrayList<Fruta>();

		// lo hacemos como el indice
		Fruta frutaB = new Fruta("Manzana", 5, 10);
		lista.add(frutaB);
		frutaB = new Fruta("Durazno", 2, 25);
		lista.add(frutaB);// add es para agregar una lista
		frutaB = new Fruta("Fresa", 4, 15);
		lista.add(frutaB);

		// mostrar
		System.out.println(lista);
		// mostramos la lista
		frutaB = lista.get(0);
		System.out.println("fruta encontrada: " + frutaB);

		/*-------------EDITAR--------------
		 * antes de editar vamos a buscar
		 */
		// ------BUSCAR--------

		frutaB = lista.get(0);// posicion0
		// editar
		frutaB.setNombre("mandarina");// cambiamos nombre
		// ------EDITAR-----
		lista.set(0, frutaB);// me da la informacion de la fruta
		System.out.println("Fruta editada" + frutaB);

		// -----ELIMINAMOS------
		// buscar
		frutaB = lista.get(2);// posicion1
		lista.remove(2);
		System.out.println("Fruta eliminada" + frutaB);
		System.out.println(lista);

	}

}
