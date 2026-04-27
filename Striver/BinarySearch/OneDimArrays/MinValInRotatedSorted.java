package BinarySearch.OneDimArrays;

public class MinValInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 2};
        System.out.println(searchMinElement(arr));
    }

    public static int searchMinElement(int[] arr){
        // Brute force Sol (SEQUENTIAL SEARCH)
//        int minVal = Integer.MAX_VALUE;
//        for(int i : arr){
//            minVal = Math.min(minVal, i);
//        }
//        return minVal;

        // Optimal Solution

        int low = 0 , high = arr.length - 1;

        while(low  < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[low];
    }
}
