 class Ab {
    public static void main(String[] args) {

//        demo d = new demo();   we cant create object for abstract class
        chk c = new chk();

        c.add();
        c.sub();

        chk2 c2 = new chk2();

        c2.add();
        c2.sub();
    }
}

//ABSTRACT CLASS
abstract class demo{
    void add(){
        System.out.println("ADD FUNCTION FROM demo class");
    }
    abstract void sub(); //ABSTRACT METHOD...We have to overaid thz method for upcoming created class
}

class chk extends demo{

    void add(){
        System.out.println("ADD FUNCTION FROM chk class");
    }

    //OVERRIDE FROM ABSTRACT CLASS
    void sub(){
        System.out.println("SUB FUNCTION FROM chk class");
    }

}

class chk2 extends demo{

    void add(){
        System.out.println("ADD FUNCTION FROM chk2 class");
    }

    //OVERRIDE FROM ABSTRACT CLASS
    void sub(){
        System.out.println("SUB FUNCTION FROM ch2 class");
    }
}