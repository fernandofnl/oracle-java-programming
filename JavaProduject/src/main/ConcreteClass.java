package main;

public class ConcreteClass extends AbstractClass {

	// Properties
	public int password;

	// Constructors
	public ConcreteClass() {
		password = 3333;
	}

	public ConcreteClass(int password) {
		this.password = password;

	}

	// Behaviors
	public void sayHello() {
		System.out.println("E ai, mano?");
	}

	public void originalSayHello() {
		super.sayHello();
	}

	@Override
	public void syHi() {
		System.out.println("oi");

	}

	@Override
	public void interfaceMethod2() {// Immplementação obrigatória
		System.out.println("Método 2 da Interface1");
	}

}
