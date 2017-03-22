package corretora.modelo;

public class Taxa {
	
	public double Apos(int dias) {
		if (dias <= 365) {
			return 0.25;
		} else if (dias > 365 && dias <= 730) {
			return 0.20;
		} else {
			return 0.15;
		}
	}
	
	public double taxaAdministracao() {
		return 0.01;
	}

}
