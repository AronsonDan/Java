/**
 * 
 */
package javathecoreplatform;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dan Aronson
 *
 */
public class MainZip {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] data = { "Line 1", "Line 2 2", "Line 3 3 3", "Line 4 4 4 4", "Line 5 5 5 5 5", };

	try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
	    copyToZip(zipFs);
	    writeToFileInZip1(zipFs, data);
	    writeToFileInZip2(zipFs, data);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (URISyntaxException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
	Map<String, String> providerProps = new HashMap<>();
	providerProps.put("create", "true");

	URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
	FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
	return zipFs;
    }

    private static void copyToZip(FileSystem zipFs) throws IOException {
	Path sourceFile = Paths.get("myFile.txt");
	Path destFile = zipFs.getPath("/textFileCopied.txt");

	Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
	try (BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile.txt"))) {
	    for (String d : data) {
		writer.write(d);
		writer.newLine();
	    }
	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

    private static void writeToFileInZip2(FileSystem zipFs, String[] data) throws IOException {
	Files.write(
		zipFs.getPath("/newFile2.txt"), 
		Arrays.asList(data), 
		Charset.defaultCharset(), 
		StandardOpenOption.CREATE
		);
    }
}
