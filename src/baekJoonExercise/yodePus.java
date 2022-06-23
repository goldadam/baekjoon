package baekJoonExercise;

import java.util.Scanner;
import java.util.LinkedList;

public class yodePus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i = 1; i<= N; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int index = 0;
        while(list.size() > 1){
            index = (index + (K-1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }
        sb.append(list.remove()).append('>');
        System.out.println(sb);
    }
}