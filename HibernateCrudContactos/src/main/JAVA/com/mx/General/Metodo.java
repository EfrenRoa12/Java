package com.mx.General;

import java.util.List;

import com.mx.Entidad.Contactos;

public interface Metodo {
	// METODOS GENERICOS PARA LA CLASE PROFESOR CRUD
	// NOS VA A ESTAR DEVOLVIENDO DE TIPO CADENA
	public String guardar(Contactos contacto);

	public String eliminar(Contactos contacto);

	public String editar(Contactos contacto);

	// PROFESOR YA QUE NO DEVUELVE EL OBJETO ESTAMOS BUSCANDO UN ALUMNO Y NOS
	// DEVUELVE
	public Contactos buscar(Contactos contacto);

	// NOS ENLISTA - NOS MUESTRA
	public List<Contactos> listar();
}
