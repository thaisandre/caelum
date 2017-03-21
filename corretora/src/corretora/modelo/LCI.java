package corretora.modelo;

import org.joda.time.DateTime;

public class LCI extends Investimento {
	
	private DateTime dataFinal;
	
	public DateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(DateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String toString() {
		return super.toString() + " - Data Final: " + dataFinal;
	}
	
}
