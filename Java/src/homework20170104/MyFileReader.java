/**
 * 
 */
package homework20170104;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dan Aronson
 *
 */
public class MyFileReader {

    private String filePath = "C:\\Users\\Dan Aronson\\Desktop\\FileReaderTest.txt";
    private String writeFilePath = "C:\\Users\\Dan Aronson\\Desktop\\FileWriterTest.txt";

    public MyFileReader() {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	MyFileReader mfr = new MyFileReader();
	try {
	    mfr.readAndPrint(mfr.getFilePath());
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try {
	    mfr.writeMyFile(mfr.getWriteFilePath());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try {
	    mfr.readMyFile(mfr.getWriteFilePath());
	} catch (IOException | BadLineException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    /**
     * @return
     */
    public String getFilePath() {
	return this.filePath;
    }

    /**
     * @return the writeFilePath
     */
    public String getWriteFilePath() {
	return this.writeFilePath;
    }

    public void readAndPrint(String fileName) throws IOException, FileNotFoundException {

	try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

	    String sCurrentLine;

	    while ((sCurrentLine = br.readLine()) != null) {
		System.out.println(sCurrentLine);
	    }
	}
    }

    public void writeMyFile(String writeFilePath) throws IOException {
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(writeFilePath))) {
	    for (int i = 0; i < 100; i++) {
		System.out.println("This is line number: " + i + "\n");
	    }

	}
    }

    public void readMyFile(String fileName) throws FileNotFoundException, IOException, BadLineException {

	try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

	    String sCurrentLine;

	    while ((sCurrentLine = br.readLine()) != null) {
		if (sCurrentLine.startsWith("This is line number:")) {
		    System.out.println(sCurrentLine);
		} else {
		    throw new BadLineException("Bad line found at: " + fileName + "Line number: " + sCurrentLine,
			    sCurrentLine);
		}
	    }
	}
    }

}
