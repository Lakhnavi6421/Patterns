package BinarySearch.OneDimArrays;

public class SearchSingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(searchElement(arr));
    }

    public static int searchElement(int[] arr){
        // Brute force solution

//        int n = arr.length;
//        if(n == 1) return arr[0];
//
//        for(int i = 0 ; i < n ; i++){
//            // Check if it's the first element and not equal to the next
//            if(i == 0){
//                if(arr[i] != arr[i+1])
//                    return arr[i];
//            }
//
//            // Check if it's the last element and not equal to the previous
//            else if(i == n-1){
//                if(arr[i] != arr[i-1])
//                    return arr[i];
//            }
//
//            // Check if it's the current element and is not equal to the both neighbours
//            else{
//                if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
//                    return arr[i];
//            }
//        }
//        return -1;


        // Optimal Solution

        int n = arr.length;
        // Edge case: only one element in the array
        if(n == 1) return arr[0];

        // Edge case: first element is the unique one
        if(arr[0] != arr[1]) return arr[0];

        // Edge case: last element is the unique one
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        // initialize binary search bounds (exclude first and last index)
        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low + high) / 2;

            // Check if the middle element is unique one
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1])
                return arr[mid];

            // If mid is in the left half
            if((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid + 1])){
                // Move to the right half
                low = mid + 1;
            }

            else{
                // Move to the left half
                high = mid - 1;
            }
        }
        return -1;
    }
}
