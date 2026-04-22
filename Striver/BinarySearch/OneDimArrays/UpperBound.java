package BinarySearch.OneDimArrays;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19}; // Sorted array
        int x = 19;

        int ind = upperBound(arr, x); // Call function

        System.out.println("The upper bound is the index: " + ind); // Output result
    }

    public static int upperBound(int[] arr, int target){

        // Brute force solution

//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] > target)
//                return i;
//        }
//        return arr.length;

        // Optimal solution
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
