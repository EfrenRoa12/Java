package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CELULAR_A")
public class Celular {
	/*
	 CREATE TABLE CELULAR_A( 
	 ID NUMBER, 
	 MODELO NVARCHAR2(100), 
	 MARCA NVARCHAR2(100),
	 NVARCHAR2(100), 
	 PRECIO FLOAT(5), 
	 SO NVARCHAR2(100), 
	 RAM NUMBER );
	 */

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER")
	int id;// CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS

	// DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "MODELO", columnDefinition = "NVARCHAR2(100)")
	String modelo;

	@Column(name = "MARCA", columnDefinition = "NVARCHAR2(100)")
	String marca;

	@Column(name = "PRECIO", columnDefinition = "FLOAT(5)")
	float precio;

	@Column(name = "SO", columnDefinition = "NVARCHAR2(100)")
	String so;

	@Column(name = "RAM", columnDefinition = "NUMBER")
	int ram;

	public Celular() {

	}

	public Celular(int id) {
		this.id = id;
	}

	public Celular(int id, String modelo, String marca, float precio, String so, int ram) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.so = so;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", so=" + so
				+ ", ram=" + ram + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
