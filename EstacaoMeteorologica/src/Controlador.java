
import Interface.InterfaceEstacaoMeteorologica;
import plataform.EstacaoMeteorologica;



public class Controlador {
	
	//private List<String[]> dadosCarregados = new ArrayList<String[]>();;
	private static Controlador controlador;
	private InterfaceEstacaoMeteorologica estacao;
	
	
	static {
		controlador = new Controlador();
	}
	
	private Controlador() {
		
		 estacao = new EstacaoMeteorologica();


	}
	public static Controlador getInstance(){
		return controlador;
	}

	
	
	public void carregarDadosMeteorologicos(String caminho) {
		estacao.carregar(caminho);
		

	
	}
	
	public void armazenarDadosMeteorologicos() {
		
		estacao.armazenar();
	}
	
	
	public void exportarDadosMeteorologicos(String filename) {
		estacao.exportar(filename);
		
	}
	
	public void visualizarDadosMeteorologicos() {
		estacao.visualizar();
	}

	public void desativarEstacaoMeteorologica() {
		estacao = null;
	}
}
