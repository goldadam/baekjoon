package baekJoonExercise;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class oneonesixfiveone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] array = new int[N][2];
        for(int i=0; i < N; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        Arrays.sort(array, (e1,e2) -> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }else{
                return e1[1] - e2[1];
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N; i++){
            sb.append(array[i][0] + " " + array[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
