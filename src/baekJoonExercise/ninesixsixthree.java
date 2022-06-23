package baekJoonExercise;
import java.util.Scanner;
public class ninesixsixthree {
    public static int[] arr;
    public static int N;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        checkQueen(0);
        System.out.println(cnt);
    }

    public static void checkQueen(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (Possible(depth)) {
                checkQueen(depth + 1);
            }
        }

    }

    public static boolean Possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
