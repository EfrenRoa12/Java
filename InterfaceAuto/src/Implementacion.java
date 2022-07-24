import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodo {
	List<Auto> lista = new ArrayList<Auto>();

	@Override
	public void guardar(Auto auto) {
		//
		lista.add(auto);
	}

	@Override
	public void editar(int indice, Auto auto) {
		// 
		lista.set(indice, auto);
	}

	@Override
	public void eliminar(int indice) {
		// 
		lista.remove(indice);
	}

	@Override
	public Auto buscar(int indice) {
		// 
		Auto a = lista.get(indice);
		return a;
	}

	@Override
	public void mostrar() {
		// 
		System.out.println(lista);
	}
}
