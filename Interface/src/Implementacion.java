import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {// cuando error add encima
	List<Estado> lista = new ArrayList<Estado>();

	@Override
	public void guardar(Estado estado) {
		// TODO Auto-generated method stub
		lista.add(estado);
	}

	@Override
	public void editar(int indice, Estado estado) {
		// TODO Auto-generated method stub
		lista.set(indice, estado);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Estado buscar(int indice) {
		// TODO Auto-generated method stub
		Estado e = lista.get(indice);
		return e;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

}// cierra clase
