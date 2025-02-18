public class workout9 {
    public static void main(String[] args) {
        int i=1;
        int count3=0;
        int count5=0;
        int countNO=0;
        int countB=0;
        for(i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                countB=countB+1;
                System.out.println("Divisible both 3 and 5  :"+i);
            }
            else if (i%5==0) {
                count5=count5+1;
                System.out.println("Divisible by 5 : "+i);
            }
            else if(i%3==0) {
                count3=count3+1;
                System.out.println("Divisible by 3 : "+i);
            }
            else
            {
                countNO=countNO+1;
            }
        }
        System.out.println("Total numbers Divisible by 3 :"+count3);
        System.out.println("Total numbers Divisible by 5 :"+count5);
        System.out.println("Total numbers tht  divisible by both 3 and 5 :"+countB);
        System.out.println("Total numbers tht not divisible by 3 and 5 :"+countNO);
    }
    
}
