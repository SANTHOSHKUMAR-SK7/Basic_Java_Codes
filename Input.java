import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();  // Reads one word

        System.out.print("Enter a full sentence: ");
        sc.nextLine();  // Clear buffer after next()
        String sentence = sc.nextLine();  // Reads full line

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Reads an integer

        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();  // Reads a double

        System.out.print("Enter true or false: ");
        boolean bool = sc.nextBoolean();  // Reads boolean

        System.out.println("\nYour Inputs:");
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Boolean: " + bool);

        sc.close();  // Always close Scanner to prevent memory leaks
    }
}
