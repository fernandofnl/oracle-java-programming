package main;

public class ConcreteClass2 extends ConcreteClass1 {

	private int password;

	public ConcreteClass2() {
		password = 4321;
	}

	public ConcreteClass2(int password) {
		super(password);
	}


}
