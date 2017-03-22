package corretora;

import java.text.ParseException;

import org.joda.time.DateTime;

import corretora.modelo.CDB;
import corretora.modelo.FundoDeInvestimento;
import corretora.modelo.LCI;

public class principal {

	public static void main(String[] args) throws ParseException {
		
		//-> obs.: alguns calculos podem não bater (falta tratar ano bissexto)
		
		//data para testes
		DateTime dataInicial = new DateTime(2016, 1, 1, 0, 0);
		DateTime dataFinal = new DateTime(2017, 1, 1, 0, 0);
		
		//teste CDB
		CDB cdb = new CDB(1000.0, dataInicial, dataFinal);
		System.out.println("Imposto CDB: " + cdb.getImposto());	

		//teste LCI
		LCI lci = new LCI(1000.0, dataInicial, dataFinal);
		System.out.println("Imposto LCI: " + lci.getImposto());	
		
		//teste FDI
		FundoDeInvestimento fdi = new FundoDeInvestimento(1000.0, dataFinal);
		System.out.println("Imposto Fundo: " + fdi.getImposto());		
	}
}
