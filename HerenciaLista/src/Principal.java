
public class Principal {

	public static void main(String[] args) {
		ImpSalon impA = new ImpSalon();
		Salon h1 = new Salon("a1","activo");
		Salon h2 = new Salon("a2","activo");
		Salon h3 = new Salon("a3","activo");
		Salon hc = null;//es un objeto salon
		
		ImpAlumno impH = new ImpAlumno();
		Alumno p1 = new Alumno("Jose","perez",22);
		Alumno p2 = new Alumno("mario","gomez",2);
		Alumno p3 = new Alumno("hector","cano",32);
		Alumno pc = null;
		
		ImpAlimentos impAl = new ImpAlimentos();
		Alimentos a1 = new Alimentos("barra de chocolate",277.2,22);
		Alimentos a2 = new Alimentos("refresco",255.8,12);
		Alimentos a3 = new Alimentos("galleta",244.9,32);
		Alimentos ac = null;
		
		//guardar los datos
		
		
		//mostrar los datos
		impA.mostrar();
		impH.mostrar();
		impAl.mostrar();
		//buscar--metodo comodin
		
		
		hc=(Salon)impA.buscar(h2.getClave());//busca por salon por clave
		System.out.println("nombre del salon encontrado: "+h2);
		
		pc=(Alumno)impH.buscar(p1.getNombre());//busca alumno pornombre
		System.out.println("nombre del alumno encontrado: "+p1);
		
		ac=(Alimentos)impAl.buscar(a1.getNombre());//busca alimento por nombre
		System.out.println("nombre del alimento encontrado: "+a1);
		//editar
		//editaremos h3
		h3.setClave("clave nueva");
		impA.editar(h3.getClave(), h3);//lo llamamos desde  salon para editarlo
		System.out.println("------------------ ");
		impA.mostrar();
/*		
		hc=setClave("1wa","baja");
		impA.editar(hc.getClave(),hc);
		impA.mostrar();
		
		pc=setNombre("jose","hernandez",25);
		impH.editar(pc.getNombre(),pc);
		impH.mostrar();
		
		ac=setNombre("manzana",5,8);
		impH.editar(ac.getNombre(),ac);
		impH.mostrar();
		
		//eliminar
		impA.eliminar(h3.getClave());
		impA.mostrar();
		
		
		impH.eliminar(p3.getNombre());
		impH.mostrar();
		
		impAl.eliminar(a3.getNombre());
		impAl.mostrar();
		
		//editar
		ac=setNombre("hector");
		impA.editar(ac.getNombre(),ac);
		impA.mostrar();
		//eliminar
		impA.eliminar(a3.getNombre());
		impA.mostrar();
*/
	}

}
