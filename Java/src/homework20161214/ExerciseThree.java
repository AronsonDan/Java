package homework20161214;

public class ExerciseThree {

	// print random number between 1 and 10
	public static void main(String[] args) {
		int currentArraySize = 10;
		int[] currentArray = createInitialArray(currentArraySize);
		// System.out.println(currentArray.length);
		// printCurrentArray(currentArray);
		int i;
		while (currentArraySize > 0) {

			i = createRandomNumber(currentArray.length);
			// System.out.println("current value of i is: " + i);
			// System.out.println("Array current length is:" +
			// currentArray.length);
			printSelectedCard(i, currentArray);
			currentArray = createArrayOfIntegers(currentArray, i);
			//printCurrentArray(currentArray);
			currentArraySize--;
		}

	}

	public static int[] createInitialArray(int arraySize) {
		// System.out.println("createInitialArray function has been invoked");
		int[] returnArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			returnArray[i] = i + 1;
		}
		return returnArray;
	}

	public static int createRandomNumber(int maxNumber) {
		// System.out.println("createRandomNumber function has been invoked");
		int max = maxNumber;
		double r = Math.random();
		int i = (int) (r * max);
		// System.out.println(i);
		// System.out.println(r);
		return i;
	}

	public static int[] createArrayOfIntegers(int[] intArray, int indexToRemove) {
		// System.out.println("createArrayOfIntegers function has been
		// invoked");
		int[] returnArray = new int[intArray.length - 1];

		for (int i = 0; i < returnArray.length; i++) {
			if (i < indexToRemove) {
				returnArray[i] = intArray[i];
			} else {
				returnArray[i] = intArray[i + 1];
			}
		}

		return returnArray;

	}

	public static void printSelectedCard(int indexToPrint, int[] currentArray) {
		// System.out.println("printSelectedCard function has been invoked");
		//System.out.println("Selected index equals to:" + (indexToPrint));
		//System.out.println("The value of the array in that index is: " + currentArray[indexToPrint]);
		// System.out.println("Current array size is: " + currentArray.length);
		System.out.println(currentArray[indexToPrint]);
	}

	public static void printCurrentArray(int[] currentArray) {
		// System.out.println("printCurrentArray function has been invoked");
		for (int i = 0; i < currentArray.length; i++) {
			System.out.print(currentArray[i] + "\t");
		}
		System.out.println("");
	}
}
