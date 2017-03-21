package corretora.modelo;

import java.util.Calendar;

public class FundoDeInvestimento extends Investimento implements Tributavel {

	public FundoDeInvestimento(Calendar dataInicio, Calendar dataFinal, Double valorInicial) {
		super(dataInicio, dataFinal, valorInicial);
		}
	
	public Double cobraTaxa(Double valor) {
		//logica aqui
		return valor;
	}
	
	public double calculaImposto(Calendar dataInicio, Calendar dataFinal, Double valor){
		//logica aqui
		return valor;
	}
}
