import java.util.Scanner;

public class Session6{

    public static void printNotes(int amount) {
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("There are:");
        for (int note : notes) {
            int count = amount / note;
            System.out.printf("%d Note(s) of %d.00%n", count, note);
            amount = amount % note;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the amount: ");
        int amount = scanner.nextInt();
        printNotes(amount);
        scanner.close();
    }
}
