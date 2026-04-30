package BinarySearch.OneDimArrays;

public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr){
        // Brute force solution

        int minVal = arr[0];
        int minInd = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
                minInd = i;
            }
        }
        return minInd;


    }
}
