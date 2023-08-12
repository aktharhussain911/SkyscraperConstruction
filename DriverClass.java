package buildingSkyscraper2;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			FloorConstruction fc = new FloorConstruction();

			// Prompt the user to input the total number of floors in the building
			System.out.println("Enter the total number of floors in a building : ");
			int N = sc.nextInt();

			// Create an integer array to store the floor sizes
			int[] floor = new int[N];

			// Prompt the user to input the floor size for each day
			for (int i = 0; i < N; i++) {
				System.out.println("Enter the floor size given on day " + (i + 1) + ":");
				floor[i] = sc.nextInt();
			}
			System.out.println();

			/*
			 * Call the skyscraperConstruction method of obj1 to print the order in which
			 * the floors can be constructed
			 */
			fc.skyscraperConstruction(floor);

			sc.close();
		}

	}

}
