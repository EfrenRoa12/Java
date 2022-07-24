
public interface Metodo {
	public void guardar(MediosTransporte transporte);

	public void editar(int index, MediosTransporte transporte);

	public void eliminar(int index);

	public MediosTransporte buscar(int index);

	public void mostrar();
}
