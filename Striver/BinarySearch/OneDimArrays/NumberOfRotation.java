package BinarySearch.OneDimArrays;

public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr){
        // Brute force solution

//        int minVal = arr[0];
//        int minInd = 0;
//        for(int i = 1 ; i < arr.length ; i++){
//            if(arr[i] < minVal){
//                minVal = arr[i];
//                minInd = i;
//            }
//        }
//        return minInd;

        // Better solution

//        for(int i = 0 ; i < arr.length - 1; i++){
//            if(arr[i] > arr[i+1])
//                return i+1;
//        }
//        return 0;

        // Optimal Solution

        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
