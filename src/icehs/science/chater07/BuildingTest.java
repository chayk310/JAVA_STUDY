package icehs.science.chater07;

import java.util.Scanner;

import icehs.science.chater06.Building;

public class BuildingTest {

	public static void main(String[] args) {
	
		Building build = new Building();
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(scanner);
		
		build.moveElevator();
	}

}