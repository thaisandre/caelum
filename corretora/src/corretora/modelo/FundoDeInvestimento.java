package corretora.modelo;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class FundoDeInvestimento extends Investimento implements Tributavel {
	
	public FundoDeInvestimento(double valorInicial, DateTime dataInicial) {
		super(valorInicial, dataInicial);
	}
	
	@Override
	public double getImposto() {
		DateTime hoje = new DateTime();
		hoje.toInstant();
		
		int dias = Days.daysBetween(dataInicial, hoje).getDays();
		Taxa taxa = new Taxa();
		
		return valorInicial*(taxa.Apos(dias) + taxa.taxaAdministracao());
	}
}
