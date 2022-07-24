package _5InterfaceCRUDLista;

public interface Metodos {
	// INTERFACE = ABSTRACTO PARA AGRUPAR METODO VACIO
	// OCULTA DETALLE SOLO MUESTR DETALLE IMPORTANTE DE OBJETO
	// JAVA NO TIENE HERENCIA MULTIPLE POR LO QUE INTERFACE HACE MULTIPLE
	// IMPLEMENTACION
	// ------------------------------------------------
	public void guardar(Celular celular);

	public void editar(int indice, Celular celular);

	public void eliminar(int indice);

	public Celular buscar(int indice);

	public void mostrar();

}
