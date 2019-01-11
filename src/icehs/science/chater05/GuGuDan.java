package icehs.science.chater05;

public class GuGuDan {

	public static void main(String[] args) {
		for ( int dan = 2 ; dan <= 9 ; dan ++) {
			if ( dan == 5) {
				continue; // 5단을 무시하고 바로 6단으로 넘어감
			}
			for (int i = 1 ; i <= 9 ; i++) {
				System.out.print( dan + " * " + i + " = " + dan * i + "\t");
			}
			System.out.println();
		}

	}

}
