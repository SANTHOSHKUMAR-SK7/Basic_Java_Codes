import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        char [][] board = new char[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        while (!gameOver){
            printBoard(board);
            System.out.println("Player "+player+" Enter your move :");
            int row = in.nextInt();
            int col = in.nextInt();
            if(board[row][col] == ' '){
                board[row][col] =player;
                if(haveWon(board,player)){
                    System.out.println("Hurray !!");
                    System.out.println("Player "+player+" has won:");
                    printBoard(board);
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    System.out.println("Match Draw ");
                    printBoard(board);
                    gameOver=true;
                } else{
                    player = (player == 'X')?'O':'X';
                }
            }else {
                System.out.println("Invalid Move, Try again");
            }
        }

    }
    public static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
    public static boolean haveWon(char[][]board, char player){
        for (int row = 0; row < board.length; row++) {
            if(board[row][0]== player && board[row][1]== player && board[row][2]== player){
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col]== player && board[1][col]== player && board[2][col]== player){
                return true;
            }
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player ){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player ){
            return true;
        }
        return false;
    }
    public static boolean isBoardFull(char[][] board) {
        boolean isFull = true; // Assume the board is full to start with

        // Iterate through the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    isFull = false; // Found an empty space, so the board isn't full
                    break; // No need to check further, break out of the loop
                }
            }
            if (!isFull) {
                break; // Exit outer loop as well if we found an empty space
            }
        }
        return isFull; // If no empty space is found, isFull will remain true
    }

}
