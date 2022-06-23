package baekJoonExercise;
import java.util.Scanner;
public class fourninefoureight {
    public static boolean[] isCheck = new boolean[246913];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getPrime();
        while(true){
            int cnt = 0;
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            for(int i=N+1; i<= 2*N; i++){
                if(!isCheck[i]) cnt++;
            }
            System.out.println(cnt);

        }
    }
    public static void getPrime() {

        isCheck[0] = isCheck[1] = true;

        for(int i = 2; i <= Math.sqrt(isCheck.length); i++) {
            if(isCheck[i]) continue;
            for(int j = i * i; j < isCheck.length; j += i) {
                isCheck[j] = true;
            }
        }
    }

}
