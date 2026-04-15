package Array.Easy;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_with_given_sum_K_positive {
    public static void main(String[] args) {
        int [] arr = {2, 3, 0, 5, 1, 9};
        int k = 10;

        System.out.println("The length of the longest subarray is: " + longestSubarray(arr, k));
    }

    public static int longestSubarray(int [] arr, int k){
        // Brute force approach

//        int n = arr.length;
//        int maxLength = 0;
//
//        // Starting index
//        for(int i = 0 ; i < n ; i++){
//            // Ending index
//            for(int j = i ; j < n ; j++){
//                // add all the elements of subarray = arr[i... j]
//                long sum = 0;
//                for(int m = i ; m <= j ; m++){
//                    sum += arr[m];
//                }
//
//                if(sum == k)
//                    maxLength = Math.max(maxLength, j - i + 1);
//            }
//        }
//        return maxLength;

        // Optimised Brute force approach Using two Loops

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

        // Better approach Using *** HASHING ***

//        int n = arr.length;
//        Map<Long, Integer> preSumMap = new HashMap<>();
//        long sum = 0;
//        int maxLength = 0;
//        for(int i = 0 ; i < n ; i++){
//            sum += arr[i];
//            if(sum == k)
//                maxLength = Math.max(maxLength, i+1);
//            long rem = sum - k;
//
//            if(preSumMap.containsKey(rem)){
//                int len = i - preSumMap.get(rem);
//                maxLength = Math.max(maxLength, len);
//            }
//
//            // Finally update the map checking the conditions
//            if(!preSumMap.containsKey(sum))
//                preSumMap.put(sum, i);
//        }
//        return maxLength;


        // Optimal approach using *** Two pointer ***

        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLength = 0;
        while(right < n){
            // if sum > k, reduce the subarray from left
            // until sum becomes Less or equal to k
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLength
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);

            }
                // Move forward the right pointer
            right++;
            if(right < n)
                sum += arr[right];
        }
        return maxLength;
    }
}
