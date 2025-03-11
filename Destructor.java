public class Destructor {
    private String stdName;
    private int roll;
    private String dept;

    Destructor(String stdName,int roll,String dept){
        this.stdName=stdName;
        this.roll=roll;
        this.dept=dept;
        System.out.println("Std Name : "+stdName);
    }
     void destroy(){
         System.out.println("Obj destroyed "+stdName);
     }

    public static void main(String[] args) {
        Destructor obj = new Destructor("SK",48,"CSE");
        obj.destroy();
        obj=null;
        obj.destroy();
        System.gc();

    }

}
