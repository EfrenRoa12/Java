package Entidad;

public class Marca {
	// ATRIBUTOS
		// PADRE-PROFESOR-MARCA
		String nombre_marca;// ES  LA CLAVE-LLAVE
		String pais_marca;
		String slogan_marca;

		// METODO CONSTRUCTOR VACIO
		public Marca() {

		}

		// CONSTRUCTOR CON nombre_celular QUE ES LA CLAVE-LLAVE

		public Marca(String nombre_marca) {
			this.nombre_marca = nombre_marca;
		}

		// CONSTRUCTOR CON PARAMETROS PARA INCIIALIZAR ATRIBUTOS DE LA CLASE
		public Marca(String nombre_marca, String pais_marca, String slogan_marca) {
			super();
			this.nombre_marca = nombre_marca;
			this.pais_marca = pais_marca;
			this.slogan_marca = slogan_marca;
		}

		// CONSTRUCTOR CON ToString
		@Override
		public String toString() {
			return "Marca [nombre_marca=" + nombre_marca + ", pais_marca=" + pais_marca + ", slogan_marca=" + slogan_marca
					+ "]\n";
		}
		//CREAMOS EL ENCAPSULAMIENTO
		public String getNombre_marca() {
			return nombre_marca;
		}

		public void setNombre_marca(String nombre_marca) {
			this.nombre_marca = nombre_marca;
		}

		public String getPais_marca() {
			return pais_marca;
		}

		public void setPais_marca(String pais_marca) {
			this.pais_marca = pais_marca;
		}

		public String getSlogan_marca() {
			return slogan_marca;
		}

		public void setSlogan_marca(String slogan_marca) {
			this.slogan_marca = slogan_marca;
		}


}
