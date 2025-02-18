import java.util.Scanner;

public class EvenOdd{
    void EO(double num)
    {
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double i=scan.nextInt();
        EvenOdd f = new EvenOdd();
        f.EO(i);
        scan.close();
    }
}
