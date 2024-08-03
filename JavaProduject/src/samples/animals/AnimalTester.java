package samples.animals;

public class AnimalTester {

	public static void main(String[] args) {
/*
		Shark shark = new Shark();
		
		shark.setScientificName("Galeocerdo cuvier");
		shark.setPopularName("Tubarão tigre");
		shark.setAge(5);
		shark.setMass(200.30);
		shark.setNumberOfFings(2);*/
		
		
		Shark shark = new Shark("Galeocerdo couvier", "Tubarão Tigre", 20, 250.0, 2);
		
		/*System.out.println(shark.getScientificName());
		System.out.println(shark.getPopularName());
		System.out.println(shark.getAge());
		System.out.println(shark.getMass());
		System.out.println(shark.getNumberOfFings());*/
		
		System.out.println(shark);
		
		System.out.println();
		
		shark.born();
		shark.eat();
		shark.growth();
		shark.reproduces();
		shark.die();
		shark.swin();
	
		
		
		
	}

}
