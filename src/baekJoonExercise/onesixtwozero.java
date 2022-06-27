package baekJoonExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class onesixtwozero {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //포켓몬의 갯수
        int M = Integer.parseInt(st.nextToken()); //맞춰야 하는 문제수
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String pokeMon = br.readLine();
            String num = Integer.toString(i+1);
            map.put(pokeMon, num);
            map.put(num, pokeMon);
        }
        for(int i=0; i<M; i++){
            sb.append(map.get(br.readLine()) + "\n");
        }
        System.out.println(sb);
    }
}
