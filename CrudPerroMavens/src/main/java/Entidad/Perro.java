package Entidad;

public class Perro {
/*CREATE TABLE PERRO_4( 
 
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100), 
RAZA NVARCHAR2(100), 
EDAD NVARCHAR2(100)
	  
);*/
	// ATRIBUTOS
	int id;
	String nombre;
	String raza;
	int edad;
	//METODO CONSTRUCTOR SIN PARAMETORS
	public Perro() {

	}
	//METODO CONATRUCTOR CON PARAMETOROS
	public Perro(int id) {// PORQUE VAMOS A ESTAR BUSCANDO POR ID
		this.id = id;
	}

	//CONSTRUCTOR CON PARAMETOROS
	public Perro(int id, String nombre, String raza, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	// to string
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]\n";
	}
	//GETTER Y SETTER
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
