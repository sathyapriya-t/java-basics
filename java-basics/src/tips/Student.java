package tips;

import java.util.Objects;

// Records are used to store immutable collection of object to avoid so musch opf boiler plate
// Once the record is created tostring, constructor getter and equals methods are automatically created
public record Student(int id, String name) {

	// CustomConstructor
	// this stil has some bolier plate code

	/*
	 * public Student(int id, String name) { 
	 *   if (!Objects.nonNull(id)) { 
	 *   throw new  IllegalArgumentException("Invalid argument: "+ id);
	 * } 
	 * //like this 
	 * this.id = id; 
	 * this.name = name; 
	 * }
	 */

	// Above constructor and this are same - this is called compact constructor
	@SuppressWarnings("unused")
	public Student {
		if (!Objects.nonNull(id)) {
			throw new IllegalArgumentException("Invalid argument: " + id);

		}

	}

	public static void main(String[] args) {

		// Constructor
		Student std1 = new Student(1, "sathya");
		Student std2 = new Student(2, "priya");
		Student std3 = new Student(3, "arun");

		// getter
		System.out.println(std1.id());
		System.out.println(std1.name());

		// Equal and tostring
		System.out.println(std1.equals(std2));
		System.out.println(std3);

	}

}

