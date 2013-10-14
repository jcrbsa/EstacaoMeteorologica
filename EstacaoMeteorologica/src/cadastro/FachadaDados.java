package cadastro;

import java.util.Collection;

import bean.DadosMeteorologicos;
import Interface.RepositorioDados;
import repositorio.RepositorioDadosCollection;


public class FachadaDados {
	
	private static FachadaDados fachada;
	private RepositorioDados repositorio;

    static {
        fachada = new FachadaDados();
    }
	private FachadaDados() {
		repositorio = new RepositorioDadosCollection();
	}
    public static FachadaDados getInstance() {
        return fachada;
    }
	public void inserir(DadosMeteorologicos dados) {
		repositorio.inserir(dados);
	}
	public void remover(DadosMeteorologicos dados) {
		repositorio.remover(dados);
	}
	public void alterar(DadosMeteorologicos dados) {
		repositorio.alterar(dados);
	}
	public DadosMeteorologicos procurarPorCodigo(long codigo) {
		return repositorio.procurarPorCodigo(codigo);
	}
	public Collection<DadosMeteorologicos> listarTodos(){
		return repositorio.listarTodos();
	}

}
