package corretora.modelo;

import java.util.Calendar;

public interface Tributavel {
	
	public static double calculaImposto(Calendar dataInicio, Calendar dataFinal, Double valor) {
		return valor;
	}
}
