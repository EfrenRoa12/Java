package com.mx.General;

import java.util.List;

import com.mx.Entidad.Pais;


	public interface MetodosPais {

	public String guardar(Pais pais);

	public String eliminar(Pais pais);

	public String editarr(Pais pais);

	public Pais buscar(Pais pais);

	public List<Pais> listar();
}
