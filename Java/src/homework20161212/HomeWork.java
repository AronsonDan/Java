package homework20161212;

import java.util.Scanner;

public class HomeWork {

	private static Scanner returnScanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberFromUser = getNumberFromUser();
		while (numberFromUser >= 10) {
			printToConsole(1, numberFromUser, (numberFromUser + 10));
			int numberinpower = powerAnInteger(2, numberFromUser);
			printToConsole(2, numberFromUser, numberinpower);
			numberFromUser = getNumberFromUser();
		}
		isWeekDay(numberFromUser);
		System.out.println("The program has terminated");
	}

	private static void isWeekDay(int numberFromUser) {

		// TODO Auto-generated method stub
		//System.out.println("isWeekDay has been invoked");
		if (numberFromUser <= 7 & numberFromUser > 0) {
			if (numberFromUser >= 1 & numberFromUser <= 5) {
				System.out.println("The given number represents a weekday");
			} else {
				System.out.println("The given number represents a weekend day");
			}

		} else if (numberFromUser == -1) {
			System.out.println("");
		} else {
			System.out.println("The given number is not representing a day of the week");
		}
	}

	public static int getNumberFromUser() {
		System.out.print("Please enter an integer: ");
		int number = extracted();
		// extracted().close();
		return number;
	}

	public static int powerAnInteger(int BaseNumber, int PowerNumber) {
		int ReturnNumber = 1;
		for (int i = 0; i < PowerNumber; i++) {
			ReturnNumber *= BaseNumber;
		}
		return ReturnNumber;
	}

	private static int extracted() {
		returnScanner = new Scanner(System.in);
		return returnScanner.nextInt();
	}

	public static String printToConsole(int ExerciseNumber, int Number1, int Number2) {
		String str = "Pair of numbers of exercise " + ExerciseNumber + " are: " + Number1 + " and " + Number2;
		System.out.println("Pair of numbers of exercise " + ExerciseNumber + " are: " + Number1 + " and " + Number2);
		return str;
	}
	
}
