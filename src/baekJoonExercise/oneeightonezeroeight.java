package baekJoonExercise;
import java.util.Scanner;
public class oneeightonezeroeight {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt = 0;
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            if(checked()){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean checked(){
        int prev = 0;
        boolean check[] = new boolean[26];
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(prev != now){
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;
                    prev = now;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}
