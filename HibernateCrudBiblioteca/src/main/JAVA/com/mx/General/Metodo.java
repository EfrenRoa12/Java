package com.mx.General;

import java.util.List;

import com.mx.Entidad.Biblioteca;


public interface Metodo {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
		// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
		public String guardar(Biblioteca biblioteca);

		public String eliminar(Biblioteca biblioteca);

		public String editar(Biblioteca biblioteca);

		// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
		// DEVUELVE
		public Biblioteca buscar(Biblioteca bibliotecaa);

		// NOS ENLISTA NOS MUESTRA
		public List<Biblioteca> listar();
}
