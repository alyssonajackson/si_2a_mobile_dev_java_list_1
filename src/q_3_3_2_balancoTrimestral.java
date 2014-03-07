
public class q_3_3_2_balancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		float mediaMensal = gastosTrimestre / 3.0f;
		
		System.out.println("Gastos no trimestre: " + Integer.valueOf(gastosTrimestre));
		System.out.println("Média mensal: " + Float.valueOf(mediaMensal));
	}

}