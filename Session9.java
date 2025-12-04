import java.util.Scanner;

public class Session9 {

    public static void countPosNeg(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
            
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Input the first number: ");
        nums[0] = scanner.nextInt();

        System.out.print("Input the second number: ");
        nums[1] = scanner.nextInt();

        System.out.print("Input the third number: ");
        nums[2] = scanner.nextInt();

        System.out.print("Input the fourth number: ");
        nums[3] = scanner.nextInt();

        System.out.print("Input the fifth number: ");
        nums[4] = scanner.nextInt();

        countPosNeg(nums);

        scanner.close();
    }
}
