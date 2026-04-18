package Array.Medium;

import com.sun.source.tree.BreakTree;

public class Sort_Array_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        int res[] = sortZeroOneTwo(arr);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

    public static int[] sortZeroOneTwo(int[] arr){
        // Brute force algorithm
        // Use any sorting algo


        // Better approach using 3 Variable
//        int count0 = 0, count1 = 0, count2 = 0;
//
//        for(int i : arr){
//            if(i == 0)
//                count0++;
//            else if (i == 1)
//                count1++;
//            else
//                count2++;
//        }
//        int index = 0;
//        while (count0 --> 0){
//            arr[index++] = 0;
//        }
//
//        while (count1 --> 0){
//            arr[index++] = 1;
//        }
//
//        while (count2 --> 0){
//            arr[index++] = 2;
//        }
//        return arr;

        // Better approach 2
    }

}
