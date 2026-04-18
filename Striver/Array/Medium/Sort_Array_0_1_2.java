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

//        int cnt0= 0, cnt1= 0, cnt2= 0;
//        for(int i : arr){
//            if(i == 0)
//                cnt0++;
//            else if (i == 1)
//                cnt1++;
//            else
//                cnt2++;
//        }
//
//        for(int i = 0 ; i < cnt0 ; i++)
//            arr[i] = 0;
//        for(int i = cnt0 ; i < cnt0 + cnt1 ; i++)
//            arr[i] = 1;
//        for(int i = cnt0 + cnt1 ; i < arr.length ; i++)
//            arr[i] = 2;
//
//        return arr;

        /////////////////////////////////////////////////
        // Optimal approach

        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }


}
