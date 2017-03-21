package corretora.modelo;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class CDB extends FundoDeInvestimento implements Tributavel {

	private DateTime dataFinal;

	public DateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(DateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public double getImposto() {

		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();

		// print de teste
		//System.out.println("dias: " + dias);

		if ((dataInicial.year().isLeap() && !dataFinal.year().isLeap())
				&& (!dataInicial.year().isLeap() && !dataFinal.year().isLeap())) {

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
	
	public String toString() {
		return super.toString() + " - Data Final: " + dataFinal.toString("dd/MM/yyyy");
	}
}
