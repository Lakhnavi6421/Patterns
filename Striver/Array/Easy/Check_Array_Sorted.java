package Array.Easy;

public class Check_Array_Sorted
{
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 4, 6};
        System.out.println(sorted(arr, arr.length));
    }

    public static boolean sorted(int [] arr, int n){
        if(n == 0) return false;
        if(n == 1) return true;

        // Brute force (double traversal)
//        for(int i = 0 ; i < n ; i++){
//            for(int j = i+1 ; j < n ; j++){
//                if(arr[i] > arr[j])
//                    return false;
//            }
//        }
//        return true;

        // Optimal (single traversal)
        for(int i = 1; i < n ; i++){
            if(arr[i-1] > arr[i])
                return false;
        }
        return true;
    }
}
