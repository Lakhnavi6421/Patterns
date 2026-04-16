package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class Find_Majority_Element_occurs {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));

        int[] arr2 = {4, 4, 2, 4, 3, 4, 4, 3, 2, 4};
        System.out.println(majorityElement(arr2));
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

//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0 ; i < n ; i++){
//            int val = map.getOrDefault(arr[i], 0);
//            map.put(arr[i], val + 1);
//        }
//
//        for(Map.Entry<Integer, Integer> it : map.entrySet()){
//            if(it.getValue() > (n/2))
//                return it.getKey();
//        }
//        return -1;

        // Optimal approach Using Moore's voting algo

        int count = 0, el = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(count == 0){
                count = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                count++;
            }
            else
                count--;
        }

        int count1 = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == el)
                count1++;
        }
        if(count1 > (n/2))
            return el;

        return -1;
    }
}
