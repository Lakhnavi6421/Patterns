package BinarySearch.OneDimArrays;

public class PeakElement {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int[] arr = {1, 2, 3, 4, 5, 6, 20};
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr){
        // Brute force solution

        int n = arr.length;
        for(int i = 0 ; i < n ; i++){

            boolean left = (i == 0) || (arr[i] >= arr[i-1]);
            boolean right = (i == n-1) || (arr[i] >= arr[i+1]);

            if(left && right)
                return i;
        }
        return -1;

        // Optimal solution


    }
}
