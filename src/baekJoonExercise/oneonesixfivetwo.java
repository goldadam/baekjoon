package baekJoonExercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
public class oneonesixfivetwo {
    static int N;
    public static void main(String[] args) throws IOException {
        int cnt = 1;
        int MAXCOUNT = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        long[] deck = new long[N];
        long ANS = deck[0];
        for(int i=0; i<N; i++){
            deck[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(deck);
        for(int i=1; i<N; i++){
            if(deck[i] == deck[i-1]){
                cnt++;
            }else{
                cnt = 1;
            }
            if(cnt > MAXCOUNT){
                MAXCOUNT = cnt;
                ANS = deck[0];
            }
        }
        System.out.println(ANS);
    }
}
