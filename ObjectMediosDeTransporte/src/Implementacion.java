import java.util.HashMap;

public class Implementacion  implements Metodos {
	HashMap<String, MediosTransporte> hash = new HashMap<String, MediosTransporte>();

	@Override
	public void guardar(MediosTransporte transporte) {
		// 
		hash.put(transporte.getNombre(), transporte);
	}

	@Override
	public void editar(MediosTransporte transporte) {
		// 
		hash.put(transporte.getNombre(), transporte);
	}

	@Override
	public void eliminar(MediosTransporte transporte) {
		// 
		hash.remove(transporte.getNombre());
	}

	@Override
	public MediosTransporte buscar(MediosTransporte transporte) {
		// 
		return hash.get(transporte.getNombre());
	}

	@Override
	public void mostrar() {
		// 
		System.out.println(hash);
	}

	@Override
	public void contar() {
		// T
		System.out.println("El hash tiene"+hash.size()+"medios de transporte");
	}

	@Override
	public void eliminarTodo(MediosTransporte transporte) {
		// T
		hash.clear();
		System.out.println("Se han eliminado todos los medios de transporte ");
	}	
}