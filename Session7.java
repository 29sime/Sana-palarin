import java.util.Scanner;

public class Session7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int[] hms = convertSeconds(totalSeconds);
        int hours = hms[0];
        int minutes = hms[1];
        int seconds = hms[2];

        System.out.println("There are:");
        System.out.printf("H:M:S - %d:%d:%d\n", hours, minutes, seconds);

        
    }

    public static int[] convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;
        return new int[]{hours, minutes, seconds};
    }

}