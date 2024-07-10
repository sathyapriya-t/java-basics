package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

/* Files.list(Path) -> lists all the directory
 Files.walk(path, int level) -> lists values based on level
 Files.Find(path, int level, BiPredicate matcher) -> lists values based on level and matcher
 BiPredicate -> takes (path,BasicFileAttributes) -> we can filter using both*/

public class FilesImpl {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get(".");
		// Files.list
		System.out.println("Using Files.list to list all dir");
		Files.list(dir).forEach(System.out::println);

		// Files.list
		System.out.println();
		System.out.println("Using Files.list to list all dir");
		Path dir2 = Path.of(".");
		Files.list(dir2).forEach(System.out::println);

		// Files.walk
		System.out.println();
		System.out.println("Using Files.walk to list all dir");
		Files.walk(dir, 4).filter(val -> String.valueOf(val).contains(".java")).forEach(System.out::println);

		// Files.find
		System.out.println();
		System.out.println("Using Files.find to list all dir and filter it using matcher");
		BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> attribute.isDirectory();
		Files.find(dir2, 1, matcher).forEach(System.out::println);

	}
}
