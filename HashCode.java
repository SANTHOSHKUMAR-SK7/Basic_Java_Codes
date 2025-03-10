public class HashCode{
    int n;
    String str;
    HashCode(int num){
        this.n = num;
    }
    HashCode(String str){
        this.str=str;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        HashCode obj = new HashCode("SK");
        System.out.println(obj.hashCode());
        HashCode obj1 = new HashCode(12);
        System.out.println(obj1.hashCode());
        System.out.println(obj.getClass().getName());
    }
}