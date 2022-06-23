package baekJoonExercise;
import java.util.Scanner;
public class twosixthreezero {
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        board = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = sc.nextInt();
            }
        }
        getSquare(0, 0, N);
        System.out.println(white);
        System.out.println(blue);

    }
    public static void getSquare(int row, int col, int size){
        if(checkColor(row, col, size)){
            if(board[row][col] == 0){
                white++;
            }else{
                blue++;
            }
            return;
        }
        int newSize = size / 2;

        getSquare(row, col, newSize);
        getSquare(row, col + newSize, newSize);
        getSquare(row + newSize, col, newSize);
        getSquare(row + newSize, col + newSize, newSize);

    }
    public static boolean checkColor(int row, int col, int size){
        int color = board[row][col];
        for(int i=row; i < row + size; i++){
            for(int j=col; j < col + size; j++){
                if(board[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}
