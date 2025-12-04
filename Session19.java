import java.util.Scanner;

class Session19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first integer : ");
        int first = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int second = scanner.nextInt();

        if (ogmatimes(first, second)) {
            System.out.println(first + " is a multiple of " + second + ".");
        } else {
            System.out.println(first + " is not a multiple of " + second + ".");
        }

        
    }

    public static boolean ogmatimes(int a, int b) {
        if (b == 0) {
            return false;  
        }
        return (a % b) == 0;
    }
}