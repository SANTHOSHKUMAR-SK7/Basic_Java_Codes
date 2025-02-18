public class workout8 {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)//Prints even number
            {
                evencount=evencount+1;//Count Totel even number
                System.out.println("EVEN NUMBER:"+i);
            }
            else//Prints odd number
            {
                oddcount=oddcount+1;//Count total odd number
                System.out.println("ODD NUMBER:"+i);
            }
        }
        System.out.println("Total even numbers :" + evencount);
        System.out.println("Total odd numbers :" + oddcount);
    }
}
