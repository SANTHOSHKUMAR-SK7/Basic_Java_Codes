public class Formatted_Number {
    public static void main(String[] args) {
        int a=13;
        String str="Santho";
        float num=21.134f;
        System.out.printf("%d %n",a);

        System.out.printf("%s %n",str);

        System.out.printf("%.2f %n",num);

        System.out.printf("%.2f %n",Math.PI);

        System.out.printf("%5d %n",1);

        System.out.printf("%-5d %c%n",7,'.');

        System.out.println('A' + 1);

        for (int i = 0; i < 256 ; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println();

        for (int i = 'A'; i < 'Z'; i++) {
            System.out.print((int) i+" ");
        }
        System.out.println();

        for (int i = 'a'; i < 'z' ; i++) {
            System.out.print((int) i+" ");
        }
        System.out.println();


    }
}
