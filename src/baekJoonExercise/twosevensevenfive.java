package baekJoonExercise;
import java.util.Scanner;
public class twosevensevenfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =0;
        int N = sc.nextInt();
        int[][] apart = new int[15][15];
        for(int i=0; i<15; i++){
            apart[i][1] = 1;
            apart[0][i] = i;
        }
        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }
        for(int i=0; i<N; i++){
            int K = sc.nextInt();
            int n = sc.nextInt();
            res = apart[K][n];
            System.out.println(res);
        }

    }
}
