package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class Find_Majority_Element_occurs {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr){
        // Brute force approach
//        int n = arr.length;
//
//        for(int i = 0 ; i < n ; i++){
//            int count = 0;
//
//            for(int j = 0 ; j < n ; j++){
//                if(arr[i] == arr[j])
//                    count++;
//            }
//            if(count > (n/2))
//                return arr[i];
//        }
//        return -1;

        // Better approach using ** HASHMAP **

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (n/2))
                return it.getKey();
        }
        return -1;
    }
}
