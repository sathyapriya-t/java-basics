package problem.basics;

import java.util.Arrays;

public class zemoso {
    static void main() {
        int[] arr = {11,5,3,12,6,8,1,7,4};
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i =0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length-1; j++){
                int diff = arr[i] - arr[0];
                int diff1 = arr[j] - arr[i+1];
                int diff2 = arr[arr.length -1] - arr[j+1];
                int currentMin = Math.max(diff, Math.max(diff1, diff2));
                min = Math.min(min, currentMin);
            }

        }
        System.out.println(min);
    }

}
