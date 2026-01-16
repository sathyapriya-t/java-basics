package java8;

import jdk.jshell.EvalException;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InterviewPractice {

    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10);
        Predicate<Integer> integerPredicate = val -> val % 2 == 0;
        Set<Integer> collect = list.stream().filter(integerPredicate).collect(Collectors.toSet());
        System.out.println(collect);

        Function<Integer, Integer> integerIntegerFunction = val -> val * val;
        List<Integer> collect1 = list.stream().map(integerIntegerFunction).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> list1 = list.stream().filter(integerPredicate).map(integerIntegerFunction).toList();
        System.out.println(list1);

        Optional<Integer> first = list.stream().filter(v -> v > 5).findFirst();
        System.out.println(first.orElse(null));

        long count = list.stream().filter(v -> v > 5).count();
        System.out.println(count);

        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        Integer multiple = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiple);

        int sum = list.stream().filter(val -> val % 2 == 0).mapToInt(value -> value).sum();
        System.out.println(sum);

        Optional<Integer> first1 = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(first1);

        int sum1 = list.stream().filter(integerPredicate).map(integerIntegerFunction).mapToInt(value -> value).sum();
        System.out.println(sum1);

        TreeMap<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(v -> v, TreeMap::new, Collectors.counting()));
        System.out.println(collect2);
        List<Integer> list2 = collect2.entrySet().stream().filter(val -> val.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(list2);


        System.out.println("---------------------------------------------------------");
        List<Integer> list3 = list.stream().distinct().toList();
        System.out.println(list3);

        Double collect3 = list3.stream().collect(Collectors.averagingInt(value -> value));
        System.out.println(collect3.intValue());
        OptionalDouble average = list3.stream().mapToInt(value -> value).average();
        System.out.println(average.orElse(0));

        List<Integer> sorted = list.stream().sorted().toList();
        System.out.println(sorted);

        List<Integer> sorted1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted1);

        List<String> strings = Arrays.asList("Sathya", "Arun", "Priya");
        long count1 = strings.stream().filter(str -> str.toUpperCase().startsWith("A")).count();
        System.out.println(count1);

        String collect4 = strings.stream().collect(Collectors.joining(","));
        System.out.println(collect4);

        boolean b = list2.stream().allMatch(v -> v > 0);
        System.out.println(b);

        boolean b1 = list2.stream().anyMatch(v -> v % 3 == 0);
        System.out.println(b1);

        List<List<String>> listList = Arrays.asList(strings, List.of(collect4));
        List<String> list5 = listList.stream().flatMap(Collection::stream).toList();
        System.out.println(list5);

        List<String> list4 = strings.stream().filter(String::isBlank).toList();
        System.out.println(list4);

        Optional<Integer> first2 = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first2);

        System.out.println("-------------------------------------------------------------------------");

        Employee employee = new Employee(1, 2000, "IT", 23);
        Employee employee1 = new Employee(3, 1000, "IBPO", 27);
        Employee employee2 = new Employee(2, 5000, "HR", 20);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        List<Employee> list6 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        System.out.println(list6);

        Double collect5 = employeeList.stream().map(value -> value.getAge()).collect(Collectors.averagingInt(value -> value));
        System.out.println(collect5);

        Map<Boolean, List<Integer>> collect6 = list.stream().collect(Collectors.partitioningBy(va -> va % 2 == 0));
        System.out.println(collect6);

        Map<Integer, Long> collect7 = list.stream().collect(Collectors.groupingBy(va -> va, Collectors.counting()));
        System.out.println(collect7);

        Map<String, Double> collect8 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect8);

        System.out.println("--------------------------------------");

        Optional<Employee> first3 = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(first3);

        List<String> list7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatment, Collectors.counting())).entrySet().stream().filter(v -> v.getValue() > 2).map(Map.Entry::getKey).toList();
        System.out.println(list7);


        Map<String, Double> collect9 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatment, Collectors.averagingDouble(Employee::getSalary)));
        List<Double> list8 = collect9.entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).stream().map(Map.Entry::getValue).toList();
        System.out.println(list8);

        String s = "sathya";
        Map<String, Long> collect10 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(va -> va, Collectors.counting()));
        Optional<String> first4 = collect10.entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).stream().map(Map.Entry::getKey).findFirst();
        System.out.println(first4);
        Map<String, Long> collect11 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(va -> va, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect11);
        Optional<String> first5 = collect11.entrySet().stream().filter(val -> val.getValue() == 1).map(Map.Entry::getKey).findFirst();
        System.out.println(first5);


        System.out.println("---------------------------------------------------");
        Optional<String> first6 = employeeList.stream().map(va -> va.getDepatment()).map(val -> val.substring(0, 1)).collect(Collectors.groupingBy(v -> v, Collectors.counting())).entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).stream().map(Map.Entry::getKey).findFirst();
        System.out.println(first6);

        String str = "I am beautiful!!";
        Arrays.stream(str.trim().split("//s+")).filter(v ->Character.isLetterOrDigit(Integer.parseInt(v)));


    }
}