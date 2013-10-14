package plataform;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cadastro.FachadaDados;
import enumeracao.EnumInstrumento;

import bean.DadosMeteorologicos;
import Instrumentos.Anemometro;
import Instrumentos.Barometro;
import Instrumentos.Higrometro;
import Instrumentos.Instrumento;
import Instrumentos.Pluviometro;
import Interface.InterfaceEstacaoMeteorologica;

public class EstacaoMeteorologica implements InterfaceEstacaoMeteorologica {

	/*
	 * varivaveis: Umidade Relativa Temperatura do Ar Precipitação
	 */

	private static int id = 0;

	public static int dias = 0;
	private Instrumento instrumento;
//	private Collection<Instrumento> instrumentos;
	//private Collection<DadosMeteorologicos> dados;
	private FachadaDados test;
	private DadosMeteorologicos dado;
	private List<String[]> rows ;

	public EstacaoMeteorologica() {

		EstacaoMeteorologica.id = EstacaoMeteorologica.id + 1;
		//this.instrumentos = new ArrayList<Instrumento>();
		//this.dados = new ArrayList<DadosMeteorologicos>();
		this.test = FachadaDados.getInstance();
		this.rows =new ArrayList<String[]>();
	}
	
	public Instrumento identificarInstrumento(EnumInstrumento tipoInstrumento, double valor){
		
		
		Instrumento instrumento = null;
		if(tipoInstrumento == EnumInstrumento.ANENOMETRO) 
			instrumento = new Anemometro(valor);
		else if(tipoInstrumento == EnumInstrumento.BAROMETRO)
			instrumento = new Barometro(valor);
	   else if (  tipoInstrumento ==  EnumInstrumento.HIGROMETRO)
		   instrumento = new Higrometro(valor);
	   else if (tipoInstrumento == EnumInstrumento.PLUVIOMETRO)
		   instrumento = new Pluviometro(valor);
		   
	
		return instrumento;
		
		
		
		
	}


public  void carregar(String filename){
	try {
			FileReader fr = new FileReader(filename);
			BufferedReader in = new BufferedReader(fr);
			String line;


			while ((line = in.readLine()) != null) {
				String[] temp = line.split(":");

				this.rows.add(temp);
				dias = dias + 1;
			}

			in.close();
			fr.close();
			
			for (int i = 0 ;i< rows.size() ;i++){
				for (int j = 0 ;j< rows.get(i).length ;j++){
					System.out.println(rows.get(i)[j]);
			}
		}
		


		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo " + filename);
		}
	

	}



	public void armazenar() {
		
		System.out.println("hello");
		
		for (int i = 0 ;i< rows.size() ;i++){
			this.dado = new DadosMeteorologicos();
			for (int j = 0 ;j< rows.get(i).length ;j++){
				System.out.println("Valor=" + Double.parseDouble(rows.get(i)[j]));
				this.instrumento = identificarInstrumento(EnumInstrumento.values()[j], Double.parseDouble(rows.get(i)[j]));
				dado.setCodigo(i);
				switch(j){
				case 0:
					dado.setVelocidadedoVento(instrumento.medir());
				break;
				case 1:
					dado.setPressoes(instrumento.medir());
				break;
				case 2:
				dado.setUmidadeArVarivel(instrumento.medir());
				break;
				case 3:
				dado.setPrecipitacao(instrumento.medir());
				break;
				default:
					break;
	
					
				}
			} this.test.inserir(dado);
	}


	}

	public void visualizar() {

		Collection<DadosMeteorologicos> repositorio = new ArrayList<DadosMeteorologicos>();
		repositorio = this.test.listarTodos();
		System.out.println("Codigo| Velocidade | Pressao | Umidade | Precipitacao");
		for (DadosMeteorologicos dados : repositorio) {
		System.out.printf("     %d|        %.2f|    %.2f|    %.2f|      %.2f\n", dados.getCodigo(),dados.getVelocidadedoVento(), dados.getPressoes(),dados.getUmidadeArVarivel(),dados.getPrecipitacao());
		}

	}
	
	
	public void exportar(String filename) {
		
		try {
			File f = new File(filename);
			FileWriter fr = new FileWriter(f);
			PrintWriter out = new PrintWriter(fr);
			
			Collection<DadosMeteorologicos> repositorio = new ArrayList<DadosMeteorologicos>();
			repositorio = this.test.listarTodos();

			out.println("Codigo| Velocidade | Pressao | Umidade | Precipitacao");
			for (DadosMeteorologicos dados : repositorio) {
			out.printf("     %d|        %.2f|    %.2f|    %.2f|      %.2f\n", dados.getCodigo(),dados.getVelocidadedoVento(), dados.getPressoes(),dados.getUmidadeArVarivel(),dados.getPrecipitacao());
			}

			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo.");
		}

	}
	

/*	
	public void removerLinha() {

	}

	public void alterarCampo(int linha, int campo) {

	}
*/

	


	//Configurar propriedades físicas dos instrumentos
		public void calibrar(Instrumento instrumento, int id) {

		}
	
	
	//checar se cada instrumento calibrado
	public void testar() {

	}
	
	//checar se cada instrumento calibrado
	public void iniciar(Instrumento instrumentos) {

	}

	public void desativar() {
		//this.instrumentos = null;
		//this.dados = null;
		this.test = null;

	}
}
