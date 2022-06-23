package baekJoonExercise;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class twoninefourone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String N = sc.nextLine();
        char[] arr = new char[N.length()];
        for(int i=0;i<N.length(); i++){
            arr[i] = N.charAt(i);
            for(int j=0; j<N.length(); j++){
                if(arr[i] == 'c' && arr[i+1] == '=' || arr[i] == 'c' && arr[i+1] == '-' ||
                arr[i] == 'd' && arr[i+1] == 'z' && arr[i+1] == '=' || arr[i] == 'd' && arr[i+1] == '-' ||
                        arr[i] == 'l' && arr[i+1] == 'j'  || arr[i] == 'n' && arr[i+1] == 'j' ||
                        arr[i] == 's' && arr[i+1] == '=' ||arr[i] == 'z' && arr[i+1] == '=' ){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
