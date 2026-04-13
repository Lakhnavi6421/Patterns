package Array.Easy;

public class Move_Zeros_to_the_end
{
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 0, 0, 3, 0, 12};
        int[] result = moveZeros(arr);
        for(int i : result)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int[] moveZeros(int[] arr){
        // Brute force using temporary array
        int[] temp = new int[arr.length];

        // Pointer for temp
        int index = 0;

        // Traverse input array
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy temp back to original array
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = temp[i];

        return arr;
    }
}
