public class super_keyword {
    public static void main(String[] args) {

        Super_B b = new Super_B();
        System.out.println(b.a);
    }
}

class Super_A{
    int a = 7;
    void display(){
        System.out.println("This is Parent class");
    }
}

class Super_B extends Super_A{
    int a = 8;

    void display(){
        System.out.println("This is child class");
        System.out.println(super.a);
    }

}