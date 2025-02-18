public class static_ {
    public static void main(String[] args) {
        System.out.println(Static_A.a);

        Static_B B = new Static_B();

        B.a=4; // When we create static variable or method,we can access that through class name instead of creating separate  object for tha class
        System.out.println(Static_A.a);
        System.out.println(B.a);
    }
}

class Static_A{
    static int a = 1;
    int b = 2;
}

class Static_B extends Static_A{

}
