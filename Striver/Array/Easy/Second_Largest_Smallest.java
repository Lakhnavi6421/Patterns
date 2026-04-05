package Array.Easy;

import java.util.Arrays;

public class Second_Largest_Smallest {
    public static void main(String[] args) {
        int [] arr = {2,4,6,2,9,45,45,32,12,35};
        int n = arr.length;
        int sec_Largest = secondLargest(arr, n);
        System.out.println(sec_Largest);
    }

    public static int secondLargest(int [] arr, int n){
        if(n == 0 || n < 2) return -1;

        // Brute force approach using sorting
//        Arrays.sort(arr);
//        int largest = arr[n-1];
//        int secondLargest = -1;
//        for(int i = n -2 ; i >= 0 ; i--){
//            if(arr[i] != largest){
//                secondLargest = arr[i];
//                break;
//            }
//        }
//        return secondLargest;

        // Better approach
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        for(int i : arr){
//            smallest = Math.min(smallest, i);
//        }
//        for(int i : arr){
//            if(i < secondSmallest && i != smallest)
//                secondSmallest = i;
//        }
//        return secondSmallest;

        // Optimal approach
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < smallest){
                secondSmallest = smallest;
                smallest = i;
            }
            else if(i < secondSmallest && i != smallest)
                secondSmallest = i;
        }
        return secondSmallest;
    }
}
