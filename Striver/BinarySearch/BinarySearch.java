package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {2, 3, 4, 10, 40, 47};
        int n = arr.length;
        int x = 10;
        int res = binarySearch(arr, 0, n -1, x);
        System.out.println("Element to be searched is : " + x);

        if(res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index : " + res);
    }

    public static int binarySearch(int [] arr, int left, int right, int x){
        // ****** ITERATIVE METHOD ********

        while(left <= right){
            int mid = (left + right) / 2;

//            index of element returned
            if(arr[mid] == x)
                return mid;

            else if (arr[mid] > x)
                right = mid - 1;

            else
                left = mid + 1;
        }
        return -1;
    }
}
