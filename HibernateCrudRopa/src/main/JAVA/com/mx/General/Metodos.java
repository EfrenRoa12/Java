package com.mx.General;

import java.util.List;

import com.mx.Entidad.Ropa;

public interface Metodos {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
		// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
		public String guardar(Ropa ropa);

		public String eliminar(Ropa ropa);

		public String editar(Ropa ropa);

		// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
		// DEVUELVE
		public Ropa buscar(Ropa ropa);

		// NOS ENLISTA NOS MUESTRA
		public List<Ropa> listar();
}
