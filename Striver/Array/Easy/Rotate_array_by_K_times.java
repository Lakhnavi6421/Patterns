package Array.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_array_by_K_times {
    public static void main(String[] args) {
        int [] arr = {1,2, 3, 4, 5, 6};
        int k = 5;

//        leftRotateByK(arr, K);
//        System.out.println("Array after left rotation: " + Arrays.toString(arr));

        leftRotate(arr, arr.length, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }

    public static void leftRotateByK(int [] arr, int k){
        int n = arr.length;
        if(n == 0) return;

//        k = k % n;
//        // Brute force using temporary array
//
//        // Store the first K elements
//        if(k > n) return;
//        int [] temp = Arrays.copyOfRange(arr, 0 , k);
//
//        // Shift remiaing elements to the left
//        for(int i = k ; i < n ; i++)
//            arr[i - k] = arr[i];
//
//        // copy stored elements to the end
//        for(int i = 0 ; i < k ; i++)
//            arr[n- k + i] = temp[i];
    }

    static void reverseArray(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Optimal approach Using *** Recursion *** (LEFT)
    static void leftRotate(int [] arr, int n, int k){
        // reverse first k elements
        reverseArray(arr, 0, k-1);

        // reverse last n-k elements
        reverseArray(arr, k , n-1);

        // reverse whole array
        reverseArray(arr, 0, n-1);
    }

}
