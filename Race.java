/* Alex Bowman 
 * Csc 112
 * Professor Silvestri
 * HW#1
 * 2/5
 */
package hw1;

import java.util.Scanner;

public class Race {
	private final static String TITLE = "CSC111 Project Template";
	private final static String CONTINUE_PROMPT = "Do this again? [y/N] ";

	private static void process(Scanner sc, String args[]) {
		System.out.println("How many cars are in the race");
		int cars = sc.nextInt();
		Vehicle arr[] = new Vehicle[cars];
		modl(arr, sc);
		raceThemCars(arr);

		sc.nextLine();
	}

	public static void modl(Vehicle arr[], Scanner sc) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Year, Make, Model for Car " + (i + 1));
			int year = sc.nextInt();
			String make = sc.next();
			String model = sc.next();
			sc.nextLine();

			arr[i] = new Vehicle(make, model, year);

		}
	}

	private static void raceThemCars(Vehicle arr[]) {
		do {
			for (int i = 0; i < arr.length; i++) {
				arr[i].adjustCarSpeed();
				arr[i].setDistance(1);
			}

		} while (checkDistance(arr));
		System.out.println(checkWinner(arr));
	}

	private static String checkWinner(Vehicle arr[]) {
		String carWin = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDistance() > 500) {
				carWin = arr[i].toString();
				return carWin;
			}
		}
		return carWin;
	}

	private static boolean checkDistance(Vehicle arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDistance() > 500)
				return false;
		}
		return true;
	}

	// **********************************************
	// Do not change the doThisAgain method
	private static boolean doThisAgain(Scanner sc, String prompt) {
		System.out.print(prompt);
		String doOver = sc.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}

	// **********************************************
	// Do not change the main method
	public static void main(String args[]) {
		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		do {
			process(sc, args);
		} while (doThisAgain(sc, CONTINUE_PROMPT));
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}