package Excercise20161221;

public class Animal {

	private String name;
	private String sex;

	/**
	 * 
	 */
	public Animal() {
		super();
	}

	/**
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 * @param sex
	 */
	public Animal(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void eat(AnimalFood food) {
		System.out.println("------> Animal.eat");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Animal [name=%s, sex=%s]", name, sex);
	}
	
}
