


public class Main {
	
	public static void main(String[] args) {

			
	Controlador c = Controlador.getInstance();
	
	c.carregarDadosMeteorologicos("C:\\Documents and Settings\\jcrbsa\\Meus documentos\\dados.txt");
	c.armazenarDadosMeteorologicos();
	c.visualizarDadosMeteorologicos();
	c.exportarDadosMeteorologicos("C:\\Documents and Settings\\jcrbsa\\Meus documentos\\dadosExportados.txt");
	

		
	}

}
