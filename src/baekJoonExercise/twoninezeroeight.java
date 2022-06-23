package baekJoonExercise;

import java.util.Scanner;
public class twoninezeroeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = fooCalculator(A);
        int b = fooCalculator(B);
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static int fooCalculator(int n){
        int a = n/100;
        n = n-a*100;
        int b = n/10;
        n = n-b*10;
        int c = n;
        int res = 100*c + 10*b + a;
        return res;
    }
}
