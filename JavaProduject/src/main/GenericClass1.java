package main;

public class GenericClass1 <Type> {

	// Properties
	private Type password;

	// Properties
	public GenericClass1() {} // construtor padrão

	public GenericClass1(Type password) {
		this.password = password;
	}

	// Behaviors
	public Type getPassword() {
		return password;
	}
	
	public void setPassword(Type password) {
		this.password = password;
	}
}
