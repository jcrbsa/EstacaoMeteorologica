package repositorio;

import java.util.ArrayList;
import java.util.Collection;

import bean.DadosMeteorologicos;
import Interface.RepositorioDados;

public class RepositorioDadosCollection implements RepositorioDados {

	
	private Collection<DadosMeteorologicos> repositorio = new ArrayList<DadosMeteorologicos>();
	private static int id = 0;
	@Override
	public void inserir(DadosMeteorologicos dados) {
		dados.setCodigo(id++);
		repositorio.add(dados);

	}

	@Override
	public void remover(DadosMeteorologicos dados) {
		repositorio.remove(dados);

	}

	@Override
	public void alterar(DadosMeteorologicos dados) {
		DadosMeteorologicos f = this.procurarPorCodigo(dados.getCodigo());
		repositorio.remove(f);
		repositorio.add(dados);

	}

	@Override
	public DadosMeteorologicos procurarPorCodigo(long codigo) {
		for(DadosMeteorologicos dados : repositorio) {
			if(dados.getCodigo() == codigo) {
				return dados;
			}
		}
		return null;

	}

	@Override
	public Collection<DadosMeteorologicos> listarTodos() {

		return repositorio;
	}

	@Override
	public Collection<DadosMeteorologicos> ordenarPor(int campo) {

		return null;
	}

}
