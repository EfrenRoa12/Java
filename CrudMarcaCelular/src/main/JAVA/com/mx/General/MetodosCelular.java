package com.mx.General;

import java.util.List;

import com.mx.Entidad.Marca;

public interface MetodosCelular {
	
	public String guardar(Marca marca);

	public String eliminar(Marca marca);

	public String editarr(Marca marca);

	public Marca buscar(Marca marca);

	public List<Marca> listar();
	
}
