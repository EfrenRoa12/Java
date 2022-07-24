package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROPA")//ES EL NOMBRE DE LA TABLA EN BBDD
public class Ropa {
/*
 CREATE TABLE ROPA(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    TIPO NVARCHAR2(100),
    PRECIO NUMBER(20),
    COLOR NVARCHAR2(100)
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
		
		//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
		@Column(name = "TIPO", columnDefinition = "NVARCHAR2(100)")
		String tipo;
		
		@Column(name="PRECIO", columnDefinition="NUMBER(20)")
		int precio;
		
		@Column(name="COLOR", columnDefinition="NVARCHAR2(100)")
		String color;
	
	//METODO CONSTRUCTOR
		public Ropa() {
			
		}
		//METODO CONSTRUCTOR CON PARAMETROS
		public Ropa(int id) {
			this.id = id;
		}
		
		public Ropa(int id, String nombre, String tipo, int precio, String color) {
			this.id = id;
			this.nombre = nombre;
			this.tipo = tipo;
			this.precio = precio;
			this.color = color;
		}
		//TO STRING
		@Override
		public String toString() {
			return "Ropa [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", color="
					+ color + "]\n";
		}
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
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
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
		
		//METODO GETT Y SETT
		
	
	
}
