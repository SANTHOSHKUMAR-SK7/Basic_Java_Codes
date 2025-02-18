interface B{
    void display();

    default void dis(){
        System.out.println("Default method");
    }

    static void disp(){
        System.out.println("Static Method");
    }
}

public class lamda_1 {
    public static void main(String[] args) {

        B obj =()->{System.out.println("This process is known as lamda");};

        obj.display();
        obj.dis();
        B.disp();
    }
}
