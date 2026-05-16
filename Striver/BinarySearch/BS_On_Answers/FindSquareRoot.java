package BinarySearch.BS_On_Answers;

public class FindSquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(36));
    }

    public static int squareRoot(int n) {
//        Brute force approach

//        int result = 0;
//        for(int i = 1 ; i <= n ; i++){
////            check if i * i <= n
//            if((long)(i) * i <= n)
//                result = i;
//            else{
//                // break when i * i > n
//                break;
//            }
//        }
//        return result;

//        Optimal approach using Bs

        if(n < 2)
            return n;

        int left = 1, right  = n/2, ans = 0;
        while(left <= right){
//            find middle point
            long mid = left + (right - left) / 2;

            if(mid * mid <= n){
                ans = (int) mid;
                // move to right half
                left = (int) mid + 1;
            }
            else{
//                move to left half
                right = (int) mid - 1;
            }
        }
        return ans;
    }
}
