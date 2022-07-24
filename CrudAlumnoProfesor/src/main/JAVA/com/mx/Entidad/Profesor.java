package com.mx.Entidad;

public class Profesor {
	// COPIAMOS LA TABLA DE BBDD A ECLIPSE PARA GUIARNOS COMO MVC
	/*
	 CREATE TABLE PROFESOR_IL2( 
	 ID NUMBER PRIMARY KEY, 
	 NOMBRE NVARCHAR2(100),
	  APELLIDO NVARCHAR2(100), 
	  ESPECIALIDAD NVARCHAR2(100)
	  );
	 */
	// ATRIBUTO-GUIANDONOS CON LA TABLA DE BBDD
	int id;
	String nombre;
	String apellido;
	String especialidad;

	// CONSTRUCTOR SIN PARAMETRO
	public Profesor() {

	}
	// CONSTRUCTOR CON PARAMETROS PORQUE LO VAMOS A BUSCAR POR ID PARA QUE PUEDA
	// HACER LA CONSULTA
	public Profesor(int id) {
		this.id = id;
	}
	// CONSTRUCTOR CON PARAMETROS
	public Profesor(int id, String nombre, String apellido, String especialidad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	// TO STRING
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ "]\n";
	}
	// METODOS GETT Y SETT
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
