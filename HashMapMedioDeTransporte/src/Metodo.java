
public interface Metodo {
	// acciones a realizar
	public void guardar(Object obj);

	public void editar(int index,Object obj);

	public void eliminar(Object obj);

	public Object buscar(Object obj);// retorna

	public void mostrar();// ya no en hasmap llave y valor

	public void contar();
	public Transporte buscar(int index);

	public void vaciar();
}
