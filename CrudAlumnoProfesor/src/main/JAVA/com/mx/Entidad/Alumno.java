package com.mx.Entidad;

public class Alumno {
	// COPIAMOS LA TABLA DE BBDD A ECLIPSE PARA GUIARNOS COMO MVC
	/**
	 CREATE TABLE ALUMNO_IL5( ID NUMBER PRIMARY KEY, 
	 NOMBRE NVARCHAR2(100),
	 APELLIDO NVARCHAR2(100), 
	 EDAD NUMBER, 
	 ID_PROFESOR NUMBER,
	 CONSTRAINT FK_ID_PROFESOR2 FOREIGN KEY (ID_PROFESOR) REFERENCES PROFESOR_IL2(ID)
	  );
	 */
	// ATRIBUTOS

	int id;
	String nombre;
	String apellido;
	int edad;
	//VAMOS A PONERLO DE TIPO PROFESOR YA QQUE HAREMOS LA RELACION INCLUIMOS LA RELACION CON INNER JOIN DEPENDENCIA DE ALUMNO PROFESOR
	//OBJETO PROFESOS DE TIPO PROFESOR
	Profesor profesor;
	//CONSTRUCTOR SIN PARAMETROS
	public Alumno() {

	}
	//VAMOS A BUSCARLO POR PARAMETROS--BUSQUEDA POR ID UNICAMENTE LO REFERENCIAMOS AL PARAMETRO DE LA CLASE PRINCIPAL
	public Alumno(int id) {
		this.id = id;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Alumno(int id, String nombre, String apellido, int edad, Profesor profesor) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.profesor = profesor;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", profesor="
				+ profesor + "]\n";
	}
	//ENCAPSULAMIENTO GETT Y SETT
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
