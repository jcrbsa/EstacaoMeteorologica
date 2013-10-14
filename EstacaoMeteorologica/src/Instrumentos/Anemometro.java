package Instrumentos;


/* Anomometor (rotacioanal,deflexao, ultra-sonicos)
 * http://goo.gl/kRJscf
 *
 */

//Mede a velocidade do vento (em m/s) e, em alguns tipos, também a direção (em graus).
public class Anemometro extends Instrumento {
	
	private double numVoltas;
	private double compHaste = 20;
	//private boolean status = false;

	
 public Anemometro() {
	 	super();

	
	}
	
	
public Anemometro(double numVoltas) {
	this.numVoltas = numVoltas;

}
    

public void classificarVelocidadeVento(double vento){
	
	
	if (vento < 1)
		System.out.println("Calmo");
	else if(vento > 1 && vento <5)
		System.out.println("Calmo Forte");
	else if (vento > 6  && vento < 11)
		System.out.println("Brisa Muito Fraca");
	else if (vento > 12 && vento < 19)
		System.out.println("Brisa  Fraca");
	else if (vento > 20 && vento < 28)
		System.out.println("Brisa Muito Moderada");
	else if (vento > 29  && vento < 38)
		System.out.println("Brisa Fresca");
	else if (vento > 39  && vento < 48)
		System.out.println("Brisa Forte");
		else if (vento  > 50  && vento <  61)
			System.out.println("Vento Forte");
		else if (vento > 62  && vento < 74)
			System.out.println("Temporal");
		else if (vento >75 && vento < 88)
		System.out.println("Temporal Forte");
	else if (vento > 89 && vento < 102)
		System.out.println("Temporal Duro Forte");
	else if (vento  > 103 && vento < 117)
		System.out.println("Brisa Muito Duro Forte");
	else if (vento > 118 && vento < 133)
		System.out.println("Furacao");
	else
		System.out.println("Perigo!!!Fora do limite mediação");
	
	
}

public void classificar(double valor) {
	
	this.classificarVelocidadeVento(valor);
}



public double medir() {
	
	double perimetro =2*PI* (this.compHaste/2);
	
	double rpm = this.numVoltas * perimetro;

	
	return (rpm/100000)/0.01667;
	
}


    
    

}
