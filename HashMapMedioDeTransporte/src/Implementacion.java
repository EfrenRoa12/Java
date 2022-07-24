import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Implementacion implements Metodo {
	HashMap<String, Transporte> hash = new HashMap<String, Transporte>();

	Transporte trans = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		hash.put(trans.getNombre(), trans);
	}

	@Override
	public void editar(int index, Object obj) {
		trans = (Transporte) obj;
		hash.put(trans.getNombre(), trans);
		

	}

	@Override
	public void eliminar(Object obj) {
		trans = (Transporte) obj;
		hash.remove(trans.getNombre());

	}

	@Override
	public Object buscar(Object obj) {
		trans = (Transporte) obj;
		return hash.get(trans.getNombre());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

	public void contar() {
		System.out.println("El hash tiene" + hash.size() + "medios de transporte");
	}

	public void eliminarTodo() {
		hash.clear();
		System.out.println("Se han eliminado todos los medios de transporte ");
	}

	public void vaciar() {
		if (hash.isEmpty()) {
			System.out.println("El hash esta vacio");
		} else {
			System.out.println("El hash no esta vacio, tiene: " + hash.size() + " medios de transporte");
		}
	}

	public void buscarTipo(Object obj) {
		trans = (Transporte) obj;
		for (Map.Entry<String, Transporte> h : hash.entrySet()) {

			if (h.getValue().getTipo().equals(trans.getTipo())) {
				System.out.println("Se ha encontrado el medio de transporte: " + h);
			}

		} // Cierra for
	}

	@Override
	public Transporte buscar(int index) {
		Transporte transporte = hash.get(index);
		return transporte;
	}

}
