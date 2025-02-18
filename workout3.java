import java.util.Scanner;
class workout3{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        double mark=scan.nextDouble();
        scan.nextLine();
        String dept=scan.nextLine();
        System.out.println("Name is "+name);
        System.out.println("Mark out of 10 "+mark/10);
        System.out.print("Department is "+dept);
        scan.close();

    }
}