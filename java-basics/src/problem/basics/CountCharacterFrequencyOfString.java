package problem.basics;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequencyOfString {

    public static void main(String[] args) {
        String s = "Sathyas";
        String lowerCase = s.toLowerCase();

        Map<Character, Integer> map = getHoghestValueFromTheMapUsingStream(s, lowerCase);
        System.out.println(map);

        getHighestValueWithoutStreams(map);
    }

    private static void getHighestValueWithoutStreams(Map<Character, Integer> map) {
        int max = 0;
        char maxKey = 0;
        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (max < i.getValue()) {
                max = i.getValue();
                maxKey = i.getKey();
            }

        }
        System.out.println(maxKey);
    }

    private static Map<Character, Integer> getHoghestValueFromTheMapUsingStream(String s, String lowerCase) {
        Map<Character, Integer> map = getCountofEachLetterFrequency(s, lowerCase);
        Map.Entry<Character, Integer> characterIntegerEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println(characterIntegerEntry.getKey());
        return map;
    }

    private static Map<Character, Integer> getCountofEachLetterFrequency(String s, String lowerCase) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = lowerCase.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        return map;
    }
}
