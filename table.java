import java.util.*;
class table
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your table:");
        int j = scan.nextInt();
        System.out.println("Your table is : "+j);
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+j+"="+i*j);
        }
        scan.close();
    }
}

