import java.util.Scanner;

class Session20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some text:\n");
        String text = scanner.nextLine();

        printWord(text);
    }
        

    public static void printWord(String text) {
        
        String[] words = text.split("\\s+");  

        for (String word : words) {
            System.out.println(word);
        }
    }
}