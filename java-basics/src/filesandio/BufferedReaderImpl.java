package filesandio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderImpl {

	public static void main(String[] args) {
		File file = new File("./java-basics/src/resources/FileRead.txt");
		String lines;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			while ((lines = reader.readLine())!= null) {
				System.out.println("lines:"+ lines);
		}} 
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
