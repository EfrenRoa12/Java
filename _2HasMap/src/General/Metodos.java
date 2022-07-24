package General;

public interface Metodos {
	/*
	Es la clase mas abstracta de la programación en lenguaje Java.Sirve un contenedor de objetos;
	No es un objeto en especifico,pero se puede convertir en uno.
	Se puede implementar en cualquier tipo de clase.
	POO finalidad es reutilizar código ,tener un código genérico,y consumir menos espacio de memoria.
	 */
	public void guardar(Object obj);

	public void editar(Object obj);

	public void eliminar(Object obj);

	public Object buscar(Object obj);

	public void mostrar();
}
