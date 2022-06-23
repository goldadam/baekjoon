package baekJoonExercise;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


import static java.lang.Integer.parseInt;

public class Sugar {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            System.out.println(checkMatch(sc.next()));
        }
    }
    public static String checkMatch(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(stack.isEmpty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }

    }
}
