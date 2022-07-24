package Practica12Hash;

import java.util.HashMap;

public class Implemenacion implements Metodo {//instanciamos la implementacion
	//CREAMOS EL HASH PARA EL HOSPITAL
	HashMap<String, Hospital> hash = new HashMap<String, Hospital>();

	@Override
	public void guardar(Hospital hospitall) {
		hash.put(hospitall.getNombre_hospital(), hospitall);

	}

	@Override
	public void editar(int index, Hospital hospitall) {
		hash.put(hospitall.getNombre_hospital(), hospitall);

	}

	@Override
	public void eliminar(int index) {
		hash.remove(index);

	}

	@Override
	public Hospital buscar(int index) {
		//DECLARAMOS HOSPITAL hospitall
		Hospital hospitall = hash.get(index);
		return hospitall;
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

}
