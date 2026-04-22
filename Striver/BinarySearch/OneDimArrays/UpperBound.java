package BinarySearch.OneDimArrays;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19}; // Sorted array
        int x = 9;

        int ind = upperBound(arr, x); // Call function

        System.out.println("The upper bound is the index: " + ind); // Output result
    }

    public static int upperBound(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > target)
                return i;
        }
        return arr.length;
    }
}
