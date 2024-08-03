package samples.animals;

public class Whale extends Mammal implements Aquatic{

	@Override
	public void born() {
		// TODO Auto-generated method stub
		System.out.println("Baleia nascendo.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Baleia comendo.");
	}

	@Override
	public void growth() {
		// TODO Auto-generated method stub
		System.out.println("Baleia crescendo.");
	}

	@Override
	public void reproduces() {
		// TODO Auto-generated method stub
		System.out.println("Baleia reproduzindo.");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("Baleia morrendo.");
	}

	@Override
	public void swin() {
		// TODO Auto-generated method stub
		System.out.println("Baleia nadando.");
	}

}
