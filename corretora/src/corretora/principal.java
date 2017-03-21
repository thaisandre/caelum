package corretora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import corretora.modelo.CDB;

public class principal {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataInicial = Calendar.getInstance();
		Calendar dataFinal = Calendar.getInstance();
		
		dataInicial.setTime(sdf.parse("01/01/2016"));
		dataFinal.setTime(sdf.parse("02/01/2018"));
		
		
		// teste CDB
		CDB cdb1 = new CDB(dataInicial, dataFinal, 1000.0);
		double valor;
	
		valor = cdb1.calculaImposto(dataInicial, dataFinal, 1000.0);
		System.out.println(valor);
		
	}


}
