package BinarySearch.OneDimArrays;

public class SearchInRotatedSortedArray1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("The index of element " + target + " is: " + searchElement(arr, target));
    }

    public static int searchElement(int[] arr, int target){

        // Brute force solution
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
