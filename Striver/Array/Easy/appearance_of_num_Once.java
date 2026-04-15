package Array.Easy;

public class appearance_of_num_Once
{
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2};
        System.out.println(getSingleElement(arr));

    }

    public static int getSingleElement(int[] arr){
        // Brute force approach using *** LINEAR SEARCH ***

//        int n = arr.length;
//        for(int i = 0 ; i < n ; i++){
//            int num = arr[i];
//            int count = 0;
//
//            // count how many times num occurs
//            for(int j = 0 ; j < n ; j++){
//                if(arr[j] == num)
//                    count++;
//            }
//
//            // If only once, return it
//            if(count == 1)
//                return num;
//        }
//        return -1;

        // Better approach using  *** HASHING ***

        // step 1: find the maximum element
//        int max = arr[0];
//        for(int i : arr)
//            max = Math.max(max, i);
//
//        // step 2: create freq array of size max + 1
//        int[] hash = new int[max + 1];
//
//        // Step 3: count frequencies
//        for(int i : arr)
//            hash[i]++;
//
//        // Step 4: find element with frequency = 1
//        for(int i : arr){
//            if(hash[i] == 1)
//                return i;
//        }
//        // fallback
//        return -1;


        // Optimal approach Using *** XOR ***

        // XOR all elements — duplicates cancel each other out
        int xor = 0;
        for(int num : arr)
            xor = xor ^ num;
        return xor;
    }
}
