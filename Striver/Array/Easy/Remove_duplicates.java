package Array.Easy;

import java.util.HashSet;

public class Remove_duplicates {
    public static void main(String[] args) {
        int [] nums = {0,0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("Duplicates : " + k);
        System.out.println("Array after removing duplicates: ");
        for(int i = 0 ; i < k ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int nums[]){
        // Using Hashset to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();

        // Position to overwrite next unique element
        int index = 0;

        // Loop over each number in nums
        for(int num : nums){
            // If num is not in the set, it is unique
            if(!seen.contains(num)){
                seen.add(num);       // Add num to the set
                nums[index] = num;   // Write num at current index position
                index++;             // Move index forward
            }
        }
        return index;          // return number of unique elemnets
    }
}
