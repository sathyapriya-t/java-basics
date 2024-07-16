package exception;

/*	Exception Hierarchy

 Class Error extend Throwable
 Class Exception extend Throwable
 Class InterruptedException extend Exception(Unchecked)
 Class RuntimeException extend Exception
 Class NullPointerException extend RuntimeException(Checked)*/

/*checked Exception - Risk -> Which extends Exception but not RuntimeException
 -> which needs to be handled or throwed by calling class
 -> Eg : InterruptedException

  UnChecked Exception - Only Bad Programmers can write - Which extends Exception and RuntimeException
  ->which need not to be handles by calling class 
  -> RuntimeException and NullPointerException */

public class CheckedExceptionImpl {

	public static void main(String[] args) {
		//Calling class
		try {
			method1(); // Checked Exception
		} catch (InterruptedException exception) {
			exception.printStackTrace();

		}
		method2(); // Unchecked Exception

	}

	private static void method2() throws RuntimeException {

	}

	private static void method1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hellooo !!!");
	}

}
