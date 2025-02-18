import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a String : ");
        char[] s = scan.nextLine().toCharArray();
        System.out.print("The reversed String is : ");

        for(int i =s.length-1;i>=0;i--)
        {
            System.out.print(s[i]);
        }

    }
}
