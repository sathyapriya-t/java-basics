package tips;

public class TextBlock {

	public static void main(String[] args) {

		// Text block - multiple lines of string
		// Should be enclose with the """ """
		// After first """ quotes there should be line break and start the string in
		// second line -> that how complire finds this as text block
		// if the spaces is equal in the multiple line its ignored
		// if any of the line is unequal then that is considered
		// the spaces after the string is stripped and goes to the nest line
		String str = """
				sathya
				priya
				   arun

				  jeeva

				------------------
				""";
		System.out.println(str);

		// we can also use formatted()
		String str1 = """
				sathya %d
				priya
				   arun %d

				  jeeva""".formatted(22, 23);
		System.out.println(str1);

	}

}
