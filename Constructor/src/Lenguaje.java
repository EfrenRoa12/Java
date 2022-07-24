
public class Lenguaje {
	String lenguaje;
	String tipado;
	int anios;
	// metodo constructor
	public Lenguaje() {
		
	}
	//constructor con parametros
	public Lenguaje(String lenguaje, String tipado, int anios) {
		this.lenguaje = lenguaje;
		this.tipado = tipado;
		this.anios = anios;
	}
	//constructor source generate tostring
	@Override
	public String toString() {
		return "Lenguaje [lenguaje=" + lenguaje + ", tipado=" + tipado + ", anios=" + anios + "\n]";
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public String getTipado() {
		return tipado;
	}
	public void setTipado(String tipado) {
		this.tipado = tipado;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	
}
