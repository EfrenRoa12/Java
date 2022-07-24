
public interface Metodo {
	public void guardar(Ropa ropa);

	public void editar(int index, Ropa ropa);

	public void eliminar(int index);

	public Ropa buscar(int index);

	public void mostrar();
}
