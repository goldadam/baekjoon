package baekJoonExercise;
import java.util.Scanner;


public class onefivesixfiveone {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        dfs(0);
        System.out.print(sb);
    }
    public static void dfs(int cnt){
        if(cnt == M){
            for(int i=0; i<M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }
        for(int i=1; i<=N; i++){
            arr[cnt] = i;
            dfs(cnt +1);
        }
    }
}
