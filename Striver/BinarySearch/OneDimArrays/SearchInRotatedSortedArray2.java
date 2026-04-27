package BinarySearch.OneDimArrays;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3,3, 3, 4, 5, 6};
        int target = 8;
        System.out.println(searchElement(arr, target));
    }

    public static boolean searchElement(int[] arr, int target){

        // Brute force solution

//        for(int i : arr){
//            if(i == target)
//                return true;
//        }
//        return false;

        // Optimal Solution

        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return true;
            }

            // Handle duplicates: cannot determine sorted side
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Right half is sorted
            else{
                if(arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}
