package BinarySearch.OneDimArrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int target = 2;
        int idx = lowerBound(arr, target);
        System.out.println("Index " + idx + " is the smallest index such that arr[" + idx + "] >= " + target);

        int[] arr2 = {3, 5, 8, 15, 19};
        target = 9;
        idx = lowerBound(arr2, target);
        System.out.println("Index " + idx + " is the smallest index such that arr[" + idx + "] >= " + target);
    }

    public static int lowerBound(int [] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= target)
                return i;
        }
        return arr.length;
    }
}
