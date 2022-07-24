package com.mx.Entidad;

public class Marca {
/*
	CREATE TABLE MARCA_CELULAR_IL5(
	
    ID NUMBER PRIMARY KEY,
    MODELO NVARCHAR2(100),
    MARCA NVARCHAR2(100),
    PRECIO NUMBER,
    COLOR NVARCHAR2(100),
    RAM NUMBER,
    STOCK NUMBER
    
);*/
	int id;
	String modelo;
	String marca;
	int precio;
	String color;
	int ram;
	int stock;
	//CONSTRUCTOR PARAMETROS
	public Marca() {
		
	}
	//CONSTRUCTOR CON IDENTIFICADOR
	public Marca(int id) {
		this.id = id;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Marca(int id, String modelo, String marca, int precio, String color, int ram, int stock) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.ram = ram;
		this.stock = stock;
	}
	//TO STRING 
	@Override
	public String toString() {
		return "Marca [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", color=" + color
				+ ", ram=" + ram + ", stock=" + stock + "]\n";
	}
	//METODO GETT Y SETT
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
