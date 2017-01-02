/**
 * 
 */
package exercise20170102;

import java.util.ArrayList;
import java.util.Collections;

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

    
    public void sortStudentList(){
	Collections.sort(this.studentList); 
    }
    
    public void printAll(){
	// Prints all of the members of the student array list 
	this.sortStudentList();
	for (int i = 0; i < studentList.size(); i++) {
	    System.out.println(studentList.get(i));
	}
    }
}
