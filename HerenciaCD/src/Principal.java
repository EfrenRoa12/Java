
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre p1 = new Padre("Jose","perez","cano",22);
		Padre pc = null;
		Implementacion impA = new Implementacion();
		
		Hijo h1 = new Hijo("Jose","perez",12);
		Hijo hc = null;
		
		//guardar los datos
		impA.guardar(p1.getNombre(),p1);
		
		Implementacion impH = new Implementacion();
		impH.guardar(h1.getHobbie(),h1);
		
		//buscar--metodo comodin
		System.out.println("Esta entrevistando");
		pc=(Padre)impA.buscar(p1.getNombre());//busca por clave nombre
		System.out.println("nombre del gerente: "+pc);
		System.out.println("Datos del entrevistado es: ");
		hc=(Hijo)impH.buscar(h1.getHobbie());//busca por clave nombre
		System.out.println("nombre del entrevistado: "+hc);
		
		
		
		
	}

}
