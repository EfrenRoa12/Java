package General;

import Entidad.Enfermera;

public interface Metodo {
	//ESTE ES EL METODO QUE VAMOD A CREARLO PARA IMPLEMENTAR EN ENFERMERA---MEDICO---PARAMEDICO
	public void guardar(Object obj);

	public void editar(Object obj);

	public void eliminar(Object obj);

	public Object buscar(Object obj);

	public void mostrar();

	Enfermera buscar(int index);

	void registrar(Object obj);
}
