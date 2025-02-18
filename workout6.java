import java.util.*;
public class workout6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if(s.equalsIgnoreCase("RED")){
            System.out.println("STOP");
        }        
        else if(s.equalsIgnoreCase("YELLOW")){
            System.out.println("WAIT");
        }
        else if(s.equalsIgnoreCase("GREEN")){
            System.out.println("GO");
        }
        else{
            System.out.println("EAT 5 STAR,DO NOTHING");
        }
scan.close();
    }
    
}
