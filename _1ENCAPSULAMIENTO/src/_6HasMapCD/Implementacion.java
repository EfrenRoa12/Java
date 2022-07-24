package _6HasMapCD;

import java.util.HashMap;

public class Implementacion implements Metodos{
	HashMap<String, Empleado> hash = new HashMap<String, Empleado>();
	
	@Override
	public void guardar(Empleado empleado) {
		// para agregarle elementos, use el put()
		hash.put(empleado.getNombre(), empleado);
	}

	@Override
	public void editar(Empleado empleado) {
		// para agregarle elementos, use el put()
		//lo edita con este medoto
		hash.put(empleado.getNombre(), empleado);
	}

	@Override
	public void eliminar(Empleado empleado) {
		// eliminar un elemento, utilice el remove()método y consulte la clave
		hash.remove(empleado.getNombre());
	}

	@Override
	public Empleado buscar(Empleado empleado) {
		//Para acceder a un valor en el HashMap, use el get()
		return hash.get(empleado.getNombre());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}

}
