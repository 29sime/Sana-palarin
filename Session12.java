import java.util.Scanner;

class Session12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        double x = scanner.nextDouble();

        System.out.print("y: ");
        double y = scanner.nextDouble();

        double result = divide(x, y);
        if (Double.isNaN(result)) {
            System.out.println("Division is not possible");
        } else {
            System.out.println(result);
        }

    }

    
    public static double divide(double x, double y) {
        if ( x == 0) {
            return Double.NaN;  
        }
        return x / y;
    }
}