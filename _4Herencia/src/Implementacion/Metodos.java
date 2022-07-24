package Implementacion;

public interface Metodos {
	
	public void guardar(Object key, Object value);// clave llave le damos parametro de cualquier clase---key value

	public void editar(Object key, Object value);

	public void eliminar(Object key);

	public Object buscar(Object key);

	public void mostrar();

}
