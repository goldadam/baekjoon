package baekJoonExercise;
import java.util.Scanner;
public class onenineseveneight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i=0; i<N; i++){ //총 N개의 숫자들 들어감
            boolean isPrime = true;
            int j = sc.nextInt(); //그다음 판별할 소수
            if(j == 1){
                continue;
            }
            for(int k=2; k<=Math.sqrt(j); k++){
                if(j%k == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
