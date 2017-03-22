package corretora.modelo;

import org.joda.time.DateTime;

public class LCI extends Investimento implements Tributavel {
	
	private DateTime dataFinal;
	
	public LCI(double valorInicial, DateTime dataInicial, DateTime dataFinal){
		super(valorInicial, dataInicial);
		this.dataFinal = dataFinal;
	}
	
	public DateTime getDataFinal() {
		return dataFinal;
	}

	@Override
	public double getImposto() {
		return 0;
	}
	
	public String toString() {
		return super.toString() + " - Data Final: " + dataFinal;
	}
	
}
