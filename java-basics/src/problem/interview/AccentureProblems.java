package problem.interview;

import java.util.*;

public class AccentureProblems {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(rat(sc));

        int i = 135;
        reverseTheString();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        reverseTheNumber(i);
        palindrom(s);
        fistNonRepeatedCharInTheString(s);
        duplicateElementInArray();
        twoSumBruteForce();
        twoSumUsingHashMap();
        missingNumber();
        missingNumberUsingFormula();
        maxMin();
        minMaxUsingSorting();
        anagram();
        removeNumbersFromString();
        removeDuplicates();
        secondLargest();
        secondLargestUsingTwoVariables();
        reverseTheStringWords();
        countVowels();
        findIntersection();
        decryptString();
        moduloOf11();
        stringRepeatation();
        superiorElementCount();
        superiorElemetCountSingForloop();
        convertSingleDigit();
        toUpperAndLower();
    }

    private static void toUpperAndLower() {
        String s = "Sathya";

        int uppperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uppperCount++;
            }
            if (Character.isLowerCase(s.charAt(i))) {
                lowerCount++;
            }
        }
        if (uppperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }

    private static void convertSingleDigit() {
        int n = 5;
        int single = 0;
        String s = String.valueOf(n);
        if (s.length() > 1) {
            if (n % 2 == 0) {
                single = (int) Math.floor((double) (n - 2) / 2);
            } else {
                single = (int) (double) (n / 2);
            }
        } else {
            single = n;
        }

        System.out.println(single);
    }

    private static void superiorElemetCountSingForloop() {
        int[] arr = {8, 10, 6, 2, 9, 7};
        int count = 0;
        int greaterFromRight = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > greaterFromRight) {
                count++;
                greaterFromRight = arr[i];
            }
        }

        System.out.println(count);
    }

    private static void superiorElementCount() {
        int[] arr = {8, 10, 6, 2, 9, 7};
        int n = 6;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                if (j == n - 1) {
                    count++;
                }
            }
        }

        System.out.println(count + 1);
    }

    private static void stringRepeatation() {
        String s = "babdc";

        Map<Character, Integer> treeMap = new TreeMap<>();
        for (char c : s.toCharArray()) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());
        }

        System.out.println(stringBuilder);
    }

    private static void moduloOf11() {
        String s = "1345";
        int i = Integer.parseInt(s);
        System.out.println(i % 11);
    }

    private static void decryptString() {
        String s = "a2b3c5a0";
        int n = 5;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            char letter = s.charAt(i);
            char ch = s.charAt(i + 1);
            if (Character.isDigit(ch)) {
                int i1 = Integer.parseInt(String.valueOf(ch));
                while (i1 > 0) {
                    stringBuilder.append(letter);
                    i1 = i1 - 1;
                }
            }
        }
        if (stringBuilder.length() < n) {
            System.out.println(-1);
        } else {
            String[] split = stringBuilder.toString().split("");
            System.out.println(split[5]);
        }
    }

    private static void findIntersection() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 5, 6};

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr2) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }

        System.out.println(list);
    }

    private static void countVowels() {
        String string = "SATHYA";
        int count = 0;
        char[] charArray = string.toUpperCase().toCharArray();
        for (char c : charArray) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }

        System.out.println(count);
    }

    private static void reverseTheStringWords() {
        String s = "I am beautiful";
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.split("\\s+");
        for (String str : split) {
            stringBuilder.append(new StringBuilder(str).reverse());
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);
    }

    private static void secondLargestUsingTwoVariables() {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int[] arr = {1, 2, 3, 5, 6, 3, 7, 8};

        for (int i : arr) {
            if (i > largest) {
                second = largest;
                largest = i;
            } else if (i > second && i != largest) {
                second = i;
            }
        }

        System.out.println(largest);
        System.out.println(second);
    }

    private static void secondLargest() {
        int[] arr = {1, 2, 3, 5, 6, 3, 7, 8};
        Set<Integer> set = new TreeSet<>();
        for (int ar : arr) {
            set.add(ar);
        }

        Object[] array = set.toArray();
        System.out.println(array[set.size() - 2]);
    }

    private static void removeDuplicates() {
        int[] arr = {1, 3, 4, 2, 5, 6, 6, 7, 7};
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        System.out.println(Arrays.toString(set.toArray()));
    }

    private static void removeNumbersFromString() {
        String s = "A2ccent2ture";
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }

        System.out.println(stringBuilder);
    }

    private static void anagram() {
        String s = "Sathya";
        String a = "Sathya";

        char[] charArray = s.toCharArray();
        char[] charArray1 = a.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray);

        System.out.println(Arrays.equals(charArray, charArray1));
    }

    private static void minMaxUsingSorting() {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};

        Arrays.sort(arr);
        int max = arr[1];
        int min = arr[arr.length - 1];
        System.out.println("Min" + min + " " + max);
    }

    private static void maxMin() {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }

    private static void missingNumberUsingFormula() {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        int expected = (max * (max + 1)) / 2;
        int actual = 0;

        for (int a : arr) {
            actual += a;
        }
        System.out.println(expected - actual);
    }

    private static void missingNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        Arrays.sort(arr);
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                val = val + 1;
            } else {
                System.out.println(val);
                break;
            }

        }
    }

    private static void twoSumUsingHashMap() {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7};
        int n = 12;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int i1 = n - arr[i];
            if (map.containsKey(i1)) {
                System.out.println("i:" + i1 + "i1" + arr[i]);
                break;
            }
            map.put(arr[i], i);
        }
    }

    private static void twoSumBruteForce() {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7};
        int n = 12;

        boolean isTrue = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println("i: " + arr[i] + " j:" + arr[j]);
                    isTrue = true;
                    break;
                }
            }
            if (isTrue) {
                break;
            }
        }
    }

    private static void duplicateElementInArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7};

        Map<Integer, Integer> dup = new HashMap<>();
        for (int i : arr) {
            dup.put(i, dup.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> val : dup.entrySet()) {
            if (val.getValue() > 1) {
                System.out.println(val.getKey());
            }
        }
    }

    private static void fistNonRepeatedCharInTheString(String s) {
        Map<Character, Integer> duplicateMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char val : charArray) {
            duplicateMap.put(val, duplicateMap.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Character, Integer> i : duplicateMap.entrySet()) {
            if (i.getValue() == 1) {
                System.out.println(i.getKey());
                break;
            }
        }
    }

    private static void palindrom(String s) {
        int length = s.length();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

        String revesed = new String(charArray);
        System.out.println(revesed.equals(s));
    }

    private static void reverseTheNumber(int i) {
        int reversed = 0;
        while (i > 0) {
            reversed = (reversed * 10) + i % 10;
            i = i / 10;
        }

        System.out.println(reversed);
    }

    private static void reverseTheString() {
        String s = "SATHYA";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());

        char[] charArray = s.toCharArray();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        System.out.println(new String(charArray));
    }

    private static int rat(Scanner sc) {
        int rat = sc.nextInt();
        int unit = sc.nextInt();
        int len = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }


        int max = rat * unit;
        if (rat == 0) {
            return 0;
        }
        if (rat > max) {
            return -1;
        }
        int added = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (added >= max) {
                break;
            } else {
                added = added + arr[i];
            }
            count++;
        }
        return count;
    }
}
