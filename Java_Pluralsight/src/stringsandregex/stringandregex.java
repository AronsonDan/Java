/**
 * 
 */
package stringsandregex;

import java.util.StringJoiner;

/**
 * @author Dan Aronson
 *
 */
public class stringandregex {

    public static void main(String[] args) {
	/*
	 * Joining Sequences of values with StringJoiner
	 */

	// Adding separate values to string joiner
	StringJoiner sj = new StringJoiner(", ");
	sj.add("Alpha");
	sj.add("Beta");
	sj.add("Gamma");

	System.out.println(sj.toString());

	// Adding values to string joiner in chain
	StringJoiner sj2 = new StringJoiner(", ");
	sj2.add("Alpha").add("Beta").add("Gamma");

	System.out.println(sj2.toString());

	// Using the opening and closing curly brackets
	StringJoiner sj3 = new StringJoiner(", ", "{", "}");
	sj3.add("Alpha").add("Beta").add("Gamma");

	System.out.println(sj3.toString());

	// Playing around with opening and closing curly brackets
	StringJoiner sj4 = new StringJoiner("], [", "{[", "]}");
	sj4.add("Alpha").add("Beta").add("Gamma");

	System.out.println(sj4.toString());

	/*
	 * StringJoiner edge case handling
	 */
	// Handling a single value
	StringJoiner sj5 = new StringJoiner("], [", "{[", "]}");
	sj5.add("Alpha");

	System.out.println(sj5.toString());

	StringJoiner sj6 = new StringJoiner(", ");
	sj6.add("Alpha");

	System.out.println(sj6.toString());

	StringJoiner sj7 = new StringJoiner(", ");
	System.out.println(sj7.toString());
	
	// Customize empty value 
	StringJoiner sj8 = new StringJoiner("], [", "{[", "]}");
	sj8.setEmptyValue("Empty");
	
	System.out.println(sj8.toString());
    }

}
