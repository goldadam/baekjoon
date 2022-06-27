package baekJoonExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class onezeroninefour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(solve(x));
    }
    public static int solve(int X){
        int cnt = 0;
        int first = 64;
        while (X > 0){
            if(first > X){
                first /= 2;
            }else{
                cnt++;
                X -= first;
            }
        }
        return cnt;
    }
}
