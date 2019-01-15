package icehs.science.chater07;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		int number = getUsersNumber();
		
		System.out.println( number );
	}

	private static int getUsersNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
