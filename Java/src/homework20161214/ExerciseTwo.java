package homework20161214;

import java.util.Scanner;


public class ExerciseTwo {

	public static void main(String[] args) {
		int scannedNumber = getNumberFromUser();
		while (scannedNumber != -1) {
			if (isLarge(scannedNumber)){
				printLarge();
			} else {
				printSmall();
			}
			scannedNumber = getNumberFromUser();
		}
	}
	
	private static int getNumberFromUser() {
		Scanner ScanObj = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int returnInt = ScanObj.nextInt();
		return returnInt;
	}

	
	public static Boolean isLarge(int number) {
		if (number > 100) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void printLarge() {
		System.out.println("Large");
	}
	
	public static void printSmall() {
		System.out.println("Small");
	}
	
}
