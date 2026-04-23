package BinarySearch.OneDimArrays;

import java.util.Arrays;
import java.util.List;

public class Last_Occurrence {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 12, 12, 12, 18, 19);
        int target = 19;

        System.out.println("The index of " + target + " is " + lastOccurrence(list, target));
    }

    public static int lastOccurrence(List<Integer> list, int target){
        // Brute force
//        int ans = -1;
//        for(int i = list.size() - 1 ; i >= 0 ; i--){
//            if(list.get(i) == target){
//                ans = i;
//                break;
//            }
//        }
//        return ans;

        // Optimal sol using binary search method

        int low = 0, high = list.size() - 1;
        int ans = -1;
        while (low <= high){
            int mid = low + ((high - low) / 2);

            if(list.get(mid) == target){
                ans = mid;
                low = mid + 1;
            }
            else if (list.get(mid) > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
