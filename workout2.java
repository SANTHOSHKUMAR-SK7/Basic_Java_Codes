import java.util.Scanner;
class workout2{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        int d=a*b*c;
        System.out.println("Multiplication "+d);
        int e=a+b+c;
        System.out.println("Addition "+e);
        float f=d/e;
        System.out.println("Division "+f);
        n.close();

    }
}