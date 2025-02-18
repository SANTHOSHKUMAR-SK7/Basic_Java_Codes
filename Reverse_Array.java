import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        String a = "Santho";
//        String b = " ";
//        for (int i = a.length()-1; i >= 0; i--){
//            b += a.charAt(i);
//        }
//        System.out.println(b);

//        Method-2

//        char[] arr = a.toCharArray();
//        int right=a.length()-1;
//        int left=0;
//
//        while(left<right){
//            char temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//
//            left++;
//            right--;
//        }
//
//        String array = Arrays.toString(arr);
//
//        System.out.println(array);

//        method 3

        String reverse = new StringBuffer(a).reverse().toString();
        System.out.println(reverse);
    }
    }

