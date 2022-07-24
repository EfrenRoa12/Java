package com.mx.General;

import java.util.List;

import com.mx.Entidad.Estado;

public interface MetodosEstado {

	public String guardar(Estado estado);

	public String eliminar(Estado estado);

	public String editar(Estado estado);

	public Estado buscar(Estado estado);

	public List<Estado> listar();
}
