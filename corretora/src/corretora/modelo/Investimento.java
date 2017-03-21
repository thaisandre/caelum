package corretora.modelo;

import org.joda.time.DateTime;

public abstract class Investimento {
	
	protected DateTime dataInicial;
	protected double valorInicial;

	public DateTime getDataInicial() {
		return dataInicial;
	}
	
	public double getValorInicial() {
		return valorInicial;
	}
	
	public void setDataInicio(DateTime dataInicial) {
		this.dataInicial = dataInicial; 
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	@Override
	public String toString() {
		return "ValorInicial: " + valorInicial  
				+ " - DataInicial: " + dataInicial.toString("dd/MM/yyyy");
	}
	
	
	
}
