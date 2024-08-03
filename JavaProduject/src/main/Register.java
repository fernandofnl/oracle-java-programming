package main;

import java.util.ArrayList;
import java.util.List;

public record Register(String scientificName, String popularName, int age, double mass, List <String> HABITAT) {
	
	public Register{
		HABITAT = new ArrayList<>(HABITAT);
	}
	
	@Override
	public List<String> HABITAT(){
		return new ArrayList<>(HABITAT);
	}

	@Override
	public String toString() {
		String info = "Nome Científico = " + scientificName + "\nNome popular = "
	+ popularName + "\nIdade = " + age
				+ "\nMassa = " + mass + "\nHABITAT = " + HABITAT;
		return info;
	}
	
	
	
}
