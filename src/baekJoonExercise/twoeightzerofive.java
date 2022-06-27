package baekJoonExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class twoeightzerofive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //전체 나무의 수
        int M = Integer.parseInt(st.nextToken()); //얻고자 하는 나무의 값
        int[] tree = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        int max = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if(max < tree[i]){
                max = tree[i];
            }
        }

        while (min < max) {
            int mid = (max + min) /2;
            long sum = 0;
            for(int i : tree){
                if(i - mid > 0){
                    sum += (i - mid);
                }
            }
            if (sum < M){
                max = mid;
            }else{
                min = mid +1; //2진탐색 완료
            }
        }
        System.out.println(min -1);
    }
}
