
public class Principal {

	public static void main(String[] args) {
		// 
		Implementacion implement = new Implementacion();

		Auto a1 = new Auto("gtr", "shelby", 8666000);
		Auto a2 = new Auto("ced", "nissan", 451365);
		Auto a3 = new Auto("f-x23", "ford", 795569);
		Auto ab = null;

		implement.guardar(a1);
		implement.guardar(a2);
		implement.guardar(a3);

		implement.mostrar();

		// buscar
		ab = implement.buscar(0);
		System.out.println("el auto encontrado es: " + ab);
		// antes de editar hay que buscar
		ab = implement.buscar(0);
		ab.setModelo("x-gt");
		ab = implement.buscar(0);
		ab.setMarca("jeep");
		ab.setPrecio(25555);
		implement.editar(0, ab);
		implement.mostrar();

		// buscar
		ab = implement.buscar(2);
		//eliminar
		implement.eliminar(2);
		System.out.println("se elimino el auto: " + ab.getMarca());
		implement.mostrar();

	}//cierra main

}//cierra clase
