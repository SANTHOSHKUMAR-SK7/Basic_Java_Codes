interface A{
    void display();
}

public class lamda {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void display() {
                System.out.println("We can access the interface A method by this way");
                System.out.println("Thz is a method which can be access without creating a another class");
            }
        };
        obj.display();
    }
}
