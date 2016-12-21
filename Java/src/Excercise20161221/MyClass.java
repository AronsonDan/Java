package Excercise20161221;

public class MyClass {

	// define the class constants
	public static final String HELLO_STRING = Messages.getString("MyClass.0"); //$NON-NLS-1$
	
	// define the class members
	private int firstValue;
	private int secondValue;
	private int thirdValue;
	private int fourthValue;

	@Override
	public String toString() {
		return "MyClass [firstValue=" + firstValue + ", secondValue=" + secondValue + ", thirdValue=" + thirdValue
				+ ", fourthValue=" + fourthValue + ", toString()=" + super.toString() + "]";
	}

	public MyClass(int firstValue) {
		this.setFirstValue(firstValue);
	}

	public MyClass(int firstValue, int secondValue) {
		this.setFirstValue(firstValue);
		this.setSecondValue(secondValue);
	}

	public MyClass(int firstValue, int secondValue, int thirdValue) {
		this.setFirstValue(firstValue);
		this.setSecondValue(secondValue);
		this.setThirdValue(thirdValue);
	}

	/**
	 * @param firstValue
	 * @param secondValue
	 * @param thirdValue
	 * @param fourthValue
	 */
	public MyClass(int firstValue, int secondValue, int thirdValue, int fourthValue) {
		this.setFirstValue(firstValue);
		this.setSecondValue(secondValue);
		this.setThirdValue(thirdValue);
		this.setFourthValue(fourthValue);
	}

	/**
	 * @return the firstValue
	 */
	public int getFirstValue() {
		return firstValue;
	}

	/**
	 * @param firstValue the firstValue to set
	 */
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	/**
	 * @return the secondValue
	 */
	public int getSecondValue() {
		return secondValue;
	}

	/**
	 * @param secondValue the secondValue to set
	 */
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	/**
	 * @return the thirdValue
	 */
	public int getThirdValue() {
		return thirdValue;
	}

	/**
	 * @param thirdValue the thirdValue to set
	 */
	public void setThirdValue(int thirdValue) {
		this.thirdValue = thirdValue;
	}

	/**
	 * @return the fourthValue
	 */
	public int getFourthValue() {
		return fourthValue;
		
	}

	/**
	 * @param fourthValue the fourthValue to set
	 */
	public void setFourthValue(int fourthValue) {
		this.fourthValue = fourthValue;
	}
	
	public void printMyClass() {
		System.out.println(MyClass.HELLO_STRING);
		System.out.println("First value is: " + this.getFirstValue());
		System.out.println("Second value is: " + this.getSecondValue());
		System.out.println("Third value is: " + this.getSecondValue());
		System.out.println("Fourth value is: " + this.getFourthValue());
	}
	
}