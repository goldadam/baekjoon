package baekJoonExercise;
import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

public class onezeroeightfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int x = sc.nextInt(); //6
        int y = sc.nextInt(); // 2
        int w = sc.nextInt(); //10
        int h = sc.nextInt(); //3
        int x_min = Math.min(x, w-x);
        int y_min = Math.min(y, h-y);
        int res = Math.min(x_min, y_min);
        System.out.println(res);


    }
}
