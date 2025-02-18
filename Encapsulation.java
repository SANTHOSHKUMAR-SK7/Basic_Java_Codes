

class Arithematic{

    void add(int a,int b)
    {
        int c =a+b;
        System.out.println("ADDITION : " +c);
    }

    void sub(int a,int b)
    {
        int c =a-b;
        System.out.println("SUBTRACTION : " +c);
    }

    void mul(int a,int b)
    {
        int c =a*b;
        System.out.println("MULTIPLICATION : " +c);
    }
}

class Relational{
    int a = 7;
    int b= 8;
    boolean c;
    void display(){
        System.out.println("This is relational operator class");
        System.out.println("The value of a is "+a+" and b is "+b);
        System.out.println("a<b "+(a<b));
        System.out.println("a>b "+(a>b));
    }
}

public class Encapsulation {
    public static void main(String[] args) {
    Arithematic ar = new Arithematic();
    Relational re = new Relational();

    ar.add(7,7);
    ar.mul(7,7);
    ar.sub(7,0);

    re.display();
    }
}