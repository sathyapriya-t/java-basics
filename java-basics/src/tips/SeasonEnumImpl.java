package tips;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;

public class SeasonEnumImpl {

	public static void main(String[] args) {
		
		//ordinal returns the position 
		System.out.println("ordinal: "+ SeasonEnum.FALL.ordinal());
		System.out.println(Arrays.toString(SeasonEnum.values()));

		//values
		System.out.println("value: "+ SeasonEnumWithConstructorAndMethods.FALL.getValue());
		System.out.println(Arrays.toString(SeasonEnum.values()));

		Month december = Month.DECEMBER;
		System.out.println(december);
		
		DayOfWeek saturday = DayOfWeek.SATURDAY;
		System.out.println(saturday);
	}

}
