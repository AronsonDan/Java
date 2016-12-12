package exercise;

public class ArraySample {
	
	static int numOfRows = 10;
	static int numOfCols = 12;
	static int[][] multTable = new int [numOfCols][numOfRows];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] i = new int [10]; // Declaration of array of integers with one dimension of 10
		int[][] m = new int [10][10]; // Declaration of array of integers with two dimension of 10
		String[] s  = new String[10];
		i[0] = 100;
		System.out.println(i[0]);
		*/
		for (int i = 1; i <= multTable.length; i++) {
			for (int j = 1; j <= multTable[1].length; j++) {
				multTable[i-1][j-1] = i*j;
				System.out.print(j-1 + "\t");
				//System.out.println(j);
			}
			System.out.println("i value is: " + i);
		}
		
		System.out.println("The value at the end of the matrix is: " + 
				multTable[numOfCols - 1][numOfRows - 1]);
		/*
		//System.out.println(multTable[numOfRows][9]);
		//System.out.println(multTable[4][9]);
		
		System.out.println(multTable[1].length);
		System.out.println(multTable.length);
		
		System.out.println(numOfRows);
		System.out.println(numOfCols);
		*/
	}

}
