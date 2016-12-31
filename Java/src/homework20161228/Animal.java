/**
 * 
 */
package homework20161228;

/**
 * @author Dan Aronson
 *
 */
public abstract class Animal implements Comparable{

    // private fields
    protected String name;
    private int age;

    // constructor
    /**
     * @param name
     * @param age
     */
    public Animal(String name, int age) {
	this.setName(name);
	this.setAge(age);
    }

    // setters and getters for name and age
    /**
     * @return the name
     */
    public String getName() {
	return this.name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
	return this.age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(int age) {
	this.age = age;
    }

    /// abstract methods
    public abstract String sayHello();

    public abstract String move();

    // Class methods
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Animal [name=%s, age=%s]", this.name, this.age);
    }


/* (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Animal a = (Animal) o;
	return a.getAge() - this.getAge();
    }

}
