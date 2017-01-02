/**
 * 
 */
package exercise20170102;

/**
 * @author Dan Aronson
 *
 */
public class Student implements Comparable<Student> {

    // Member Declaration
    String name;
    int grade;

    /**
     * @param name
     * @param grade
     */
    public Student(String name, int grade) {
	this.setName(name);
	this.setGrade(grade);
    }

    // Getter functions
    /**
     * @return the grade
     */
    public int getGrade() {
	return this.grade;
    }

    /**
     * @return the name
     */
    public String getName() {
	return this.name;
    }

    // Setter functions
    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @param grade
     *            the grade to set
     */
    public void setGrade(int grade) {
	this.grade = grade;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
	return String.format("Student [name=%s, grade=%s]", this.name, this.grade);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Student o) {
	return this.grade - o.grade;
    }

}
