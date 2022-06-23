package baekJoonExercise;

import java.util.Scanner;
import java.util.ArrayList;
public class fourthreefourfour {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr;
         int test = sc.nextInt();
         for(int i=0; i<test; i++){
             int N = sc.nextInt();
             arr = new int[N];
             double sum = 0;

             for(int j=0; j <N; j++){
                 int val = sc.nextInt();
                 arr[j] = val;
                 sum += val;
             }
             double mean = (sum / N);
             double cnt = 0;
             for(int k=0; k <N; k++){
                 if(arr[k] > mean){
                     cnt++;
                 }
             }
             System.out.printf("%.3f%%\n", (cnt/N) *100);

         }
         sc.close();
    }
}
