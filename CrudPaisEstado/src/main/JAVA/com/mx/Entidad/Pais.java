package com.mx.Entidad;

public class Pais {
/*
	CREATE TABLE PAIS_IL2(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    EXTENSION NUMBER,
    CULTURA NVARCHAR2(100)
    
);
 */
	//ATRIBUTOS MISMOS QUEEN BBDD
	int id;
	String nombre;
	int extension;
	String cultura;
	//METODO CONSTRUCTOR CON PARAMETROS
	public Pais() {
		
	}
	//CONSTRUCTOR CON PARAMETROS ID PORQUE ASI LO BUSCAMOS
	public Pais(int id) {
		this.id = id;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Pais(int id, String nombre, int extension, String cultura) {
		this.id = id;
		this.nombre = nombre;
		this.extension = extension;
		this.cultura = cultura;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", extension=" + extension + ", cultura=" + cultura + "]\n";
	}
	//METODO GETT Y SETT
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
	public int getExtension() {
		return extension;
	}
	public void setExtension(int extension) {
		this.extension = extension;
	}
	public String getCultura() {
		return cultura;
	}
	public void setCultura(String cultura) {
		this.cultura = cultura;
	}
	
	

}
