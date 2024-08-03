package samples.animals;

public class Cow  extends Mammal implements Terrestrial{

	@Override
	public void born() {
		// TODO Auto-generated method stub
		System.out.println("Vaca nascendo.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Vaca comendo.");
	}

	@Override
	public void growth() {
		// TODO Auto-generated method stub
		System.out.println("Vaca crescendo.");
	}

	@Override
	public void reproduces() {
		// TODO Auto-generated method stub
		System.out.println("Vaca reproduzindo.");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("Vaca morrendo.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Vaca andando.");
	}

}
