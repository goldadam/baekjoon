package baekJoonExercise;
import java.util.Scanner;
public class onethreeonesix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//한번 나왔던 단어가 자기자리가 지난 뒤 또 나오면 카운트 세면 됨!
        boolean isCheck = false;
        int cnt = 0;
        for(int i=0;i<N; i++){
            String str = sc.nextLine();
            char[] arr = new char[str.length()];
            for(int j=0; j<=arr.length; j++){
                arr[j] = str.charAt(i);
            } //각각 문자열 배열 저장해놓은 것!

        }
    }
}
