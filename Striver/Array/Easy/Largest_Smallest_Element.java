package Array.Easy;

import java.util.Arrays;

public class Largest_Smallest_Element {
    public static void main(String[] args) {
        int [] arr = {4, 6, 1, 9, 46, 32, 12};
        int n = arr.length;
        int maximum = largest(arr, n);
        int minimum = smallest(arr, n);
        System.out.println("Largest Element is: " + maximum);
        System.out.println("Smallest Element is: " + minimum);
    }

    public static int largest(int [] arr, int n){
        if(n == 0) return -1;
        if(n == 1) return arr[0];

        // Brute force approach
//        Arrays.sort(arr);
//        return arr[n-1];

//        Better approach
        int max = arr[0];
        for(Integer i : arr){
            if(i > max)
                max = i;
        }
        return max;
    }

    public static int  smallest(int [] arr, int n){
        if(n == 0) return -1;
        if(n == 1) return arr[0];

        // Brute force (By sorting)
//        Arrays.sort(arr);
//        return arr[0];

//        Better approach(Using recursive)
        int min = arr[0];
        for(Integer i : arr){
            min = Math.min(i, min);
        }
        return min;
    }
}
