import java.util.Scanner;
class workout{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        scan.nextLine();
        String Dept=scan.nextLine();
        String De=scan.nextLine();
        System.out.println("String"+name);
        System.out.println("age"+age);
        System.out.println("dept"+Dept); 
        System.out.println("de"+De);
        scan.close();
    }
            
}
   