package com.mx.General;

import java.util.List;

import com.mx.Entidad.Fruta;

public interface Metodos {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Fruta fruta);

	public String eliminar(Fruta fruta);

	public String editar(Fruta fruta);

	// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
	// DEVUELVE
	public Fruta buscar(Fruta fruta);

	// NOS ENLISTA NOS MUESTRA
	public List<Fruta> listar();
}
