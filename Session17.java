import java.util.Scanner;

 class Session17 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        int reversedNum = reverse(num);

        System.out.println("The original number = " + num);
        System.out.println("The reverse of the said number = " + reversedNum);

    
    }

    public static int reverse(int n){
        int rev = 0;
        int rem;


        boolean isNegative = (n < 0);
        if (isNegative) {
            n = -n;
        }

        while (n > 0) {
            rem = n % 10;             
            rev = rev * 10 + rem;     
            n = n / 10;              
        }
 return rev;
    }
 }