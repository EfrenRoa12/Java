package _11herenciaMetodoFinal;

public class FiguraCerrada extends figura{
	//creamos atributo
	private int nLados;
	//dentro de figura cerrada comolacom el atributo de figuracerrada con this
	public FiguraCerrada(double tamanio,int nLados) {
		super(tamanio);
		this.nLados = nLados;
	}
	//creamos el metodo
	//EL METODO FINAL ES QUE NO PUEDE EXISTIR OTRO METODO CON EL MISMO NOMBRE dibujar1----o le quitamos fina o cambiamos nombre o lo dejamos aso
	//para que nadie lo use
	public final void dibujar1() {
	System.out.println("dibujo de una figura cerrada ");
	
	
	}
	
	
	
	
	
}
