package Instrumentos;

//medir a press�o atmosf�rica
public class Barometro extends Instrumento{
	
	
	private double alt;
	
	public Barometro(){
		super();
	
	}
	
	public Barometro(double alt){
		super();
		this.alt = alt;
	}
	

	
	public void classificar(double valor ) {
		

	}
	

	public double medir() {
		 double ploc,pnm = 10.33;
		    
		    ploc = pnm - (0.0012) * alt;
		    
		    return ploc;
	
	}




}
