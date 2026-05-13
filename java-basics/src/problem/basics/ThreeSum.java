package problem.basics;

import java.util.*;

public class ThreeSum {
    static void main() {
        int[] arr = {-1,0,1,2,-1,4};
        Arrays.sort(arr);

        Set<List<Integer>> result = new HashSet<>();

        for (int i =0; i<arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j--;
                }
            }
        }

        System.out.println(result);
    }
}
