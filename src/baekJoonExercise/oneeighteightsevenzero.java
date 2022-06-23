package baekJoonExercise;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;


public class oneeighteightsevenzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arrSort = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        for(int i=0; i<N; i++){
            arr[i] = arrSort[i] = sc.nextInt();
        }
        Arrays.sort(arrSort); //arrSort배열 정렬함.
        int rank = 0;
        for(int j : arrSort){
            if(rankMap.containsKey(j) == false){
                rankMap.put(j, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k : arr){
            int cnt = rankMap.get(k);
            sb.append(cnt).append(' ');
        }
        System.out.println(sb);
    }
}
