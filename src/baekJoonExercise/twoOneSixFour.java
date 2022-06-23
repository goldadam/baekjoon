package baekJoonExercise;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class twoOneSixFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] res = new int[2*N];
        for(int i = 1; i <= N; i++){
            res[i] = i;
        }
        int prevIndex = 1;
        int lastIndex = N;
        do{
            prevIndex++;
            res[lastIndex+1] = res[prevIndex];
            lastIndex++;
            prevIndex++;
            N--;
        }while (N > 1);
        System.out.print(res[prevIndex]);
    }


}
