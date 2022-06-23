package baekJoonExercise;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class onezerotwofivezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int H, W, N; //W개의 방이 있는 H층의 건물
        for(int i=0;i<=K;i++){
            int sleep = 0; //들어가야 될 방
            H = sc.nextInt(); //호텔의 층수 1<=H
            W = sc.nextInt(); //호텔의 방수 W<=99
            N = sc.nextInt(); //몇번째 손님인지 1<=N<=H*W
            int cntH = 0;
            int cntW = 0;
            int[][] Hotel = new int[H][W];
            for (int j = 1; j <= H; j++) {
                for (int k = 1; k <= W; k++) {
                    Hotel[j][k] = j * 100 + k;
                }
            } //호텔 방 배정 끝.
            int a = H / N; //100의 자리 정하기
            int b = H % N; //1의 자리 정하기
            sleep = Hotel[a][b];



            //6, 12, 10 -> 6층에 12개의 방이 있고 10번째 손님이다...101 201 301 401 501 601 102 202 302 402 라서 402호에 들어가면됨
            //30 50 72 -> 30층짜리 50개의 뱡이 있고 72번째 손님이다 .. 마찬가지로 계산때리면 1203호에 들어가면 됨...
            System.out.println(sleep);
        }
    }
}
