import java.util.Scanner;
class Session16{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Input Data: ");
        double Data = scanner.nextDouble();

        double inches = DataToInchesConverter.convertDataToInches(Data);
        System.out.printf("Distance of %.2f cms is = %.2f inches%n", Data, inches);

    }

    public class DataToInchesConverter {
    public static double convertDataToInches(double Data) {
        return Data / 2.54;  
    }


}
}