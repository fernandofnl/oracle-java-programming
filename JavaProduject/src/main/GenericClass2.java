package main;

public class GenericClass2<T1, T2> {

	private T1 password;
	private T2 description;

	// Properties
	public GenericClass2() {} // construtor padrão

	public GenericClass2(T1 password, T2 description) {
			this.password = password;
			this.description = description;
		}

	// Behaviors
	public T1 getPassword() {
		return password;
	}

	public void setPassword(T1 password) {
		this.password = password;
	}

	public T2 getDescription() {
		return description;
	}

	public void setDescription(T2 description) {
		this.description = description;
	}
	
	
}
