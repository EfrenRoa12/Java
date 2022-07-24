
public class Principal {

	public static void main(String[] args) {
		// objeto implementacion
		Implementacion imp = new Implementacion();
		// creamos objeto
		Estado e1 = new Estado("Puebla", "centro", 10);
		Estado e2 = new Estado("Tlaxcala", "centro", 8);
		Estado e3 = new Estado("Guanajuato", "norte", 20);
		Estado ec = null;
		// guardad
		imp.guardar(e1);
		imp.guardar(e2);
		imp.guardar(e3);
		// mostrar
		imp.mostrar();
		// buscar
		ec = imp.buscar(0);
		System.out.println("el estado encontrado es: " + ec);
		// antes de editar hay que buscar
		ec = imp.buscar(0);
		ec.setExtension(22);
		imp.editar(0, ec);
		imp.mostrar();
		// eliminar
		ec = imp.buscar(2);// el indice 2
		imp.eliminar(2);
		System.out.println("se elimino el estado: " + ec.getNombre());
		imp.mostrar();

	}

}
