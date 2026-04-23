package BinarySearch.OneDimArrays;

public class Last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1, 4, 12, 12, 12, 18, 19};
        int target = 12;

        System.out.println("The index of " + target + " is " + lastOccurrence(arr, target));
    }

    public static int lastOccurrence(int arr[], int target){
        // Brute force
        int ans = -1;
        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
