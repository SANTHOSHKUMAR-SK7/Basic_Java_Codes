import java.util.*;
public class workout5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the nbr : ");
        int n=scan.nextInt();
        //AND operator -&&
        //OR operator -||
        if (n%3==0 && n%5==0){
            System.out.println("Its is divisible by both 3 and 5");
        }
        //Else if
        else if(n%3==0 || n%5==0){
            //Nested if condition
            if(n%3==0){
                System.out.println("It is divisible by 3");
            }
            else{
                System.out.println("It is divisible by 5");
            } 
        }
        else{
            System.out.println("Nope....!");
        }
        scan.close();
    }
}
