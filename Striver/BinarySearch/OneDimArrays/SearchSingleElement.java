package BinarySearch.OneDimArrays;

public class SearchSingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(searchElement(arr));
    }

    public static int searchElement(int[] arr){
        // Brute force solution

        int n = arr.length;
        if(n == 1) return arr[0];

        for(int i = 0 ; i < n ; i++){
            // Check if it's the first element and not equal to the next
            if(i == 0){
                if(arr[i] != arr[i+1])
                    return arr[i];
            }

            // Check if it's the last element and not equal to the previous
            else if(i == n-1){
                if(arr[i] != arr[i-1])
                    return arr[i];
            }

            // Check if it's the current element and is not equal to the both neighbours
            else{
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
                    return arr[i];
            }
        }
        return -1;
    }
}
