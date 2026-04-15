package Array.Easy;

import com.sun.source.tree.BreakTree;

public class Longest_Subarray_with_given_sum_K_positive {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 1, 9};
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

        int n = arr.length;
        int maxLength = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
                sum += arr[j];
                if(sum == k)
                    maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
}
