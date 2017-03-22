package corretora.modelo;

import org.joda.time.DateTime;

public abstract class Investimento {
	
	protected DateTime dataInicial;
	protected double valorInicial;
	
	public Investimento(double valorInicial, DateTime dataInicial) {
		this.valorInicial = valorInicial;
		this.dataInicial = dataInicial;
	}
	
	public DateTime getDataInicial() {
		return dataInicial;
	}
	
	public double getValorInicial() {
		return valorInicial;
	}
	
	@Override
	public String toString() {
		return "ValorInicial: " + valorInicial  
				+ " - DataInicial: " + dataInicial.toString("dd/MM/yyyy");
	}
}
