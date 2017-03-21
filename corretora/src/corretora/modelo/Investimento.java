package corretora.modelo;

import java.util.Calendar;

public class Investimento {
	
	protected Calendar dataInicio;
	protected Calendar dataFinal;
	protected Double valorInicial;

	public Investimento(Calendar dataInicio, Calendar dataFinal, Double valorInicial) {
		super();
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.valorInicial = valorInicial;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}
	
	public Calendar getDataFinal() {
		return dataFinal;
	}
	
	public Double getValorInicial() {
		return valorInicial;
	}
	
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	
}
