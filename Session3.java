public class Session3 {
    public static void main(String[] args) {
       
        System.out.println("Employees ID =" + displayGood());
        System.out.printf("Salary = U$ %.2f", displayBad());
    }

    public static String displayGood() {
    return "0342";
    }

    public static double displayBad() {
        int amount = 1500;
        int workHour = 8;

        double salary = amount * workHour;
        return salary;
    }
}