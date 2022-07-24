package com.mx.General;

import java.util.List;

import com.mx.Entidad.Celular;

public interface MetodosCelular {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Celular celular);

	public String eliminar(Celular celular);

	public String editar(Celular celular);

	// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN PROFESOS Y NOS
	// DEVUELVE
	public Celular buscar(Celular celular);

	// NOS ENLISTA NOS MUESTRA
	public List<Celular> listar();
}
