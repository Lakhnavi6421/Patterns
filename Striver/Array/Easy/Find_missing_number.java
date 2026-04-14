package Array.Easy;

public class Find_missing_number {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[] arr){
        int n = arr.length + 1;
        for(int i = 1 ; i <= n ; i++){
            boolean found = false;

            // check if 'i' exists in array using Linear search
            for(int j = 0 ; j < n - 1; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found)
                return i;
        }
        return -1;
    }
}
