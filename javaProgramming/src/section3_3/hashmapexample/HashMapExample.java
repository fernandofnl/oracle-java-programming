package section3_3.hashmapexample;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> fruitBowl = new HashMap<>();
		
		fruitBowl.put("Banana", "Verde");
		fruitBowl.put("Blueberry", "Azul");
		fruitBowl.put("Guava", "Verde");
		fruitBowl.put("Orange", "Laranja");
		fruitBowl.put("Apple", "Vermelha");
		fruitBowl.put(null, "Olê");
		fruitBowl.put("Grape", null);
		fruitBowl.put("Avocado", "Verde");
		
		//System.out.println(fruitBow1);
		
		for (String arrTemp : fruitBowl.keySet()) {
			System.out.println(arrTemp);
		}
		
		System.out.println();
		
		for (String arrTemp : fruitBowl.values()) {
			System.out.println(arrTemp);
		}
		
		System.out.println();
		
		for (HashMap.Entry<String, String> arrTemp : fruitBowl.entrySet()) {
			System.out.println(arrTemp.getKey() + " : " + arrTemp.getValue());
		}
		
		System.out.println();
		
		for (String arrTemp : fruitBowl.keySet()) {
			System.out.println(arrTemp + " " + fruitBowl.get(arrTemp));
		}
		
		System.err.println();
		
		
		findElement(fruitBowl, "Uva");
		
	}
	
		private static void findElement(HashMap<String, String> fruitBowl, String fruit) {
			if (fruitBowl.containsKey(fruit)) {
				System.out.println("A fruta " + fruit + " é " + fruitBowl.get(fruit) + ".");
			} else {
				System.out.println("Não há " + fruit + " na cesta");
			}
			
		}
	

}
