package com.mx.General;

import java.util.List;

import com.mx.Entidad.Alumno;

public interface MetodosAlumnos {
	//METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
		//NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Alumno alumno);

	public String eliminar(Alumno alumno);

	public String editar(Alumno alumno);
	//PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS DEVUELVE
	public Alumno buscar(Alumno alumno);
	//NOS ENLISTA NOS MUESTRA
	public List<Alumno> listar();

}
