package _4InterfaceLista;

public interface Metodos {

	// INTERFACE ES ABSTRACTO PARA AGRUPAR METODOS VACIO
	// POR SEGURIDAD OCULTA DETALLE SOLO MUESTRA DETELLES IMPORTANTES DEL
	// OBJETO
	// COMO JAVA NO TIENE HERENCIA MULTIPLE LA INTERFACE LO LOGRA
	// CON VARIAS IMPLEMENTACIONES
	// ------------------------------------------------------------
	// VOID SIGNIFICA NO RETORNA NINGUN VALOR
	public void guardar(Universo universo);

	public void editar(int indice, Universo universo);

	public void eliminar(int indice);

	public Universo buscar(int indice);

	public void mostrarr();

}
