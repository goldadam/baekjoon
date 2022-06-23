package baekJoonExercise;

import java.io.*;
import java.util.Arrays;

public class ninezerotwozero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T,N;
        int[] arr = new int[10002];
//        T = Integer.parseInt(br.readLine());
        for(int i =1; i<10001; i++){
            arr[i] = i;
        }

        for(int i =2; i<500; i++){
            int finalI = i;
            arr = Arrays.stream(arr).filter(p-> p% finalI != 0).toArray();
        }
        Arrays.stream(arr).forEach(System.out::println);



//        for(int i =0; i< T; i++){
//            N = Integer.parseInt(br.readLine());
//            arr = new int[N/2+1];
//
//        }

    }
}
