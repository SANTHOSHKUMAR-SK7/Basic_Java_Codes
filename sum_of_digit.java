import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum = sum +(n%10);
            n = n/10;
        }
        System.out.println("The sum of number is : "+sum);
    }
}
