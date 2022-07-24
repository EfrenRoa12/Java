package com.mx.General;

import java.util.List;

import com.mx.Entidad.Profesor;

public interface MetodosProfesor {
	//METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	//NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Profesor profesor);

	public String eliminar(Profesor profesor);

	public String editarr(Profesor profesor);
	//PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN PROFESOS Y NOS DEVUELVE
	public Profesor buscar(Profesor profesor);
	//NOS ENLISTA NOS MUESTRA
	public List<Profesor> listar();

}
