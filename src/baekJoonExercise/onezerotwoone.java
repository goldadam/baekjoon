package baekJoonExercise;
import java.util.Scanner;
import java.util.LinkedList;
public class onezerotwoone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int cnt = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Pick = new int [M];
        for(int i=1; i<=M; i++){
            deque.offer(i);
        }
        for(int j=0; j<M; j++){
            Pick[j] = sc.nextInt();
        }

        for(int i=0; i<M; i++){
            int target = deque.indexOf(Pick[i]);
            int halfTarget;

            if(deque.size()%2 == 0){
                halfTarget  = deque.size()/2 -1;
            }else{
                halfTarget = deque.size()/2;
            }
            if(target <= halfTarget){
                for(int k=0; k<target; k++){
                    int tmp = deque.pollFirst();
                    deque.offerLast(tmp);
                    cnt++;
                }
            }else{
                for(int l=0; l<deque.size()-target; l++){
                    int tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);


    }
}
