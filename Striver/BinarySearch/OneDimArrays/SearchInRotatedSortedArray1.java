package BinarySearch.OneDimArrays;

public class SearchInRotatedSortedArray1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println("The index of element " + target + " is: " + searchElement(arr, target));
    }

    public static int searchElement(int[] arr, int target){

        // Brute force solution
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == target)
//                return i;
//        }
//        return -1;

        // Optimal Solution
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + ((high - low) / 2);
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{
                if(arr[mid] < target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
