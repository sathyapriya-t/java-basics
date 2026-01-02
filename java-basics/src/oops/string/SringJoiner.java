package oops.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class SringJoiner {
    public static void main(String[] args) {
        // Introduced in java 8 - used to join string with specific value
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Sathya");
        stringJoiner.add("Priya");
        stringJoiner.add("Thangavel");
        System.out.println(stringJoiner);

        // It has one more varient with prefix and sufix to it
        StringJoiner stringJoiner1 = new StringJoiner(",", "[", "]");
        stringJoiner1.add("Sathya");
        stringJoiner1.add("Priya");
        stringJoiner1.add("Thangavel");
        System.out.println(stringJoiner1);

        String s = "I am beautiful";
        String[] split = s.trim().split(" ");
        System.out.println(split.length);

        long count = Arrays.stream(split).count();
        System.out.println(count);

        String name = "sathya";
        Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(val -> val, Collectors.counting()));
        System.out.println(collect);

        List<String> list = Arrays.stream(name.split("")).distinct().toList();
        System.out.println(list);


    }


}
