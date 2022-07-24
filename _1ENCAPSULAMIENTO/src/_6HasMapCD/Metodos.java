package _6HasMapCD;

public interface Metodos {
	//INTERFAZ ES LA CLASE MAS ABSTRACTA CREA METODOS VACIOS
	//POR SEGURIDAD OCULTA CIERTOS DETALLES PARA MOSTRAR AL USUARIO SOLO DETALLLES IMPORTANTES
	//JAVA NO ADMITE HERENCIA MULTIPLE ES POR ESO QUE SE CREA IMPLEMENTACION SE CREA MUCHOS ES LA SOLUCION
	
	//LLAVEY VALOR
	public void guardar(Empleado empleado);
	
	public void editar(Empleado empleado);
	
	public void eliminar(Empleado empleado);
	
	public Empleado buscar(Empleado empleado);
	
	public void mostrar();

}
