package baekJoonExercise;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class onezerooneone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(String.valueOf(br.read()));
        int first = 1; //처음과 마지막은 어짜피 1만큼만 이동함
        int last = 1;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            int cnt = 0; //몇번 공간이동하는지 check용도
            int x = Integer.parseInt(String.valueOf(br.read()));
            int y = Integer.parseInt(String.valueOf(br.read()));
            int cal = y - x-2;
            int tot = 0;
            if(cal%2 == 0){
                cnt = (2 + y-x)/2;
            }else{
                cnt = (3 + y-x)/2;
            }
            arr[i] = cnt;
        }
        for(int j=0; j<N; j++){
            System.out.println(arr[j]);
        }
    }
}
