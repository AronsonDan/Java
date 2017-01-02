/**
 * 
 */
package exercise20170102;

import java.util.Comparator;

/**
 * @author Dan Aronson
 *
 */
public class StudentComparator implements Comparator<Student>{

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Student o1, Student o2) {
	return o1.compareTo(o2);
    }

}
