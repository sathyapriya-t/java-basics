package filesandio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderImpl {

	//reading and writing file using Buffered Reader and writer
	public static void main(String[] args) {
		File source = new File("./src/FileRead.txt");
		File dest = new File("/JavaBasics/src/resources/sample.txt");
		
		String lines;
		try (BufferedReader reader = new BufferedReader(new FileReader(source));
				BufferedWriter writer = new BufferedWriter(new FileWriter(dest))){
			while ((lines = reader.readLine())!= null) {
				writer.write(lines+"\n");
		}} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}