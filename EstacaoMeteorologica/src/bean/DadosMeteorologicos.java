package bean;

public class DadosMeteorologicos {
	


	 private double velocidadedoVento;
	 private double pressoes;
	 private double precipitacao;
	 private UmidadeAr umidadeArClasse;
	 private double umidadeArVarivel;
	 private double temperatura;
	 private int codigo;


	public double getVelocidadedoVento() {
		return velocidadedoVento;
	}

	public void setVelocidadedoVento(double velocidadedoVento) {
		this.velocidadedoVento = velocidadedoVento;
	}

	public double getUmidadeArVarivel() {
		return umidadeArVarivel;
	}

	public void setUmidadeArVarivel(double umidadeArVarivel) {
		this.umidadeArVarivel = umidadeArVarivel;
	}

	public double getPressoes() {
		return pressoes;
	}

	public void setPressoes(double pressoes) {
		this.pressoes = pressoes;
	}

	public double getPrecipitacao() {
		return precipitacao;
	}

	public void setPrecipitacao(double precipitacao) {
		this.precipitacao = precipitacao;
	}

	public UmidadeAr getUmidadeArClasse() {
		return umidadeArClasse;
	}

	public void setUmidadeArClasse(UmidadeAr umidadeAr) {
		this.umidadeArClasse = umidadeAr;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	


	 

}
