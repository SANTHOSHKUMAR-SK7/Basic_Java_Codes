interface Printable{
    void display();
}

interface Showable{
    void display();
}

class Document implements Printable,Showable{
    @Override
    public void display() {
        System.out.println("Overraided to avoid diamond problem");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Document d = new Document();
        d.display();
    }
}
