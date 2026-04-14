package Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Union_of_two_sorted_array {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 7};

        List<Integer> result = unionOfSortedArray(arr1, arr2);
        System.out.println("array 1:");
        for(int i : arr1)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("array 1:");
        for(int i : arr2)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Union:");
        for(int i : result)
            System.out.print(i + " ");
        System.out.println();

    }

    public static List<Integer> unionOfSortedArray(int[] arr1, int [] arr2){
        // Brute force approach using Map
        // count freq of value
//        HashMap<Integer, Integer> freq = new HashMap<>();
//
//        // store values of arr1 and arr2 in union
//        List<Integer> union = new ArrayList<>();
//
//        for(int i = 0 ; i < arr1.length ; i++)
//            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
//
//        for(int i = 0 ; i < arr2.length ; i++)
//            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
//
//        for(int i : freq.keySet()){
//            union.add(i);
//        }
//        return union;
//

        // Optimal approach using Set

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0 ; i < arr1.length ; i++)
            set.add(arr1[i]);
        for(int i = 0 ; i < arr2.length ; i++)
            set.add(arr2[i]);

        for(int i : set)
            union.add(i);
        return union;
    }
}
