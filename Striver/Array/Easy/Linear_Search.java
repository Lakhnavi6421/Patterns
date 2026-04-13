package Array.Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {4, 2, 56, 38, 63, 12, 8, 55};
        int num = 55;
        System.out.println("The index of " + num + " is: " + linearSearch(arr, num));
    }

    public static int linearSearch(int [] arr,int num){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == num)
                return i+1;
        }
        return -1;
    }
}
