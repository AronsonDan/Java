/**
 * 
 */
package exercise20170102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Dan Aronson
 *
 */
public class School {

    // Member declaration
    private ArrayList<Student> studentList = new ArrayList<Student>();

    // Class methods
    public void addStudent(Student student) {
	if (student == null) {
	    System.out.println(student + ": Cannot add null object");
	} else {
	    studentList.add(student);
	}
    }

    public void sortStudentList() {
	Collections.sort(this.studentList);
    }

    public void printAll() {
	// Prints all of the members of the student array list
	this.sortStudentList();
	// for each loop over a collection
	for (Student student : studentList) {
	    System.out.println(student);
	}
    }
    public void printAllWithIterator() {
	System.out.println("");
	System.out.println("Printing using an iterator");
	Iterator<Student> iterator = studentList.iterator();
	while (iterator.hasNext()) {
	    Student student = (Student) iterator.next();
	    System.out.println(student);
	}
    }
}
