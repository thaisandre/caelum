package corretora.modelo;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class FundoDeInvestimento extends Investimento implements Tributavel {
	
	public double getTaxa() {
		return valorInicial*0.01;
	}

	@Override
	public double getImposto() {
		DateTime hoje = new DateTime();
		hoje.toInstant();
		int dias = Days.daysBetween(dataInicial, hoje).getDays();

		// print de teste
		//System.out.println("dias: " + dias);

		if (dataInicial.year().isLeap() && !hoje.year().isLeap()
				&& (!dataInicial.year().isLeap() && !hoje.year().isLeap())) {

			// teste calculo data
			if (dias <= 365) {
				//System.out.println("paga 25%");
				return valorInicial*0.25;
			} else if (dias > 365 && dias <= 730) {
				//System.out.println("paga 20%");
				return valorInicial*0.20;

			} else {
				//System.out.println("paga 15%");
				return valorInicial*0.15;
			}

		} else {
			if (dias <= 366) {
				//System.out.println("paga 25%");
				return valorInicial*0.25;

			} else if (dias > 366 && dias <= 730) {
				//System.out.println("paga 20%");
				return valorInicial*0.2;

			} else {
				//System.out.println("paga 15%");
				return valorInicial*0.15;
			}
		}
	}
}
