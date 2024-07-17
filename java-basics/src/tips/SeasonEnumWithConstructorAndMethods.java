package tips;

public enum SeasonEnumWithConstructorAndMethods {
	
	//SPRING(1) -> just like object 
	// this is to keep track of enums
	SPRING(1), FALL(2), SUMMER(3), WINTER(3);

	private int value;

	//getter
	public int getValue() {
		return value;
	}

	//Constructor
	SeasonEnumWithConstructorAndMethods(int value) {
		this.value = value;
	}
	
	//Methods
	

}
