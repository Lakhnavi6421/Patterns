class Medium_Pattern{
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        pattern4(5);
    }

    public static void pattern1(int n){
        for(int i = 1; i <= n ; i++){
            int num;
            if(i %2 == 0)
                num = 0;
            else
                num = 1;
            for(int j = 1; j <= i ; j++){
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++)
                System.out.print(j);
            for(int b = 1 ; b <= (n-i)*2 ; b++)
                System.out.print("_");
            for(int j = i ; j >=1 ; j--)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void pattern3(int n){
        int val = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j =  1 ; j <= i ; j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 1 ; i <= n ; i++){
            char ch = 'A';
            for(int j = 1; j <= i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}