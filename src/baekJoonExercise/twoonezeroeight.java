package baekJoonExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class twoonezeroeight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum=0;

        for(int i=0;i<N;i++){
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            sum += value;

        }
        Arrays.sort(arr);
        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;
        for(int i=0; i<N; i++){
            int jump = 0;
            int cnt = 1;
            int i_value = arr[i];
            for(int j= i+1; j < N; j++){
                if(i_value != arr[j]){
                    break;
                }
                cnt++;
                jump++;
            }
            if(cnt > mode_max){
                mode_max = cnt;
                mode = i_value;
                flag = true;
            }else if(cnt == mode_max && flag == true){
                mode = i_value;
                flag = false;
            }
            i += jump;
        }
        System.out.println((int)Math.round((double) sum / N));
        System.out.println(arr[N/2]);
        System.out.println(mode);
        System.out.println(arr[N-1] - arr[0]);
    }
//    public static int average(ArrayList<Integer> arr){
//        int res = 0;
//        for(int i=0;i<arr.size(); i++){
//            res += arr.get(i);
//        }
//        res /= arr.size();
//        res = Math.round(res);
//        return res;
//    }
//    public static int median(ArrayList<Integer> arr){
//        Collections.sort(arr);
//        int size = arr.size();
//        int med = arr.get(size/2);
//        return med;
//    }
//    public static int Mode(ArrayList<Integer> arr) {
//        int Mode = 0;
//        Collections.sort(arr);
//        int[] Arrays = new int[arr.size()];
//        for (int i = 0; i <= Arrays.length; i++) {
//            Arrays[i] = i;
//        }
//        for (int i = 0; i <= arr.size(); i++) {
//            if (arr.get(i) == Arrays[i]) { //그 값을 가진거 다 넣기..
//                Arrays[i] += 1;
//            }
//        }
//        return Mode;
//    }
//    public static int maxMinusMin(ArrayList<Integer> arr){
//        Collections.sort(arr);
//        int a = arr.size();
//        int b = arr.get(0);
//        int maxNum = arr.get(a);
//        int minNum = b;
//        int res = maxNum-minNum;
//        return res;
//    }
}
