package com.mx.General;

import java.util.List;

import com.mx.Entidad.Marca;


public interface MetodosMarca {
	//METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
		//NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
		public String guardar(Marca marca);

		public String eliminar(Marca marca);

		public String editar(Marca marca);
		//PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN PROFESOS Y NOS DEVUELVE
		public Marca buscar(Marca marca);
		//NOS ENLISTA NOS MUESTRA
		public List<Marca> listar();
}
