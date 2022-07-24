import java.util.HashMap;

public class Implementacion implements Metodos{
	HashMap<String, Caricatura> hash = new HashMap<String, Caricatura>();
	Caricatura caric = null;
	@Override
	public void editar(Object obj) {
		caric = (Caricatura) obj;
		hash.put(caric.getNombre(), caric);
	}
	@Override
	public void eliminar(Object obj) {
		caric = (Caricatura) obj;
		hash.remove(caric.getNombre());
	}
	@Override
	public Caricatura buscar(Object obj) {
		caric = (Caricatura) obj;
		return hash.get(caric.getNombre());
	}
	@Override
	public void mostrar() {
		System.out.println(hash);
	}
	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		hash.put(caric.getNombre(), caric);
	}
	@Override
	public void contar() {
		System.out.println("El hash tiene"+hash.size()+"medios de transporte");
		
	}
	@Override
	public void eliminarTodo(Object obj) {
		hash.clear();
		System.out.println("Se han eliminado todos los medios de transporte ");
	}
	
	

}
