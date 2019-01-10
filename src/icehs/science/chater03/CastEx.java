package icehs.science.chater03;

public class CastEx {
	public static void main(String[] args) {
		
		double large = 1000000000000.123456789;
		long middle = (long) large;
		int small = (int) middle;
		
		System.out.println( large );
		System.out.println( middle );
		System.out.println( small );
	}
}
