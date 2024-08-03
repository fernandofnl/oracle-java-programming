package main;

public enum Enumeration {

	// Instanciar uma enumeração só é permitido dentro da propria enumeração
	// Logo só é permitido chamar um objeto da enumeração
	
	// Objects
	ENUM_OBJECT_1 (123, "Texto"),
	ENUM_OBJECT_2 (432, "Texto2"),
	ENUM_OBJECT_3 (578, "Texto3");
	
	// Properties
	private int value1;
	private String value2;
	
	// Constructors
	Enumeration(int value1, String value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	Enumeration() {
		value1 = 000;
		value2 = "Texto";
	}
	
	Enumeration(int value1){
		this.value1 = value1;
		value2 = "Texto";
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	
	// Behaviors
	
	
	
}
