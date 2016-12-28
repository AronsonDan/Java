/**
 * 
 */
package exercise20161228;

import java.util.ArrayList;

/**
 * @author Dan Aronson
 *
 */
public class ListDemo {
    public static void main(String[] args) {

	ArrayList myList = new ArrayList<>();

	Student d = new Student();
	Subject s = new Subject();

	myList.add(d);
	myList.add(s);
	myList.add("123");
	myList.add("123456");

	System.out.println(myList);

	myList.remove(0);
	System.out.println(myList);

	myList.remove(d);
	System.out.println(myList);

	myList.addAll(myList);
	System.out.println(myList);

	myList.addAll(myList.size() - 1,myList);
	System.out.println(myList); 
	
		System.out.println(myList.get(0).getClass());
    }
}
