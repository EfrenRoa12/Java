
public class Principal {

	public static void main(String[] args) {
		//
		Implementacion implement = new Implementacion();

		Influencer i1 = new Influencer("luis", "Luis","luisitocomunica", 29);
		Influencer i2 = new Influencer("adriana", "thalia","thalia", 40);
		Influencer i3 = new Influencer("karol", "piña","carolsevillaof", 30);
		Influencer ab = null;

		implement.guardar(i1);
		implement.guardar(i2);
		implement.guardar(i3);

		implement.mostrar();

		// buscar
		ab = implement.buscar(0);
		System.out.println("el influencer encontrado es: " + ab);
		// antes de editar hay que buscar
		ab = implement.buscar(0);
		ab.setNombre("patricia");
		ab = implement.buscar(0);
		ab.setApellidoP("caely");
		ab.setNombreA("caelyt");
		ab.setEdad(22);
		implement.editar(0, ab);
		implement.mostrar();

		// buscar
		ab = implement.buscar(2);
		//eliminar
		implement.eliminar(2);
		System.out.println("se elimino el influencer: " + ab.getNombre());
		implement.mostrar();

	}

}
