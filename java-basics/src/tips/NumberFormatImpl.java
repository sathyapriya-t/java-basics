package tips;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatImpl {

	public static void main(String[] args) {
		
		//NumberFormat - to format to specifc currency /Integer/Percent
		//DecimalFormat - decimal level
		
		double doubleValue = 1_00_000_000;
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
		String formattedCurrency = currencyInstance.format(doubleValue);
		System.out.println("formattedCurrency: " + formattedCurrency);

		NumberFormat intInstance = NumberFormat.getIntegerInstance();
		String formattedInteger = intInstance.format(doubleValue);
		System.out.println("formattedInteger: " + formattedInteger);

		NumberFormat intInstance1 = NumberFormat.getIntegerInstance();
		intInstance1.setGroupingUsed(false);
		String formattedInteger1 = intInstance1.format(doubleValue);
		System.out.println("formattedInteger1: " + formattedInteger1);

		Locale defaultLocale = Locale.ENGLISH;
		NumberFormat intInstance2 = NumberFormat.getIntegerInstance(defaultLocale);
		String formattedInteger2 = intInstance2.format(doubleValue);
		System.out.println("formattedInteger2 with locale: " + formattedInteger2);

		NumberFormat decimalFormat = DecimalFormat.getCompactNumberInstance();
		String decimalFormatted = decimalFormat.format(doubleValue);
		System.out.println("decimalFormatted with locale: " + decimalFormatted);

	}
}
