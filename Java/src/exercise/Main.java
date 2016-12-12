/**
 * 
 */
package exercise;
import java.io.IOException;

/**
 * @author Dan Aronson
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int S = 0;
		int H = 0;
		int x = getNumberFromUser();

		while (x != -1){
			if (x > H){
				S = H;
				H = x;
			} else if  (x > S){
				S = x;
			}
			//System.out.print("H = ");
			//System.out.println(H);
			//System.out.print("S = ");
			//System.out.println(S);
			x = getNumberFromUser();
			counter++;
		}
		System.out.println("The program ran "
				+ counter 
				+ " times");
		System.out.println("Highest Number is: " 
				+ H);
		System.out.println("Second highest Number is: "
				+ S);
		System.out.print("The Program Has Been Terminated");

	}
	
	public static int getNumberFromUser(){
		//System.out.println("NumberFromUser Function has been invoked");
		byte[] bytes = new byte[10];
		try {
			System.out.println("Please insert a number at the console window.");
			System.in.read(bytes);
		} catch (IOException e){
			
		}
		int x = Integer.valueOf(new String(bytes).trim());
		//System.out.println(x);
		return (x);
	}

}
