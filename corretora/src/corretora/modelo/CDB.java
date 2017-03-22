package corretora.modelo;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class CDB extends Investimento implements Tributavel {

	private DateTime dataFinal;
	
	public CDB(double valorInicial, DateTime dataInicial, DateTime dataFinal){
		super(valorInicial, dataInicial);
		this.dataFinal = dataFinal;
	}

	public DateTime getDataFinal() {
		return dataFinal;
	}

	public double getImposto() {
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		Taxa taxa = new Taxa();
		return valorInicial*taxa.Apos(dias);
	}
	
	public String toString() {
		return super.toString() + " - Data Final: " + dataFinal.toString("dd/MM/yyyy");
	}
}
