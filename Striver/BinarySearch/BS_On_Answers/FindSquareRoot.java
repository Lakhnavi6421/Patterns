package BinarySearch.BS_On_Answers;

public class FindSquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(32));
    }

    public static int squareRoot(int n) {
        int result = 0;
        for(int i = 1 ; i <= n ; i++){
//            check if i * i <= n
            if((long)(i) * i <= n)
                result = i;
            else{
                // break when i * i > n
                break;
            }
        }
        return result;
    }
}
