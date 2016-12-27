package stringsandregex;

public class ConstractingStringsWithFormatSpecifiers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int david = 13, dawson = 11, dillon = 4, gordon = 2;
	
	// Concatenating
	String s1 = "My nephews are " + 
	david + 
	", " + 
	dawson + 
	", " + 
	dillon + 
	", and" + 
	gordon + 
	" years old";
	
	System.out.println(s1);

	// Formatting
	String s2 = String.format("My nephews are %d, %d, %d and %s years old", 
		david, dawson, dillon, gordon
		);
	System.out.println(s2);
	
	
    }

}
