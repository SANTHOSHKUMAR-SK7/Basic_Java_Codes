import java.util.Arrays;
import java.util.Scanner;

/*public class Reverse_String {
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
}*/


/*
public class Reverse_String{
    public static void main(String[] args) {
        String str = "Hey Its Santhosh";
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        System.out.println(reverse.toString());
    }
}*/

/*public class Reverse_String{
    public static void main(String[] args) {
        String str = "Hey Itz Santhosh";
        char[] ch=new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            ch[j]=str.charAt(i);
            j++;
        }
        System.out.println(new String(ch));
    }
}*/

/*public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hey Itz Santhosh";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}*/

/*public class Reverse_String {
    public static void main(String[] args) {
        char[] ch ={'s','a','n'};
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}*/

public class Reverse_String {
    public static void main(String[] args) {
        String str = "santhosh";
        char[] ch = str.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
