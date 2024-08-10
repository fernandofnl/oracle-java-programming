package section2_3.instanceof_operator;

import section2_3.MontainBike;
import section2_3.RoadBike;
import section2_3.Bicicleta;

public class InstanceOfTester {

	public static void main(String[] args) {
		
		MontainBike mb1 = new MontainBike();
		RoadBike rb1 = new RoadBike();
		
		Bicicleta mb2 = new MontainBike();
		Bicicleta rb2 = new RoadBike(); // Polimorfismo -> usado para  
		
		Bicicleta [] bikes = new Bicicleta[5];
		
		bikes[0] = new MontainBike("MB001", "Aço Carbono", "Raios de Metal", 20, 18, 25.0, "Soft - index 0 - posicao 1");
		bikes[1] = new RoadBike("RB001", "Slim Aço Carbono", "Raios de Plástico", 22, 24, 38.0, "Plug-in - index 1 - posicao 2");
		bikes[2] = new MontainBike("MB002", "Aço Carbono Reforçado", "Raios de Metal Plus", 21, 19, 26.0, "Médio - index 2 - posicao 3");
		bikes[3] = new MontainBike("MB003", "Aço Carbono Mega", "Raios de Metal 4", 20, 18, 25.0, "Soft - index 3 - posicao 4");
		bikes[4] = new RoadBike("MB004", "Aço Carbono Frágil", "Raios de Metal 2", 15, 13, 11.0, "Tosco - index 4 - posicao 5");
		
		for(Bicicleta temp : bikes) {
			if(temp instanceof RoadBike) {
				System.out.println(temp);
				System.out.println("=====\\=====");
			}
			if(temp instanceof MontainBike) {
				System.out.println(temp);
				System.out.println("=====\\=====");
			}
			//System.out.println(temp);
		}
		
		
		
	}

}