package baekJoonExercise;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static final int MAX_COUNT = 1000000;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        //구현할 것 : push/pop/Empty(isEmpty)/size/top
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > MAX_COUNT){
           System.out.println("이용범위 밖의 정수입니다");
           System.exit(0);
        }
        while(true){
            while(N >0) {
                String s = sc.next();

                switch (s) {
                    case "push":
                        int key = sc.nextInt();
                        list.add(0, key);
                        break;
                    case "pop":
                        if(!list.isEmpty()) {
                            int res = list.get(0);
                            System.out.println(res);
                            list.remove(0);
                        }else{
                            System.out.println(-1);
                        }
                        break;
                    case "top":
                        if(list.isEmpty()){
                            System.out.println(-1);
                        }else{
                            int res = list.get(0);
                            System.out.println(res);
                        }
                        break;
                    case "empty":
                        if(list.isEmpty()){
                            System.out.println(1);
                        }else{
                            System.out.println(0);
                        }
                        break;
                    case "size":
                        if(list.isEmpty()){
                            System.out.println("Stack is Empty!");
                        }else{
                            int listSize = list.size();
                            System.out.println(listSize);
                        }
                        break;
                    default:
                        System.out.println("잘못된 정보 출력됨");
                        break;
                    }
                    N--;
                if(N == 0){
                    System.out.println("종료됩니다");
                    System.exit(0);
                }
                }
        }
    }
}