import java.util.*;
public class workout7 {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the n1 :");
    int n=scan.nextInt();
    String result=(n<10)? "n is smaller than 10":"n is bigger than 10";
    System.out.println(result);
    scan.close();
}    
}
