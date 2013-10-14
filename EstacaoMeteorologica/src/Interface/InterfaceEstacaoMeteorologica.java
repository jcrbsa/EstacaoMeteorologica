package Interface;


public interface InterfaceEstacaoMeteorologica {
	
	public void carregar(String caminho);
	public void armazenar();
	public void exportar(String filename);
	//*public void alterarCampo();
	//*public void removerLinha();
	public void visualizar();

}
