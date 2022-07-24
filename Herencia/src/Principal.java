
public class Principal {

	public static void main(String[] args) {
		// 
		
		Alimentos a1 = new Alimentos("chilaquiles",100,45);
		Alimentos a2 = new Alimentos("hotkake",250,25);
		Alimentos a3 = new Alimentos("flauta",80,40);
		Alimentos ac = null;
		
		ImAlimentos impA = new ImAlimentos();
		
		//guardar
		impA.guardar(a1.getNombre(),a1);
		impA.guardar(a2.getNombre(),a2);
		impA.guardar(a3.getNombre(),a3);
		
		//mostrar
		//impA.mostrar();
		
		//buscar--metodo comodin
		ac=(Alimentos)impA.buscar(a2.getNombre());//busca por clave nombre
		//System.out.println("alimento encontrado: "+ac);
		//editar
		
		ac=(Alimentos)impA.editar("flauta",(new Alimentos("hola",1,1)));
		try {
			impA.editar(ac.getNombre(),ac);
			impA.mostrar();
			//eliminar
			impA.eliminar(a3.getNombre());
			impA.mostrar();
			
		}catch(Exception e) {
			
			System.out.println("Error al editar el registro:\n"+e.getMessage());
		}
		
	}

}
