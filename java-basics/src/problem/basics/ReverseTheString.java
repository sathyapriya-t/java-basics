package problem.basics;

import java.util.Arrays;

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


    }

    private static String reversedStringUsingCharArrayAndTempVariableSwap(String value) {
        char[] charArray = value.toCharArray();
        int left = 0;
        int rifht = charArray.length -1;
        while(left < rifht){
            char temp = charArray[left];
            charArray[left] = charArray[rifht];
            charArray[rifht] = temp;
            left ++;
            rifht --;
        }
        return String.copyValueOf(charArray);
    }

    private static String reverseTheStringUsingStringBuilder(String value) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = value.length()-1; i >=0 ; i--){
            char c = value.charAt(i);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
