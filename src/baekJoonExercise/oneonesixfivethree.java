package baekJoonExercise;
import java.util.ArrayList;
import java.util.Scanner;
public class oneonesixfivethree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i=2; i * i <= N; i++){
            while(N % i==0){
                sb.append(i).append('\n');
                N /= i;
            }
            if(N != 1){
                sb.append(N);
            }
        }
        System.out.println(sb);
    }
}
