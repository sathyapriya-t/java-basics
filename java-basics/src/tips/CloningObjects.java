package tips;

class Address implements Cloneable {
	private String city;
	private int pin;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}

	//For Deep Copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class CloningObjects implements Cloneable {
	private String name;
	private Address address;

	public CloningObjects(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Shallow copy
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	// Deep copy
	// comment this and check for shallow copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		CloningObjects cloned = (CloningObjects) super.clone();
		cloned.address = (Address) this.address.clone();
		return cloned;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CloningObjects person1 = new CloningObjects("sathya", new Address("Chennai", 01));
		CloningObjects person2 = (CloningObjects) person1.clone();
		System.out.println("Initial'''");
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		System.out.println(person1.getAddress().getCity());
		System.out.println(person2.getAddress().getCity());

		// Changing the values of person 2
		System.out.println();
		System.out.println("Changing the values of person 2........");
		person2.setName("Arun");
		person2.address.setCity("Banglore");
		;

		// Printing after change
		System.out.println();
		System.out.println("Printing after change");
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		System.out.println(person1.getAddress().getCity());
		System.out.println(person2.getAddress().getCity());

		// Notice that city is changed for for both the objects
		// Because its called shallow copy
		// Address its self is separate object ..it will be pass by reference
		// so, it will afect both object to fix this we nedd to implement deepcopy
		// add clone in the address class and then implement the custom implementation
		// for cloning
		// then it will work

	}
}
