package homework20161214;

public class ExerciseOne {
	public static void main(String[] args) {
		returnThirdChar("abhkgsdfykgdfj");
	}
	
	public static void returnThirdChar(String observedStr) {
		if (observedStr.length() > 2) {
			System.out.println(observedStr.charAt(2));
		} else {
			System.out.println("Too Short");
		}
		
	}
}
