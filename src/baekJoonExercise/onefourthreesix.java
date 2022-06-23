package baekJoonExercise;
import java.util.Scanner;

public class onefourthreesix {
    public static void main(String[] args) {
        int theEnd = 666;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1;
        while(cnt != N){
            theEnd++;
            if(String.valueOf(theEnd).contains("666")){
                cnt++;
            }
        }
        System.out.println(theEnd);


    }
}
