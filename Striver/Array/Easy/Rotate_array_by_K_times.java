package Array.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_array_by_K_times {
    public static void main(String[] args) {
        int [] arr = {1,2, 3, 4, 5, 6};
        int k = 3;

//        leftRotateByK(arr, K);
//        System.out.println("Array after left rotation: " + Arrays.toString(arr));

        leftRotate(arr, arr.length, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));

        int [] arr2 = {1,2, 3, 4, 5, 6};
        rightRotateByK(arr2, k);
        System.out.println("Array after right rotation: " + Arrays.toString(arr2));
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

    // Rotate the array to the right by K positions
    public static void rightRotateByK(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Store last k elements
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--)
            arr[i + k] = arr[i];

        // Copy the stored elements to the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to rotate array left or right by k steps
    public int[] rotateArray(int[] nums, int k, String direction) {
        // Get array length
        int n = nums.length;

        // Edge case: do nothing if array is empty or k is 0
        if (n == 0 || k == 0) return nums;

        // Normalize k if greater than n
        k = k % n;

        // If rotation is to the right
        if (direction.equals("right")) {
            // Step 1: reverse entire array
            reverseArray(nums, 0, n - 1);

            // Step 2: reverse first k elements
            reverseArray(nums, 0, k - 1);

            // Step 3: reverse remaining n-k elements
            reverseArray(nums, k, n - 1);
        }
        // If rotation is to the left
        else if (direction.equals("left")) {
            // Step 1: reverse first k elements
            reverseArray(nums, 0, k - 1);

            // Step 2: reverse remaining n-k elements
            reverseArray(nums, k, n - 1);

            // Step 3: reverse entire array
            reverseArray(nums, 0, n - 1);
        }

        // Return the rotated array
        return nums;
    }
}
