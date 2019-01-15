package icehs.science.chater08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		int [] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99 };
		
		int sum = 0;
		
		for (int i = 0 ; i < numbers.length ; i++) {
			sum += numbers[i];
		}
		
		System.out.println("гу╟Х : " + sum);
		
		for (int i = 0 ; i < numbers.length ; i++) {
			System.out.print( numbers[i] + " " );
		}
		
		System.out.println();
		
		int temp = numbers[0];
		numbers[0] = numbers[8];
		numbers[8] = temp;
		
		for (int i = 0 ; i < numbers.length ; i++) {
			System.out.print( numbers[i] + " " );
		}
	}

}
