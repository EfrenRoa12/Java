
public class Hijo {
	private String hobbie;
	private String estudio;
	 private double estatura;
	
	public Hijo() {
		
	}

	public Hijo(String hobbie, String estudio, double estatura) {

		this.hobbie = hobbie;
		this.estudio = estudio;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Hijo [hobbie=" + hobbie + ", estudio=" + estudio + ", estatura=" + estatura + "]\n";
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
	
	
	
	
}
