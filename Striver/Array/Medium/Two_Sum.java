package Array.Medium;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int k = 14;
        int result[] = twoSum(arr, k);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int []arr, int k){
//        Brute force approach using Two Loops
//        int n = arr.length;
//        for(int i = 0 ; i < n ; i++){
//            for(int j = i +1 ; j < n ; j++){
//                if(arr[i] + arr[j] == k)
//                    return new int[]{i, j};
//            }
//        }
//        return new int[]{-1, -1};     // No solution found

        // Better sol ** HashMap **

        int n = arr.length;
        int [] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int needed = k - num;
            if(map.containsKey(needed)){
                ans[0] = map.get(needed);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
}
