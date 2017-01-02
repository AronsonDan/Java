/**
 * 
 */
package exercise20170102;

/**
 * @author Dan Aronson
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Student david = new Student("David", 1);
	Student moshe = new Student("Moshe", 2);
	Student maor = new Student("Maor", 9);
	Student yaniv = new Student("Yaniv", 8);
	Student yosi = new Student("yosi", 6);
	Student hezi = new Student("Hezi", 3);
	Student a = null;

	
	School school = new School();
	
	school.addStudent(david);
	school.addStudent(moshe);
	school.addStudent(maor);
	school.addStudent(yaniv);
	school.addStudent(yosi);
	school.addStudent(hezi);
	school.addStudent(a);

	
	school.printAll();

    }

}
