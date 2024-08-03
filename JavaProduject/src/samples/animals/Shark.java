package samples.animals;

public class Shark extends Fish {

	//Specific Properties
	private int numberOfFings;
	
	//Constructors
	
	public Shark() {
		
	}
	
	public Shark(String scientificName, String popularName, int age, double mass, int numberOfFings) {
		super(scientificName, popularName, age, mass);
		this.numberOfFings = numberOfFings;
	}

	//Specific Behaviors
	@Override
	public void born() {
		System.out.println("Tubarão nascendo...");

	}

	@Override
	public void eat() {
		System.out.println("Tubarão comendo...");

	}

	@Override
	public void growth() {
		System.out.println("Tubarão crescendo...");

	}

	@Override
	public void reproduces() {
		System.out.println("Tubarão reproduzindo...");

	}

	@Override
	public void die() {
		System.out.println("Tubarão morrendo...");

	}

	public int getNumberOfFings() {
		return numberOfFings;
	}

	public void setNumberOfFings(int numberOfFings) {
		this.numberOfFings = numberOfFings;
	}

	@Override
	public void swin() {
		// TODO Auto-generated method stub
		System.out.println("Tubarão nadando");
	}

	@Override
	public String toString() {
		String info = super.toString();
		String subInfo = info + "\nNúmero de barbatanas = " + numberOfFings;
		return subInfo;
	}
	
	

}
