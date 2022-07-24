package com.mx.General;

import java.util.List;

import com.mx.Entidad.Pokemon;

public interface Metodos {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Pokemon pokemon);

	public String eliminar(Pokemon pokemon);

	public String editar(Pokemon pokemon);

	// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
	// DEVUELVE
	public Pokemon buscar(Pokemon pokemon);

	// NOS ENLISTA NOS MUESTRA
	public List<Pokemon> listar();
}
