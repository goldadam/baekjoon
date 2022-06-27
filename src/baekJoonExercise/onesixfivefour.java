package baekJoonExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class onesixfivefour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken()); //갖고있는 랜선의 수
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 갯수
        int[] arr = new int[K];
        long max = 0;
        long min = 0;
        long mid = 0;
        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]){
                max = arr[i];
            }
        }
        max +=1;
        while(min < max){
            mid = (min + max) /2;
            long cnt = 0;
            for(int i=0; i < K; i++){
                cnt += (arr[i] / mid);
            }
            if(cnt < N){
                max = mid;
            }else{
                min = mid +1;
            }
        }
        System.out.println(min -1);

    }
}
