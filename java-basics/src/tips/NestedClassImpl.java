package tips;

//Nested class
public class NestedClassImpl {
	int i;

	// Non- static nested Class
	class InnerClass {
		void method() {
			// Instatnce variable of nested class can be acccessed
			i = 5;
			System.out.println("i: " + i);
		}
	}

	// Static Inter class
	// Instatnce variable of nested class cannot he acccess in static context
	static class StaticInnerClass {
		void method() {
			// cannot be accessed
			// i = 10;
			System.out.println("Static inner class");
		}
	}

	public static void main(String[] args) {
		// Non static innner class can not be instantiated with the nested class
		// InnerClass innerclass = new InnerClass()

		// static class can be instantiated without its nested class
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.method();

		// Non static inner class must be instantiated with
		// object of nested class
		NestedClassImpl nestedClassImpl = new NestedClassImpl();
		InnerClass innerclass = nestedClassImpl.new InnerClass();
		innerclass.method();

	}
}
