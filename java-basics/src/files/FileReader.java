package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./java-basics/src/resources/FileRead.txt");

		// Files.readAllLines -> reads all lines and returns as a list
		// This method is not always ideal because it reads all the line at a time which
		// can affect memory
		List<String> allLines = Files.readAllLines(path);
		System.out.println("allLines: " + allLines);

		// Files.line -> takes path as input and read the file line by line and returns
		// as stream of string
		Files.lines(path).map(val -> val.toLowerCase()).filter(val -> val.contains("a")).forEach(System.out::println);
	}

}
