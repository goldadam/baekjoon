package baekJoonExercise;

import java.util.Arrays;
import java.util.Scanner;

public class twoninetwozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0; i<8; i++){
            int k = sc.nextInt();
            k = arr[i];
        }
        int[] arrA = {1,2,3,4,5,6,7,8};
        int[] arrD = {8,7,6,5,4,3,2,1};
        if(Arrays.equals(arr, arrA)){
            System.out.println("ascending");
        }else if (Arrays.equals(arr, arrD)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }

}
