package corretora.modelo;

import java.util.Calendar;

public class CDB extends Investimento implements Tributavel {

	public CDB(Calendar dataInicio, Calendar dataFinal, Double valorInicial) {
		super(dataInicio, dataFinal, valorInicial);
	}

	public double calculaImposto(Calendar dataInicio, Calendar dataFinal, Double valor){
			
			
			int meses = (dataFinal.get(Calendar.YEAR) * 12 + dataFinal.get(Calendar.MONTH))
		        - (dataInicio.get(Calendar.YEAR) * 12 + dataInicio.get(Calendar.MONTH));
		
		
			//print de teste
			System.out.println("meses: " + meses);
			
			//teste calculo data
			if(meses <= 12) {
				//paga 25
				System.out.println("paga 25");
				
			}
			else if(meses > 12 && meses < 24) {
				System.out.println("paga 20");
				
			}
			else {
				//paga 15
				System.out.println("paga 15");
			}
			
			return valor ;
		}
}
