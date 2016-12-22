package homework20161221;

import java.io.IOException;

public class Book {

	private String name;
	private double price;
	private String[] authorNames;

	/**
	 * @param name
	 * @param price
	 * @param authorNames
	 * @throws IOException
	 */
	public Book(String name, double price, String[] authorNames) throws IOException {
		this.setName(name);
		this.setPrice(price);
		addAuthor(authorNames);
	}

	/**
	 * @return the authorNames
	 */
	public String[] getAuthorNames() {
		return authorNames;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) throws IOException {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new IOException("Book price must be a positive number");
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Book [%s, %s, %s]", name, printArray(authorNames), price);
	}

	private String printArray(String[] anArray) {
		String returnString = "";
		for (int i = 0; i < anArray.length; i++) {
			if (i > 0) {
				returnString = returnString + ", ";
			}
			returnString = returnString + anArray[i];
		}
		return returnString;
	}

	public void addAuthor(String[] authorNames) {
		int numberOfAuthors = 0;
		if (authorNames.length >= 5) {
			System.out.println("The number of authors is exceeding the maximum number.");
			System.out.println("Only the first 5 authors will be considered.");
			numberOfAuthors = 5;
		} else {
			numberOfAuthors = authorNames.length;
		}
		this.authorNames = new String[numberOfAuthors];
		for (int i = 0; i < numberOfAuthors; i++) {
			this.authorNames[i] = authorNames[i];
		}
	}
}
