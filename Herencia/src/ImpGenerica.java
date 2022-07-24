import java.util.HashMap;

public class ImpGenerica implements Metodos{//implementamos el metodo
	//hashmap
	HashMap<Object, Object> hash = new HashMap<Object, Object>();
	
	
	@Override
	public void guardar(Object key, Object value) {
		// 
		hash.put(key, value);
	}

	@Override
	public Object editar(Object key, Object value) {
		Object a = null;
	   a = this.buscar(key);
	   if(a!=null) {
		   hash.put(key, value);
	   }else {
		   System.out.println("Objeto no encontrado");
		   return null;
	   }
	 
		
		
		return  hash.get(key); 
	}

	@Override
	public void eliminar(Object key) {
		// 
		hash.remove(key);
		
	}

	

	@Override
	public void mostrar() {
		// 
		System.out.println(hash);
		}

	@Override
	public Object buscar(Object key) {
		// 
		return hash.get(key);
	}

	
	
}
