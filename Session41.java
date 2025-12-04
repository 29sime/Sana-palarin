import java.util.Scanner;

class Session41 {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.err.println("WELCOME TO NICO'S COMPUTING AREA OF THE CIRCLE PROGRAM");
    System.out.print("Input length: ");
    int length = scanner.nextInt();

    System.out.print("Input width: ");
    int width = scanner.nextInt();
    
    int area = (int) getArea(length, width);
    System.out.println("The area is : " + area);



    }
    public static float getArea(int length, int width) {
        return length * width;
    }
}