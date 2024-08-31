package section3_4;

public class SortExample {

	public static void main(String[] args) {
		
		int [] numbers = {1, 12, 16, 5, 4};
		
		displayNumbers(numbers);
		System.out.println();
		selectionSort(numbers);
		displayNumbers(numbers);
		System.out.println();
		binarySearch(numbers, 12);

	}
	
	public static void displayNumbers(int[] numbers) {
		
		for (int arrTemp : numbers) {
			System.out.print(arrTemp + " ");
		}
		
	}

	
	public static void selectionSort(int[] numbers) {
		
		int indexMin = 0;
		for (int i = 0; i < numbers.length; i++) {
			indexMin = i;
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[j] < numbers[indexMin]) {
					indexMin = j;
				}
			}
			
			int temp = numbers[i];
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
			
			
		}
		
	}
	
	public static int binarySearch(int[] numbers, int target) {
		int indexMin = 0;
		int indexMax = numbers.length - 1;
		while (indexMin <= indexMax) {
			int indexMid = (indexMin + indexMax) / 2;
			if (numbers[indexMid] == target) {
				System.out.println("ACERTOOOO MIZERAVI: " + target + " posicao " + (indexMid + 1) + " da lisa.");
				return indexMid;
			}
			else if (indexMid > target) {
				indexMax = indexMid - 1;
			}
			else {
				indexMin = indexMid + 1;
			}
		}
		System.out.println("ERROU MIZERAVIIII!");
		return -1;
	}
	
}
