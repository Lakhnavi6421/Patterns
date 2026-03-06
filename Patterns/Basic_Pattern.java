class Basic_Pattern{
    public static void main(String args[]){
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        pattern10(5);
    }

    public static void pattern1(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i = 1 ; i <= n ; i++){
            int val = 1;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
    
    public static void pattern4(int n) {
        int val = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(val);
            }
            val++;
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i = n ; i >= 1 ; i--){
            int val = 1;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i = 1 ; i <= n ; i++){
            // x is blank space before star in each row
            for(int x = 1 ; x <= n-i ; x++)
                System.out.print("_");
            for(int j = 1 ; j < i*2 ; j++)
                System.out.print("*");
            // y is blank space after star in each row
            for(int y = 1 ; y <= n-i ; y++)
                System.out.print("_");
            System.out.println(); // this will keep cursor to the new row
        }
    }

    public static void pattern8(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int x = 1 ; x < i ; x++)
                System.out.print("_");
            for(int j = n*2 - i ; j >= i ; j--)
                System.out.print("*");
            for(int y = 1 ; y < i ; y++)
                System.out.print("_");
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i = 1 ; i <= n ; i++){
            // x is blank space before star in each row
            for(int x = 1 ; x <= n-i ; x++)
                System.out.print("_");
            for(int j = 1 ; j < i*2 ; j++)
                System.out.print("*");
            // y is blank space after star in each row
            for(int y = 1 ; y <= n-i ; y++)
                System.out.print("_");
            System.out.println(); // this will keep cursor to the new row
        }

        for(int i = 1 ; i <= n ; i++){
            for(int x = 1 ; x < i ; x++)
                System.out.print("_");
            for(int j = n*2 - i ; j >= i ; j--)
                System.out.print("*");
            for(int y = 1 ; y < i ; y++)
                System.out.print("_");
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = n-i ; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}