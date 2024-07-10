package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./java-basics/src/resources/FileWrite.txt");
		List<String> list = List.of("123", "sathya","priya","Arun");
		Files.write(path, list);
	}
}
