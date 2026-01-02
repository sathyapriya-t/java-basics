package problem.basics;

import java.util.stream.IntStream;

public class Palindrom {
    public static void main(String[] args) {
        String s = "satas";
        System.out.println("checkPalidromUsingStringBuilder : ");
        checkPalidromUsingStringBuilder(s);
        // 12345
        System.out.println("checkPalindromUsingForLoop : ");
        System.out.println(checkPalindromUsingForLoop(s));

        //Using java 8
        System.out.println("check palindrome using the java 8: ");
        checkPalindromUsingJava8(s);
    }

    private static void checkPalindromUsingJava8(String s) {
        boolean b = IntStream.range(0, s.length() / 2)
                .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
        System.out.println(b);
    }

    private static void checkPalidromUsingStringBuilder(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reversed = stringBuilder.reverse();
        System.out.println(reversed);
        if (s.contentEquals(reversed)) {
            System.out.println("True!!");
        } else {
            System.out.println("False");
        }
    }

    private static boolean checkPalindromUsingForLoop(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            System.out.println(s.charAt(i) + "-" + s.charAt(length - 1));
            if (!(s.charAt(i) == s.charAt((length - i) - 1))) {
                return false;
            }
        }
        return true;
    }
}
