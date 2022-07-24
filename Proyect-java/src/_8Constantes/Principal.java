package _8Constantes;

public class Principal {

	public static void main(String[] args) {
		Personal persona1 = new Personal("efren",27);
		//CAMBIAMOS LA EDAD POR MEDIO DE GETTER Y SETTER PERO EL NOMBRE NO SE PUEDE CAMBIAR 
		//YA QUE TIENE LA CONSTANTE FINAL POR LO TANTO NO SE PUEDE CAMBIAR A UNA CONSTANTE LA VARIABLE SI CUANDO NO TIENE FINAL---CONSTANTE
		persona1.setEdad(22);
		//IMPRIMIMOS LOS DATOS
		persona1.mostrarDatos();
		
		
		
	}

}
