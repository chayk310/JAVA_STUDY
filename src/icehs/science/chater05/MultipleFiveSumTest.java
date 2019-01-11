package icehs.science.chater05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int index = 1;
		int count = 1;
		
		while ( sum <= 100) {
			int num = index * 5;
			sum += num;
			
			System.out.println( count++ + "( +" + num + " ) " + sum);
		}
 
	}
//고쳐야함
}
