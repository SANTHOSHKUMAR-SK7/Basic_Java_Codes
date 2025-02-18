import java.util.Scanner;

public class XO_GAME{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] board= new char[3][3];//Board

        for(int row = 0;row< board.length;row++){                //Board Initialization
            for(int col=0;col< board[row].length;col++){
                board[row][col]=' ';
            }
        }

        char player = 'X';
        boolean GameResult=false;

        while (!GameResult){
            PrintBoard(board);

            System.out.print("Now "+player+ "'s Move!! (rows&cols) : ");

            int row = scan.nextInt();
            int col = scan.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                if(isWon(board,player)) {
                    System.out.println("HEY YOU " + player + "! WON THE BATTLE!!");
                    PrintBoard(board);
                    GameResult = true;
                } else if (isFull(board)) {
                    System.out.println("Oh no!!Match draw!!!");
                    PrintBoard(board);
                    GameResult=true;
                }
                else {
                    player=(player=='X'?'0':'X');
                }
            }
            else{
                System.out.println("Invalid move bhaiiii!Do correct move ");
            }
        }


    }

    public static void PrintBoard(char[][] board){
        for(int row = 0;row< board.length;row++){                //Board Initialization
            for(int col=0;col< board[row].length;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    public static boolean isWon(char[][] board,char player){
        for(int row = 0;row<board.length;row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for(int col = 0;col<board[0].length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player || board[0][2]==player && board[1][1]==player && board[2][1]==player ){
            return true;
        }
        return false;
    }

    public static boolean isFull(char[][] board){

        boolean FULLorNOT = true;
        for(int row = 0 ;row< board.length;row++){
            for(int col = 0 ; col< board.length;col++){
                if(board[row][col]==' '){
                     FULLorNOT=false;
                    break;
                }
                }
            if(!FULLorNOT){
                break;
            }
        }
        return FULLorNOT;
    }
}