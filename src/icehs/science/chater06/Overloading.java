package icehs.science.chater06;

public class Overloading {
	
	void addtion(int num1, int num2) {
		System.out.println( num1 + num2 );
	}
	
	void addtion(double num1, double num2) {
		System.out.println( num1 + num2 );
	}
	
	void addtion(String str1, String str2) {
		System.out.println( str1 + str2 );
	}
	
//	void addtion(int a,int b) {      
//		System.out.println("오류  메서드");
//	}
	
	void addtion(String str1, int str2) {
		System.out.println("순서예제 1" + str1 + str2 );
	}
	
	void addtion(int str1, String str2) {
		System.out.println("순서예제 2" + str1 + str2 );
	}
}
