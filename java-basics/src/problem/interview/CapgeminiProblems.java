package problem.interview;

import java.util.*;
import java.util.stream.Collectors;

public class CapgeminiProblems {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 1, 5};
        Set<Integer> integerMap = new HashSet<>();
        int sum = 0;
        for (int i : arr) {
            if (!integerMap.add(i)) {
                System.out.println("Duplicate element is : " + i);
            }
        }
        System.out.println("Sum of the array is : " + sum);


        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.orElse(-1));

        String s = "sathya";

        Map<Character, Long> collect = s.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed()).forEach(vel -> System.out.println(vel.getKey() + " : " + vel.getValue()));
    }
}
