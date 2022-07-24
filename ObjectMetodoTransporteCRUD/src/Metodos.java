
public interface Metodos {
	//la vamos a poder utilizar en cualquier otra clase PARA ESO ES LA INTERFACE METODOS GENERICOS
	
	
	// ES UNA CLASE DONDESEA REALIZAN LOS METODOS QUE PUEDE SER IMPLEMENTADA PARA
		// CUALQUIER CLASE
		// Object super clase
	//PORQUE VOID GUARDAR NO ME VA A REGRESAR NADA SOLO SE EJECUTA Y LISTO
	//CUANDO LLAMO GUARDAR HACE LA INSTRUCCION Y esta en metodo guardar LISTO 
		public void guardar(Object obj);

		public void editar(Object obj);

		public void eliminar(Object obj);
//NOS REGRESA ALGO PORQUE BUSCO VALOR U OBJETO PORUE NECESITO QUE ME RETORNE ALGO --->
		//INT CADENA CHAR ETC EN Objec		public Object buscar(Object obj);
//object carateristica cualquier tipo de dato 
		//SERA OCUPADA PARA CUALQUIER CLASE 
		public Object buscar(Object obj);
		
		public void mostrar(Object obj);
}
