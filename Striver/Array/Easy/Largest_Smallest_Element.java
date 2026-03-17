package Array.Easy;

import java.util.Arrays;

public class Largest_Smallest_Element {
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, 9, 45, 32, 12};
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
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static int  smallest(int [] arr, int n){
        if(n == 0) return -1;
        if(n == 1) return arr[0];

        // Brute force (By sorting)
        Arrays.sort(arr);
        return arr[0];
    }
}
