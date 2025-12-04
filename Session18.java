import java.util.Scanner;

class Session18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value (negative): ");
        int value = scanner.nextInt();

        int absValue = kuhaonnatoangnegative(value);

        System.out.println("Original value = " + value);
        System.out.println("Absolute value = " + absValue);
    }


    public static int kuhaonnatoangnegative(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}