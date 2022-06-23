package baekJoonExercise;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class onezeroeightonefour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2];
        for(int i=0; i<N; i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt((o1[0]) )- Integer.parseInt(o2[0]);
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}
