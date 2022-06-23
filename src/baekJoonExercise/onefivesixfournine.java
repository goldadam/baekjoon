package baekJoonExercise;
import java.util.Scanner;
public class onefivesixfournine {

    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N];
        dictionary(N, M, 0);
    }
    public static void dictionary(int N, int M, int cnt){
        if(cnt == M){
            for(int c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[cnt] = i+1;
                dictionary(N, M, cnt+1);
                visited[i] = false;
            }
        }
    }
}



