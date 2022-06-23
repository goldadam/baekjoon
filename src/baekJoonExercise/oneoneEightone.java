package baekJoonExercise;
import java.util.ArrayList;
import java.util.Scanner;
public class oneoneEightone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String s = sc.nextLine();
            arr.add(i, s);
        }
        arr.iterator();
        for(String s : arr){
            System.out.println(arr.get(Integer.parseInt(s)));
        }

    }

}
