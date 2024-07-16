package concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		String value = "ABC SAT ABC";
		occurenacesNotThreadSafe(value);
		ocurrancesWithOnlyHashMapAndLongAdder(value);
		occureancesWithComputeIfAbsentWhichIsThreadSafe(value);

	}

	private static void occureancesWithComputeIfAbsentWhichIsThreadSafe(String value) {
		
		// Find the occurrences of each character in a string
		// This not thread safe(Not Atomic)
		// To make it thread safe we can use LongAdder/ AtomicInteger and
		// ConcurrentHashMap<>
		// concurrentHashMap.computeIfAbsent(Key, Function) -> if the key is absent it
		// performs the function and assign to the key in the map
		
		ConcurrentHashMap<Character, LongAdder> occurance = new ConcurrentHashMap<>();
		for (char ch : value.toCharArray()) {

			occurance.computeIfAbsent(ch, (map -> new LongAdder())).increment();

		}
		System.out.println(occurance);
	}

	private static void ocurrancesWithOnlyHashMapAndLongAdder(String value) {
		
		// Find the occurrences of each character in a string
		// This not thread safe(Not Atomic)
		// To make it thread safe we can use LongAdder/ AtomicInteger and
		// ConcurrentHashMap<>
		// still not thread safe
		
		ConcurrentHashMap<Character, LongAdder> occurance = new ConcurrentHashMap<>();
		for (char ch : value.toCharArray()) {

			LongAdder intValue = occurance.get(ch);
			if (intValue == null) {
				intValue = new LongAdder();
			}
			intValue.increment();
			occurance.put(ch, intValue);

		}
		System.out.println(occurance);
	}

	private static void occurenacesNotThreadSafe(String value) {
		
		// Find the occurrences of each character in a string
		// This not thread safe(Not Atomic)
		// To make it thread safe we can use LongAdder/ AtomicInteger and
		// ConcurrentHashMap<>
		
		Map<Character, Integer> occurance = new HashMap<Character, Integer>();
		for (char ch : value.toCharArray()) {
			
			Integer intValue = occurance.get(ch);
			if (intValue != null) {
				intValue++;
				occurance.put(ch, intValue);
			} else {
				occurance.put(ch, 1);
			}

		}
		System.out.println(occurance);
	}

}
