package tips;

/*
 * 
Final ->
 final variable - value can't be changed|
 final method - can't be overridden
 final class - can't be inherited
Finally - used in try catch block -> which alwaysd excecutes finally block
Finalize - used in garbage collectors and its deprecated now after java9 

*/
final class FinalClas {
	// final variable value cannot be changed
	final int i = 10;

	// final method can't be overridden
	final void print() {
		System.out.println(i);
	}

}

//Gives compailation error because final calls can't be inherited
//class InheritingFinalClass extends FinalClass{
//	
// final method can't be overriden
//@override
//void print() {
//	System.out.println(i);
//}
//}
public class FinalFinallyFinalize {

	public static void main(String[] args) {
		FinalClas finalClass = new FinalClas();
		try {
			finalClass.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// finally used in try catch finally
		finally {
			System.out.println("Always executes");
		}
		// Finalize - used in garbage collectors and its deprecated now
	}

}
