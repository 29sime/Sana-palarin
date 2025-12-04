import java.util.Scanner;

class Session10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT = 1234;
        int input;

        while (true) {
            System.out.print("Input the password: ");
            input = scanner.nextInt();
            if (input == CORRECT) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Incorrect password");
            }
        }

        scanner.close();
    }
}