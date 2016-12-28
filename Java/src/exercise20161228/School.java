/**
 * 
 */
package exercise20161228;

/**
 * @author Dan Aronson
 *
 */
public class School {
    
    Learnable student;
    
    public void registerNewStudent(Learnable l) {
	// TODO
	student = l;
    }
    
    public void startTeaching() {
	Subject s = new Subject();
	student.learn(s);
    }
}
