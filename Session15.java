import java.util.Scanner;

class Session15  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = Sirnaanisagolchatgptkaydinamadasabrain(arr);
        int minValue = arr[index];
        int position = index + 0;   

        System.out.println("Smallest Value: " + minValue);
        System.out.println("Position of the element: " + position);

    }

    public static int Sirnaanisagolchatgptkaydinamadasabrain(int[] arr) {
        int minIndex = 0;               
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;

    }
}