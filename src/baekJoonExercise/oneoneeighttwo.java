package baekJoonExercise;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class oneoneeighttwo {
    static int N;
    static int S;
    static int[] parArr;
    static int cnt=0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //1<=N<=20
        S = sc.nextInt(); //|S| <= 1,000,000
        parArr = new int[N];
        for(int i=0; i<parArr.length; i++){
            parArr[i] = sc.nextInt();
        }
        //합이 S가 되는 부분수열의 수..
//        int cnt = 0; //숫자 count
        dfs(0,0);
        if(S == 0){
            cnt--;
            System.out.println(cnt);
        }else{
            System.out.println(cnt);
        }

    }
    public static void dfs(int v, int s){
        if(v == N){
            if(s == S){
                cnt++;
            }
            return;
        }
        dfs(v+1, s+parArr[v]);
        dfs(v+1, s);
    }
}
