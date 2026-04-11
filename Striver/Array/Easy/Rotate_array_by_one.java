package Array.Easy;

public class Rotate_array_by_one {
    public static void main(String[] args) {
        int [] arr = {1,2,3, 4, 5, 6};   // Original array
        System.out.println("Array before rotation");
        for(int i : arr)
            System.out.print(i +  " ");
        System.out.println();
        int result[] = leftRotateByOne(arr, arr.length);
        System.out.println("Array after rotation");
        for(int i : result)
            System.out.print(i + " ");
        System.out.println();


        // Right rotate
        int [] arr2 = {1,2,3,4,5,6};
        System.out.println("Array before rotation");
        for(int i : arr2)
            System.out.print(i + " ");
        System.out.println();
        int result2[] = rightRotateByOne(arr2, arr2.length);
        System.out.println("Array after rotation");
        for(int i : result2)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int [] leftRotateByOne(int[] arr, int n){
        // Brute force using another array
//
//        int temp[] = new int[n];      // Temporary array to stroe shifted elements
//
//        // Shift elements to the left by one position
//        for(int i= 1 ; i < n; i++){
//            temp[i - 1] = arr[i];
//        }
//        temp[n-1] = arr[0];       // First element moves to the last position
//
//        return temp;

        // Optimal approach

        // Store the first element in temp variable
        int temp = arr[0];

        // Shift element to the left
        for(int i = 1 ; i < arr.length ; i++){
            arr[i - 1] = arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] rightRotateByOne(int [] arr, int n){
        // Brute force using another array
//        int temp[] = new int[n];

        // Shift elements to the right by one position

//        for(int i = 0; i < n-1 ; i++){
//            temp[i + 1] = arr[i];
//        }
//        temp[0] = arr[n-1];
//        return temp;


        // Optimal approach

        int temp = arr[n-1];
        for(int i = n-1 ; i > 0 ; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
        return arr;
    }
}
