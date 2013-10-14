package Instrumentos;

import bean.UmidadeAr;

public  class Higrometro extends Instrumento {
	
	private double vaporAr;
	private double vaporSaturado;
	private double temperatura;
	private static final double psicometroSemVentilacao = 8.0;
	private static final double pressaoAtmosferica = 0.94;
	private static final double tempBulboSeco = 28.2;
	private static final double tempBulboUmido = 21.6;
	private static final double gasesPerfeito = 8.314; 
	private static final double kelvin =  273.15;
	private static final double molAgua = 18;
	private UmidadeAr novo; 
	
	
public Higrometro(){
	super();
	
}
	
public Higrometro(double temperatura){
	super();

	this.temperatura = temperatura;
	this.vaporSaturado = calcularTesten(this.temperatura);
	this.novo = new UmidadeAr();
	this.vaporAr = calcularTesten(this.temperatura) - (psicometroSemVentilacao * pressaoAtmosferica*(tempBulboSeco-tempBulboUmido))*10;
	
}


private double calcularTesten(double temperatura){
	
	return 610.8 * Math.pow(10, (7.5*temperatura)/(237.3+temperatura));
	
}
	
	

	
public double medirUmidadeRelativaAr(){
		
	
	return Math.round((this.vaporAr / this.vaporSaturado) *100);
		
	}
	
public double medirUmidadeAbsolutaAr( ){
	    
	return Math.round(this.vaporAr/(gasesPerfeito * (this.temperatura + kelvin)) * molAgua);
		
		
	}

public void classificar(double valor ) {
	

}

public double medir(){

	return medirUmidadeRelativaAr();
}


public UmidadeAr medirUmidadeAr( ){

	this.novo.setUmidadeAbsoluta(this.medirUmidadeAbsolutaAr());
	this.novo.setUmidadeRelativa(this.medirUmidadeRelativaAr());
	return this.novo;
}





}
