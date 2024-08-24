package section3_1.wildcards;

import java.util.ArrayList;

public class GenericMethodClass {

	public <T> void printArray(T[] array) {

		for (T arrTemp : array) {
			System.out.print(arrTemp + " ");
		}
		System.out.println();
	}

	/*
	 * for (int i = 0; i < array.length; i++) { System.err.print(array[i] + " "); }
	 */

	public <T> void printArrayList(ArrayList<T> arrayList) {

		for (T arrLstTemp : arrayList) {
			System.out.print(arrLstTemp + " ");
		}
		
		System.out.println();
	}
	
	
	
	public void displayArrayList(ArrayList<?> arrayList) {

		for (Object arrLstTemp : arrayList) {

			System.out.print(arrLstTemp + " ");

		}

		System.out.println();

	}
	
	public double sonOfArrayList(ArrayList<? extends Number> arrayList) {
		
		double sum = 0.0;
		for (Number arrLstTemp : arrayList) {
			
			sum += arrLstTemp.doubleValue();
			
		}
		
		return sum;
	}
	

	public void addNumbers(ArrayList<? super Integer> arrayList) {
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
	}
	
	
	
}
