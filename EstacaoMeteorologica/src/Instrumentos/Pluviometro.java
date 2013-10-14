package Instrumentos;

/*
 * http://goo.gl/N3ZRBK
 */

//Mede a quantidade de precipitação pluvial (chuva), em milímetros (mm).

public class Pluviometro extends Instrumento {
	
	
	private double diametro = 0.08;
	private double raio = diametro/2;
	private double qtChuva;
	
public Pluviometro() {
	super();

	}


public Pluviometro( double qtChuva) {
	super();
	this.qtChuva = qtChuva;
}


public void classificar(double valor ) {
	
}


public double medir() {
	
	
double result;
	
	
	result = this.qtChuva /(PI * ((this.raio* this.raio)*1000));

	return result;

	
}



	
}
