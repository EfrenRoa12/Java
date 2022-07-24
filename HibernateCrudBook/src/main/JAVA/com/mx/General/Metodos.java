package com.mx.General;

import java.util.List;

import com.mx.Entidad.Libro;

public interface Metodos {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Libro libro);

	public String eliminar(Libro libro);

	public String editar(Libro libro);

	// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
	// DEVUELVE
	public Libro buscar(Libro libro);

	// NOS ENLISTA NOS MUESTRA
	public List<Libro> listar();
}
