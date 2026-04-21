package BinarySearch.OneDimArrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int []arr = {2, 3, 4, 10, 40, 47};
//        int n = arr.length;
//        int x = 4;
//        int res = binarySearch(arr, 0, n -1, x);

//        System.out.println("Element to be searched is : " + x);
//
//        if(res == -1)
//            System.out.println("Element is not present in the array");
//        else
//            System.out.println("Element is present at index : " + res);


        // ***** IN BUILD METHODS *****

        int [] arr = {10, 20, 15, 4, 18};

        // sorting the array
        Arrays.sort(arr);

        int x = 15;
        int res = Arrays.binarySearch(arr, x);
        System.out.println("Element to be searched is : " + x);

        if(res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index : " + res);
    }

    public static int binarySearch(int [] arr, int left, int right, int x){
        // ****** ITERATIVE METHOD ********

//        while(left <= right){
//            int mid = (left + right) / 2;
//
////            index of element returned
//            if(arr[mid] == x)
//                return mid;
//
//            else if (arr[mid] > x)
//                right = mid - 1;
//
//            else
//                left = mid + 1;
//        }
//        return -1;


        // ***** RECURSIVE METHOD *****

        if(right >= left){
            int mid = left + (right - left) / 2;

            if(arr[mid] == x)
                return mid;

            if(arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            return binarySearch(arr, mid + 1, right , x);
        }
        return -1;
    }
}
