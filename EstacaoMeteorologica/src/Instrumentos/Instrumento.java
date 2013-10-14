package Instrumentos;


public abstract class Instrumento implements InstrumentoInterface {



	//private boolean estado;
	//private String name;
	//private int id;
    public static final double PI = 3.14;
    
    //Quais parametros???

    
	private boolean status = false;
	
	
	public Instrumento(){
		
		
	}

	public boolean getStatus() {
				return status;
				   			  }



				boolean check()
				   {
					   //alterar esse estado para uma ação gerada pelo usuário
					   if(status = true)
					   {
						   return false;		   
					   }
					   else
					   {
						   return true;
					   }
					   
				   }
				
				
				
				    boolean turnOn()
				    {
				    	if(check() == false)
				    	{
				    		status = true;
				    	}
				    	else
				    	{
				    		status = false;
				    	}
				    	return status;
				    }
	
	
	

}
