public class StringBufferSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append("sk");
        sb.append(5);
        String str = sb.toString();
        System.out.println(str);
    }
}
