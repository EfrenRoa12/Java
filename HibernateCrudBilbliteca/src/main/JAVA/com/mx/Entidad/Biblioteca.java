package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BILIOTECA_IL3") //ES EL NOMBRE DE LA TABLA DE BBDD
public class Biblioteca {
/*
CREATE TABLE BILIOTECA_IL3(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
TELEFONO NUMBER,
DIRECCION NVARCHAR2(100)
);
 */

	//CREAMOS LOS ATRIBUTOS
	//INDICAMOS QUEES LA LLAVE PRIMARIA-----DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;//CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	
	@Column(name="TELEFONO", columnDefinition="NUMBER")
	int precio;
	
	@Column(name="DIRECCION", columnDefinition="NVARCHAR2(100)")
	String color;
	
	
	//CONSTRUCTOR SI PARAMETROS
	public Biblioteca() {
			
	}
	//CONSTRUCTOR CON EL PARAMETRO ID POR ESE ID LO BUSCAREMOS
	public Biblioteca(int id) {
	this.id = id;
	}
	//CONSTRUCTORES CON PARAMETROS
	public Biblioteca(int id, String nombre, int precio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}
	//to string
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color + "]\n";
	}
	//METODO GETT Y SETT DE ENCAPSULAMIENTO
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
