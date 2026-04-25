package BinarySearch.OneDimArrays;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 9;
//        int ans = count(arr, target);
        int ans = countOccurrence(arr, target);
        System.out.println("The number of occurrences is: " + ans);
    }


    // Brute force solution

    public static int countOccurrence(int arr[], int target){
        int cnt = 0;
        for(int i : arr){
            if(i == target)
                cnt++;
        }
        return cnt;
    }



    // Optimal solution

//    public static int firstOccurrence(int[] arr, int target){
//        int low = 0,  high = arr.length - 1;
//        int first = -1;
//
//        while(low <= high){
//            int mid = (low + high) / 2;
//            if(arr[mid] == target){
//                first = mid;
//                high = mid - 1;
//            }
//            else if(arr[mid] < target){
//                low = mid + 1;
//            }
//            else{
//                high = mid - 1;
//            }
//        }
//        return first;
//    }
//
//    public static int lastOccurrence(int[] arr, int target){
//        int low = 0, high = arr.length - 1;
//        int last = -1;
//        while(low <= high){
//            int mid = (low + high) / 2;
//            if(arr[mid] == target){
//                last = mid;
//                low = mid + 1;
//            }
//            else if(arr[mid] < target){
//                low = mid + 1;
//            }else{
//                high = mid - 1;
//            }
//        }
//        return last;
//    }
//
//    public static int[] firstAndLastPosition(int[] arr, int target){
//        int first = firstOccurrence(arr, target);
//        if(first == -1)
//            return new int[] {-1, -1};
//        int last = lastOccurrence(arr, target);
//        return new int[] {first, last};
//    }
//
//    public static int count(int[] arr, int target){
//        int[] ans = firstAndLastPosition(arr, target);
//        if(ans[0] == -1)
//            return 0;
//        return (ans[1] - ans[0] + 1);
//    }
}
