package BinarySearch.OneDimArrays;

public class FloorCeilFinder {
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};
        int target = 9;
        System.out.println("Floor: " + findFloor(arr, target));
        System.out.println("Ceil: " + findCeil(arr, target));
    }

    public static int findFloor(int arr[], int target){

        // Brute force solution
//        int ans = Integer.MIN_VALUE;
//        for(int i : arr){
//            if(i <= target)
//                ans = i;
//            else
//                break;
//        }
//        return ans;

        // Optimal Solution

        int low = 0, high = arr.length - 1;
        int ans = Integer.MIN_VALUE;
        while (low <= high){
            int mid = low + ((high - low) / 2);
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int arr[], int target){

        // Brute force solution
//        int ans = Integer.MAX_VALUE;
//        for(int i : arr){
//            if(i >= target){
//                ans = i;
//                break;
//            }
//        }
//        return ans;


        // Optimal Solution

        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + ((high - low) / 2);
            if(arr[mid] >= target){
                ans = arr[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
