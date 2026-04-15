package Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_with_Sum_K {
    public static void main(String[] args) {
        int arr[] = { -1, 1, 2, 0, 5};
        int k = 2;
        System.out.println("The length of the longest subarray is: " + longestSubarray(arr, k));
    }

    public static int longestSubarray(int [] arr, int k){
        // Brute force

//        int n = arr.length;
//        int len = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i ; j < n; j++){
//                int sum = 0;
//                for(int idx = i ; idx <= j ; idx++)
//                    sum += arr[idx];
//
//                if(sum == k)
//                    len = Math.max(len, j - i + 1);
//            }
//        }
//        return len;

        // Better approach using Two Loop
//        int n = arr.length;
//        int maxLength = 0;
//        for(int i = 0 ; i < n ; i++){
//            int sum = 0;
//            for(int j = i ; j < n ; j++){
//                sum += arr[j];
//                if(sum == k)
//                    maxLength = Math.max(maxLength, j - i + 1);
//            }
//        }
//        return maxLength;

        // Optimal approach using *** HASHING ***

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLenght = 0;
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            sum += arr[i];

            // Case 1: if full subarray from 0 to i  has sum = k
            if(sum == k)
                maxLenght = i + 1;

            // Case 2: if (sum - k) was seen before
            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLenght = Math.max(maxLenght, len);
            }

            // Store the first occurence of a prefix sum
            if(!preSumMap.containsKey(sum))
                preSumMap.put(sum, i);
        }
        return maxLenght;
    }
}
