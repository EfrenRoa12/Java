package com.mx.Entidad;

public class Marca {
/*
 CREATE TABLE MARCA_IL2(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    MODELO NVARCHAR2(100),
    COLOR NVARCHAR2(100)
        
);*/
	//CREAMOS LOS ATRIBUTOS
	int id;
	String nombre;
	String modelo;
	String color;
	//METOD CONSTRUCTOR SIN PARAMETROS
	public Marca() {
		
	}
	//constructor por medio la cual se va a cominicar
	public Marca(int id) {
		this.id = id;
	}
	//constructor con parametros
	public Marca(int id, String nombre, String modelo, String color) {
		this.id = id;
		this.nombre = nombre;
		this.modelo = modelo;
		this.color = color;
	}
	//to string
	@Override
	public String toString() {
		return "Marca [id=" + id + ", nombre=" + nombre + ", modelo=" + modelo + ", color=" + color + "]\n";
	}
	//metodo gett y sett
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
}
