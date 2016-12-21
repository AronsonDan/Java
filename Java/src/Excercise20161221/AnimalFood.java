package Excercise20161221;

public class AnimalFood {

	private String name;
	private FoodType type;

	/**
	 * @param name
	 * @param type
	 */
	public AnimalFood(String name, FoodType type) {
		this.name = name;
		this.type = type;
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
	 * @return the type
	 */
	public FoodType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(FoodType type) {
		this.type = type;
	}

}