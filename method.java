public class method {
    public static void main(String[] args) {
        add();
        System.out.println(sub());
    }
    public static void add(){
       int a = 10;
       int b = 10;
        System.out.println(a+ " + "+b+" = "+(a+b));
    }
     static int sub(){
        int a = 10;
        int b = 19;
        return b-a;
    }
}
