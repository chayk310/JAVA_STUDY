package icehs.science.chater05;

public class GugudanTest {
	public static void main(String[] args) {
		for ( int dan = 2 ; dan <=9 ; dan++) {
			for ( int i = 1 ; i <= 9 ; i++) {
				if ( i == 9) {
					System.out.print( dan + " * " + i + " = " + (dan * i) + "  ");
				}else {
				System.out.print( dan + " * " + i + " = " + (dan * i) + " , ");
				}
			}
			System.out.println();
		}
	}
}
