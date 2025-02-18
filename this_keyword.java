public class this_keyword {
    public static void main(String[] args) {

    This_A A = new This_A();
    A.print(7077,"Santho");
        System.out.println(A);
    }
}

class This_A{
    int a = 7;
    String b;
    void print(int a,String b){
        this.a=a;  //Thz helps to refer the instance variable
        this.b=b;
        System.out.println(a);
    }
}
