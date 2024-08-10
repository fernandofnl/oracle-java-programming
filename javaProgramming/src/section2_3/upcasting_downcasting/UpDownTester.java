package section2_3.upcasting_downcasting;

import section2_3.MontainBike;
import section2_3.Bicicleta;

public class UpDownTester {

	public static void main(String[] args) {
		
		Bicicleta mb = (Bicicleta) new MontainBike("MB001", "Aço Carbono", "Raios de Metal", 20, 18, 25.0, "Soft");
		System.out.println(mb);
		System.out.println(((MontainBike)mb).getTipoDeAmortecedor());
		
		
		

	}

}
