package tips;

class StaticVariableClass {
	private String name;

	// static varible can be shared between instances
	// Also static varible can be access using class name
	static int count;

	public StaticVariableClass(String name) {
		super();
		this.setName(name);
		count++;
	}

	public int getI() {
		return count;
	}

	public void setI(int i) {
		StaticVariableClass.count = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class StaticMethodClass {

	// instance variable
	private String name;

	// static varible can be shared between instances
	// Also static varible can be access using class name
	static int count;

	public StaticMethodClass(String name) {
		super();
		this.setName(name);
		count++;
	}

	// Static method can be accessed using class name
	// It can be called using instances also - but it's not recommended
	public static int getI() {
		return count;
	}

	public static void setI(int i) {
		// can't access instance variable in static context
		// Because static method belongs to class level
		// this.name
		StaticVariableClass.count = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class StaticNonAccessModifier {

	public static void main(String[] args) {
		// Static Variable
		// Two objects created - count increased twice through constructor
		StaticVariableClass val = new StaticVariableClass("sathya");
		// one time
		System.out.println("one time: " + val.getI());
		// Second time
		StaticVariableClass val2 = new StaticVariableClass("Arun");

		// Value will be two - static variable are shared accross instances
		System.out.println("Second time: " + val2.getI());
		System.out.println("Second time: " + StaticVariableClass.count);

		// Static Method
		// Two objects created - count increased twice through constructor
		StaticMethodClass val3 = new StaticMethodClass("sathya");
		// one time
		System.out.println("one time");
		// Second time
		StaticMethodClass val4 = new StaticMethodClass("Arun");

		// Value will be two - static variable are shared accross instances
		System.out.println("Second time");
		System.out.println(StaticMethodClass.getI());

	}

}
