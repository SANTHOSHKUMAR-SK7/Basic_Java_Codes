import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int[][] MulArr = new int[3][3];
        Scanner scan = new Scanner(System.in);

        for(int row=0;row<MulArr.length;row++){
            for(int col=0;col<MulArr[row].length;col++){
                System.out.print("Enter the value for "+row+" "+col+" : ");
                MulArr[row][col]=scan.nextInt();
            }
        }
        for(int row=0;row<MulArr.length;row++){
            for(int col=0;col<MulArr[row].length;col++){
                System.out.print(MulArr[row][col]+"  ");
            }
            System.out.println();
        }
    }
}
