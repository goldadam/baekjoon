import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class onezeroonetwo {
    static int[][] baechu; //배추밭
    static boolean[][] check; //배추 있는지 체크
    static int side; //가로
    static int upside; //세로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            side = Integer.parseInt(st.nextToken());
            upside = Integer.parseInt(st.nextToken());
            baechu = new int[side][upside];
            check = new boolean[side][upside];

            int K = Integer.parseInt(st.nextToken());
            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                baechu[x][y] = 1; //배추 있다!
            }
            int cnt = 0;
            for(int j=0; j<side; j++){
                for(int k=0; k<upside; k++){
                    if(baechu[j][k] == 1 && !check[j][k]){
                        bfs(j, k);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    public static void bfs(int x, int y){
        int[] X = {0,0,-1,1};
        int[] Y = {-1,1,0,0};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        check[x][y] = true;

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int i=0; i<4; i++){
                int xOut=  poll[0] + X[i];
                int yOut = poll[1] + Y[i];

                if(xOut < 0 || x >= side || y < 0 || y >= upside){
                    continue;
                }
                if(baechu[xOut][yOut] == 1 && !check[xOut][yOut]){
                    queue.offer(new int[]{xOut, yOut});
                    check[xOut][yOut] = true;
                }
            }
        }
    }
}
