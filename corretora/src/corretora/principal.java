package corretora;

import java.text.ParseException;

import org.joda.time.DateTime;

import corretora.modelo.CDB;
import corretora.modelo.FundoDeInvestimento;
import corretora.modelo.LCI;

public class principal {

	public static void main(String[] args) throws ParseException {
		
		double valorInicial = 1000.0;
		double valorFinal = 0;
		double imposto = 0;

		DateTime dataInicial = new DateTime(2016, 1, 1, 0, 0);
		DateTime dataFinal = new DateTime(2017, 1, 1, 0, 0);
		
		//teste CDB
		CDB cdb = new CDB();
		cdb.setValorInicial(valorInicial);
		cdb.setDataInicio(dataInicial);
		cdb.setDataFinal(dataFinal);
		
		System.out.println("-> CDB");
		System.out.println(cdb.toString());
		
		imposto = cdb.getImposto();
		System.out.println("Imposto: " + imposto);
		valorFinal = valorInicial - imposto;
		System.out.println("Valor final: " + valorFinal);
		
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		LCI lci = new LCI();
		lci.setValorInicial(valorInicial);
		lci.setDataInicio(dataInicial);
		lci.setDataFinal(dataFinal);
		
		System.out.println("-> LCI");
		System.out.println(cdb.toString());
		
		System.out.println("LCI não possui imposto.");
		System.out.println("Valor final: " + valorInicial);		
	
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//teste FDI
		valorFinal = 1000.0;
		FundoDeInvestimento fdi = new FundoDeInvestimento();
		fdi.setValorInicial(valorInicial);
		fdi.setDataInicio(dataInicial);
		
		System.out.println("-> Fundo de Investimento");
		System.out.println(fdi.toString());
		imposto = fdi.getImposto();
		
		System.out.println("Imposto: " + imposto);
		valorFinal = valorFinal - imposto - fdi.getTaxa();	
		System.out.println("Valor final: " + valorFinal);		
	}

}
