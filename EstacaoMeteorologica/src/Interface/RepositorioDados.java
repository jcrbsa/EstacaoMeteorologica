package Interface;

import java.util.Collection;

import bean.DadosMeteorologicos;

public interface RepositorioDados {

	public void inserir(DadosMeteorologicos dados);
	public void remover(DadosMeteorologicos dados);
	public void alterar(DadosMeteorologicos dados);
	public DadosMeteorologicos procurarPorCodigo(long codigo);
	public Collection<DadosMeteorologicos> listarTodos() ;
	public Collection<DadosMeteorologicos> ordenarPor(int campo);
}
