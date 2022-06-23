package baekJoonExercise;
import java.util.Scanner;
public class onefivesixfivezero {
    public static int[] arr;
    public static int N;
    public static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        dictionarytwo(1, 0);
    }
    public static void dictionarytwo(int j, int depth){
        if(depth == M){
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for(int i = j; i <= N; i++){
            arr[depth] = i;
            dictionarytwo(i+1, depth+1);
        }
    }
}




