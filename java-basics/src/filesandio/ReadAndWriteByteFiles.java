package filesandio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Basically there are 2 types of file reading and writing

one with Files.read() -> from java8
Normal one with reader/ write(char)  and inputstream/outputstream (byte)

Another by using streams
there are two types of stream
1.reader/ writer - if end of the file read method returns null
2.inputstream/outputstream - if end of the file read returns -1

*/
public class ReadAndWriteByteFiles {

	public static void main(String[] args) {
		File source = new File("./java-basics/src/resources/FileRead.txt");
		File dest = new File("./java-basics/src/resources/ByteFileWrite.txt");

		try (FileOutputStream outputStream = new FileOutputStream(dest);
				FileInputStream inputStream = new FileInputStream(source)) {
			int val;
//			while ((val = inputStream.read()) != -1) {
//				outputStream.write(val);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}