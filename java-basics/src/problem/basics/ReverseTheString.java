package problem.basics;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheString {

    public static void main(String[] args) {

        System.out.println("Reversed String using StringBuilder and CharAt method and for loop");
        String value = "sathya";
        String reverseTheStringUsingStringBuilder = reverseTheStringUsingStringBuilder(value);
        System.out.println(reverseTheStringUsingStringBuilder);

        System.out.println("Reversed the string using swap and CharArray");
        System.out.println(reversedStringUsingCharArrayAndTempVariableSwap(value));

        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println(stringBuilder.reverse());

        System.out.println("Reverse the number:");
        reverseTheInteger();

        System.out.println("Reverse the words in the string: ");
        reverseTheWordsInAString();
        String val = "She is beautiful bab";
        reverseWordsInStringUsingJava8(val);

        String[] split = val.split("\\s+");
        Map<String, String> planidrom = new HashMap<>();
        for (String s : split) {
            StringBuilder builder = new StringBuilder(s);
            StringBuilder reversed = builder.reverse();
            if (s.contentEquals(reversed)) {
                planidrom.put(s, "true");
            } else {
                System.out.println(s + " " + reversed);
                planidrom.put(s, "false");
            }
        }
        System.out.println(planidrom);

        Map<String, String> planidrom1 = new HashMap<>();
        List<String> collect1 = Arrays.stream(split).toList();
        collect1.forEach(v -> {
            String string = new StringBuilder(v).reverse().toString();
            if (v.equals(string)) {
                planidrom1.put(v, "True");
            } else {
                planidrom1.put(v, "False");
            }
        });
        System.out.println(planidrom1);

    }

    private static void reverseWordsInStringUsingJava8(String val) {
        String[] split = val.split("\\s+");
        System.out.println(Arrays.stream(split).map(key -> new StringBuilder(key).reverse()).collect(Collectors.joining(" ")));
    }

    private static void reverseTheWordsInAString() {
        StringBuilder stringBuilder1 = new StringBuilder();
        String val = "She is beautiful";
        String[] split = val.split("\\s+");
        for (String s : split) {
            StringBuilder builder = new StringBuilder(s);
            StringBuilder reversed = builder.reverse();
            stringBuilder1.append(reversed);
            stringBuilder1.append(" ");
        }

        System.out.println(stringBuilder1);
    }

    private static void reverseTheInteger() {
        int num = 1234;
        int reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + num % 10;
            num = num / 10;
        }
        System.out.println(reversed);
    }

    private static String reversedStringUsingCharArrayAndTempVariableSwap(String value) {
        char[] charArray = value.toCharArray();
        int left = 0;
        int rifht = charArray.length - 1;
        while (left < rifht) {
            char temp = charArray[left];
            charArray[left] = charArray[rifht];
            charArray[rifht] = temp;
            left++;
            rifht--;
        }
        return String.copyValueOf(charArray);
    }

    private static String reverseTheStringUsingStringBuilder(String value) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
