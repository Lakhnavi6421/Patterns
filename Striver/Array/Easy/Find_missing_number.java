package Array.Easy;

public class Find_missing_number {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[] arr){
        // Brute force

//        int n = arr.length + 1;
//        for(int i = 1 ; i <= n ; i++){
//            boolean found = false;
//
//            // check if 'i' exists in array using Linear search
//            for(int j = 0 ; j < n - 1; j++){
//                if(arr[j] == i){
//                    found = true;
//                    break;
//                }
//            }
//            if(!found)
//                return i;
//        }
//        return -1;

//        Optimal approach
        // Calculate sum of first N natural numbers
//        int n = arr.length + 1;
//        int sum = (n * (n + 1))/2;
//
//        int actualSum = 0;
//        for(int i = 0 ;i < n - 1; i++)
//            actualSum += arr[i];
//
//        // difference is the missing number
//        return sum - actualSum;

        // Optimal approach 2 using XOR operator

        int n = arr.length + 1;
        int xor1 = 0, xor2 = 0;
        // xor all the elements & numbers from 1 to n-1
        for(int i = 0 ; i < n - 1 ; i++){
            xor2 ^= arr[i];    // xor of array elements
            xor1 ^= (i+1);     // xor of numbers from 1 to n-1
        }

        xor1 ^= n;      // include n in the xor
        // xor of xor1 and xor2 gives the missing number

        return xor1 ^ xor2;
    }
}
