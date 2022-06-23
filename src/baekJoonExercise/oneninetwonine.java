package baekJoonExercise;
import java.util.Scanner;
public class oneninetwonine {
    public static boolean[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        arr = new boolean[N+1];
        isPrime();
        for (int i = M; i <= N; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }
    public static void isPrime() {
        arr[0] = true;
        arr[1] = true;
        for(int i=2; i<=Math.sqrt(arr.length); i++){
            if(arr[i]){
                continue;
            }
            for(int j = i*i; j < arr.length; j += i){
                arr[j] = true;
            }
        }
    }
}
