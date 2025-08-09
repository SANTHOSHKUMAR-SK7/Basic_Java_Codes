import java.util.Scanner;
class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1=in.nextInt();
        int temp,rem=0,add=0;
        temp=num1;
        while(temp>0){
            rem=temp%10;
            add+=rem;
            temp/=temp;
        }
        if(num1==add){
            System.out.println("armstrong");
        }
    }
}
