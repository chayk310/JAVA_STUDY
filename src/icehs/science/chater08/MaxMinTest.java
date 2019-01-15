package icehs.science.chater08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int maxNum = numbers[0];
		int minNum = numbers[0];
		
		for ( int i = 0 ; i < numbers.length ; i++) {
			if ( maxNum < numbers[i]) {
				maxNum = numbers[i];	
			}
			if ( minNum > numbers[i]) {
				minNum = numbers[i];	
			}
		}
		
		System.out.println("최대값 : " +  maxNum );
		System.out.println("최소값 : " +  minNum );

	}

}
