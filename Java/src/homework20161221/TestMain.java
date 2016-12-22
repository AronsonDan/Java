package homework20161221;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {

		Book[] bookArray = new Book[3];
		String[] s = new String[] { "a", "b", "c", "d", "e", "f" };
		try {
			bookArray[0] = new Book("b1", 12.52, s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] s2 = new String[] { "a" };

		try {
			bookArray[1] = new Book("b2", 120.365, s2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] s3 = new String[] { "a", "b" };
		try {
			bookArray[2] = new Book("b3", -5, s3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		for (int i = 0; i < bookArray.length - 1; i++) {
			System.out.println(bookArray[i].toString());
		}
	}

}
