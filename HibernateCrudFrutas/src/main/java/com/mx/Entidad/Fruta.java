package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FRUTA_IL3") //ES EL NOMBRE DE LA TABLA DE BBDD
public class Fruta {
	//COPIAMOS LA TABLA DE BBDD
	/*
	CREATE TABLE FRUTA_IL3(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    PRECIO NUMBER,
    COLOR NVARCHAR2(100)
);*/
	//CREAMOS LOS ATRIBUTOS
	//INDICAMOS QUEES LA LLAVE PRIMARIA-----DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;//CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	
	@Column(name="PRECIO", columnDefinition="NUMBER")
	int precio;
	
	@Column(name="COLOR", columnDefinition="NVARCHAR2(100)")
	String color;
	
	//CONSTRUCTOR SI PARAMETROS
	public Fruta() {
		
	}
	//CONSTRUCTOR CON EL PARAMETRO ID POR ESE ID LO BUSCAREMOS
	public Fruta(int id) {
		this.id = id;
		}
	//CONSTRUCTORES CON PARAMETROS
	public Fruta(int id, String nombre, int precio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color + "]\n";
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
}
