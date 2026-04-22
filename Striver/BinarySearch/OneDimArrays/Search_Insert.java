package BinarySearch.OneDimArrays;

public class Search_Insert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;

        int idx = searchInsert(arr, x);
        System.out.println("The index is: " + idx);
    }

    public static int searchInsert(int [] arr, int target){
        // Optimal solution
        int ans = arr.length;
        int low = 0, high = ans - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
