package baekJoonExercise;
import java.util.*;
public class onezeroeightthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        int S = sc.nextInt();
        int movCnt = 0, changeIdx = 0;
        while(movCnt < S && changeIdx < N-1){
            int maxNum = arr.get(changeIdx);
            int maxIdx = 0;
            int idx = changeIdx +1;
            int count = 1;
            while(movCnt + count <= S && idx < N){
                int num = arr.get(idx);
                if(num > maxNum){
                    maxNum = num;
                    maxIdx = idx;
                }
                count++;
                idx++;
            }
            if(maxIdx != -1){
                arr.remove(maxIdx);
                arr.add(changeIdx, maxNum);
                movCnt += maxIdx - changeIdx;
            }
            changeIdx++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr){
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}
