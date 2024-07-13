import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int max = 0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < M; j++) {
    		   visited[i][j] = true;
    		   dfs(i, j, map[i][j], 1);
    		   visited[i][j] = false;
    		   extra(i, j);
    	   }
       }
       
       System.out.println(max);
    }

    private static void dfs(int r, int c, int sum, int cnt) {
    	if(cnt == 4) {
    		max = Math.max(max, sum);
    		return;
    	}
    	
    	for(int i = 0; i < 4; i++) {
    		int nr = r + dr[i];
    		int nc = c + dc[i];
    		
    		if(nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
    			visited[nr][nc] = true;
    			dfs(nr, nc, sum + map[nr][nc], cnt + 1);
    			visited[nr][nc] = false;
    		}
    	}
    }

    private static void extra(int r, int c) {
    	if (r < N - 2 && c < M - 1)
            max = Math.max(max, map[r][c] + map[r + 1][c] + map[r + 2][c] + map[r + 1][c + 1]);

        if (r < N - 2 && c > 0)
        	max = Math.max(max, map[r][c] + map[r + 1][c] + map[r + 2][c] + map[r + 1][c - 1]);

        if (r < N - 1 && c < M - 2)
        	max = Math.max(max, map[r][c] + map[r][c + 1] + map[r][c + 2] + map[r + 1][c + 1]);

        if (r > 0 && c < M - 2)
        	max = Math.max(max, map[r][c] + map[r][c + 1] + map[r][c + 2] + map[r - 1][c + 1]);
    }

}