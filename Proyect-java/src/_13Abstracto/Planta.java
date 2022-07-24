package _13Abstracto;

public class Planta extends SerVivo{
	//planta hereda de servvo
	//como planta no es abstracta vamos a sobreescribir
	
	@Override
	public void alimentarse() {
		System.out.println("la planta se alimenta a traves de la fotosintesis");
		
	}

}
