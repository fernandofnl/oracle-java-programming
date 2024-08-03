package main;

public interface Interface1 {
	final boolean INTERFACEVAR = true;
	
	default void interfaceMethod1() {
		System.out.println("Método 1 da Interface1.");
	}
	
	void interfaceMethod2();

}
