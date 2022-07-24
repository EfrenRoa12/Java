package Practica12Hash;

public interface Metodo {
	//CREAMOS LOS METODOS EN ESTE INTERFACE
	public void guardar(Hospital hospitall);

	public void editar(int index,Hospital hospitall);

	public void eliminar(int index);

	public Hospital buscar(int index);

	public void mostrar();

}
