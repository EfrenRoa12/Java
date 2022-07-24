package General;

import java.util.List;

import Entidad.Perro;

public interface Metodos {
	public String guardar(Perro perro);

	public String editar(Perro perro);

	public String eliminar(Perro perro);

	public Perro buscar(Perro perro);

	public List<Perro> listar();
}
