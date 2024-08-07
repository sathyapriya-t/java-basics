package problem.basics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// sum of any two element inside the array
	public static void main(String[] args) {

		// 2+7 = 9
		int[] num = { 2, 7, 11, 15 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			int dif = target - num[i];
			if (map.containsKey(dif)) {
				System.out.println(num[i] + "," + dif);
			}
			map.put(num[i], i);
		}

	}

}
