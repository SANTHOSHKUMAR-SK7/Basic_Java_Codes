public class final_keyword {
    public static void main(String[] args) {

        Final_B B = new Final_B();

        B.dis();
        System.out.println(B.display());
    }
}

class Final_A{
    final int a = 7077;
    final String b = "Santho";



        String display(){
        return b;
    }

    final void dis(){
        System.out.println("Cant override this method outside of this class bcz thz is final method");
    }
}

class Final_B extends Final_A{
    int a = 77;

    //Cant override because it is declared as final
    /*void dis(){
        System.out.println("Cant override");
    }*/
}
